package mcgonigleapps.wxtutor;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;

/*
 *
 *               WxTutor - ForecasterToolsFragment.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description: This fragment will convert between different units of measure for the user
 *               Temperature, speed, pressure and length are the types of values that will be utilized in this file
 *
 */

public class ForecasterToolsFragment extends Fragment{

    //Declare all of the input and output variables for this fragment
    TextView tempInput, tempOutput1, tempOutput2;
    TextView speedInput, speedOutput1, speedOutput2, speedOutput3, speedOutput4;
    TextView pressureInput, pressureOutput1, pressureOutput2;
    TextView lengthInput, lengthOutput1, lengthOutput2, lengthOutput3, lengthOutput4;
    Spinner tempSpinner, speedSpinner, pressureSpinner, lengthSpinner;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_forecaster_tools, container, false);

        //Set values for all of the input and output views
        tempInput = (TextView) view.findViewById(R.id.forecasterToolsTempInput);
        tempOutput1 = (TextView) view.findViewById(R.id.forecasterToolsTempOutput1);
        tempOutput2 = (TextView) view.findViewById(R.id.forecasterToolsTempOutput2);
        tempSpinner = (Spinner) view.findViewById(R.id.forecasterToolsTempSpinner);
        speedInput = (TextView) view.findViewById(R.id.forecasterToolsSpeedInput);
        speedOutput1 = (TextView) view.findViewById(R.id.forecasterToolsSpeedOutput1);
        speedOutput2 = (TextView) view.findViewById(R.id.forecasterToolsSpeedOutput2);
        speedOutput3 = (TextView) view.findViewById(R.id.forecasterToolsSpeedOutput3);
        speedOutput4 = (TextView) view.findViewById(R.id.forecasterToolsSpeedOutput4);
        speedSpinner = (Spinner) view.findViewById(R.id.forecasterToolsSpeedSpinner);
        pressureInput = (TextView) view.findViewById(R.id.forecasterToolsPressureInput);
        pressureOutput1 = (TextView) view.findViewById(R.id.forecasterToolsPressureOutput1);
        pressureOutput2 = (TextView) view.findViewById(R.id.forecasterToolsPressureOutput2);
        pressureSpinner = (Spinner) view.findViewById(R.id.forecasterToolsPressureSpinner);
        lengthInput = (TextView) view.findViewById(R.id.forecasterToolsLengthInput);
        lengthOutput1 = (TextView) view.findViewById(R.id.forecasterToolsLengthOutput1);
        lengthOutput2 = (TextView) view.findViewById(R.id.forecasterToolsLengthOutput2);
        lengthOutput3 = (TextView) view.findViewById(R.id.forecasterToolsLengthOutput3);
        lengthOutput4 = (TextView) view.findViewById(R.id.forecasterToolsLengthOutput4);
        lengthSpinner = (Spinner) view.findViewById(R.id.forecasterToolsLengthSpinner);


        //Set listener for spinner
        tempSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //"negative" will track whether the input number is negative, since the minus sign doesn't register as part of an double
                boolean negative=false;
                String input=tempInput.getText().toString();

                //Test if the input is negative, but ensure the string isn't empty first
                if(!isEmpty(input)&&isNegative(input)) {
                    negative=true;
                    input=input.substring(1);
                }

                //Check if the string is numeric based on the regex function isNumeric, and ensure that there aren't two minus signs in a row
                //if both conditions are met, update the temperatures when the spinner is selected
                if(isNumeric(input)&&!input.equals("-")) {
                    updateTemps(Double.parseDouble(input), negative, tempSpinner.getSelectedItem().toString(), tempOutput1, tempOutput2);
                }

                //After making a spinner selection, if there is no input, treat it as a 0.0 input
                if(isEmpty(input)) {
                    updateTemps(0.0, false, tempSpinner.getSelectedItem().toString(), tempOutput1, tempOutput2);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Set listener for spinner
        speedSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String input=speedInput.getText().toString();

                //Update output views if the string is numeric and not empty
                if (isNumeric(input) && !isEmpty(input)) {
                    updateSpeeds(Double.parseDouble(input), speedSpinner.getSelectedItem().toString(), speedOutput1, speedOutput2, speedOutput3, speedOutput4);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Set listener for spinner
        pressureSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String input=pressureInput.getText().toString();

                //Update output views if the string is numeric and not empty

                if (isNumeric(input) && !isEmpty(input)) {
                    updatePressures(Double.parseDouble(input), pressureSpinner.getSelectedItem().toString(), pressureOutput1, pressureOutput2);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Set listener for spinner
        lengthSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String input=lengthInput.getText().toString();

                //Update output views if the string is numeric and not empty

                if (isNumeric(input) && !isEmpty(input)) {
                    updateLengths(Double.parseDouble(input), lengthSpinner.getSelectedItem().toString(), lengthOutput1, lengthOutput2, lengthOutput3, lengthOutput4);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        // Create ArrayAdapters using the string arrays and default spinners
        ArrayAdapter<CharSequence> staticTempAdapter = ArrayAdapter.createFromResource(getContext(), R.array.forecasterToolsTempArray,
                        android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> staticSpeedAdapter = ArrayAdapter.createFromResource(getContext(), R.array.forecasterToolsSpeedArray,
                        android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> staticPressureAdapter = ArrayAdapter.createFromResource(getContext(), R.array.forecasterToolsPressureArray,
                android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> staticLengthAdapter = ArrayAdapter.createFromResource(getContext(), R.array.forecasterToolsLengthArray,
                android.R.layout.simple_spinner_item);

        // Apply the adapters to the spinners
        tempSpinner.setAdapter(staticTempAdapter);
        speedSpinner.setAdapter(staticSpeedAdapter);
        pressureSpinner.setAdapter(staticPressureAdapter);
        lengthSpinner.setAdapter(staticLengthAdapter);

        //Add listener for the temperature input
        tempInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String input=tempInput.getText().toString();

                //Input integrity constraints
                if(!isNumeric(input)&&!isEmpty(input.trim())&&!input.equals("-")) {
                    Toast.makeText(getContext(), "Your value must be numeric!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //negative tracks whether the input is negative
                boolean negative=false;
                String input=tempInput.getText().toString();

                //If the input is negative, remove the negative sign and set negative to true
                if(!isEmpty(input)&&isNegative(input)) {
                    negative=true;
                    input=input.substring(1);
                }

                //Integrity constraints
                if(isNumeric(input)&&!input.equals("-")) {
                    updateTemps(Double.parseDouble(input), negative, tempSpinner.getSelectedItem().toString(), tempOutput1, tempOutput2);
                }

                //If input is empty, treat as 0.0 and update output views
                if(isEmpty(input)) {
                    updateTemps(0.0, false, tempSpinner.getSelectedItem().toString(), tempOutput1, tempOutput2);
                }
            }
        });

        //Set listener for speed input
        speedInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String input=speedInput.getText().toString();

                //Integrity constraints
                if(!isNumeric(input)&&!isEmpty(input.trim())) {
                    Toast.makeText(getContext(), "Your value must be numeric!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String input=speedInput.getText().toString();

                //Update speed output view is integrity constraints are met
                if(isNumeric(input)) {
                    updateSpeeds(Double.parseDouble(input), speedSpinner.getSelectedItem().toString(), speedOutput1, speedOutput2, speedOutput3, speedOutput4);
                }

                //If input is empty, treat as 0.0 and update output views

                if(isEmpty(input)) {
                    updateSpeeds(0.0, speedSpinner.getSelectedItem().toString(), speedOutput1, speedOutput2, speedOutput3, speedOutput4);
                }
            }
        });

        //Add listener to pressure input view
        pressureInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String input=pressureInput.getText().toString();
                //Integrity constraints
                if(!isNumeric(input)&&!isEmpty(input.trim())) {
                    Toast.makeText(getContext(), "Your value must be numeric!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String input=pressureInput.getText().toString();

                //Update pressure output views after integrity constraints
                if(isNumeric(input)) {
                    updatePressures(Double.parseDouble(input), pressureSpinner.getSelectedItem().toString(), pressureOutput1, pressureOutput2);
                }

                //If input is empty, treat as 0.0 and update output views
                if(isEmpty(input)) {
                    updatePressures(0.0, pressureSpinner.getSelectedItem().toString(), pressureOutput1, pressureOutput2);
                }
            }
        });

        //Set listener for length input
        lengthInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String input=lengthInput.getText().toString();

                //Integrity constraints
                if(!isNumeric(input)&&!isEmpty(input.trim())) {
                    Toast.makeText(getContext(), "Your value must be numeric!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String input=lengthInput.getText().toString();

                //Update length output views after integrity constraints
                if(isNumeric(input)) {
                    updateLengths(Double.parseDouble(input), lengthSpinner.getSelectedItem().toString(), lengthOutput1, lengthOutput2, lengthOutput3, lengthOutput4);
                }

                //If input is empty, treat as 0.0 and update output views
                if(isEmpty(input)) {
                    updateLengths(0.0, lengthSpinner.getSelectedItem().toString(), lengthOutput1, lengthOutput2, lengthOutput3, lengthOutput4);
                }
            }
        });

        return view;
    }


    //This function will take the input number and use it along with the unit designated from the spinner to update the output views
    private void updateTemps(double input, boolean negative, String inputType, TextView outputText1, TextView outputText2) {

        DecimalFormat df1 = new DecimalFormat("#,##0.0");
        if(negative) {
            input=0-input;
        }

        switch (inputType) {
            case "°F":
                outputText1.setText(df1.format((input-32)*(5.0/9.0))+" °C");
                outputText2.setText(df1.format(((input-32)*(5.0/9.0))+273.15)+" °K");
//                Toast.makeText(getContext(), df1.format(input), Toast.LENGTH_SHORT).show();
                break;

            case "°C":
                outputText1.setText(df1.format(input*(1.8)+32)+" °F");
                outputText2.setText(df1.format(input+273.15)+" °K");
                break;

            case "°K":
                outputText1.setText(df1.format((input-273.15)*(1.8)+32)+" °F");
                outputText2.setText(df1.format(input-273.15)+" °C");
                break;

            default:
                break;

        }
    }

    //This function will take the input number and use it along with the unit designated from the spinner to update the output views
    public void updateSpeeds(double input, String inputType, TextView outputText1, TextView outputText2, TextView outputText3, TextView outputText4) {
        DecimalFormat df1 = new DecimalFormat("#,##0.0");

        switch (inputType) {
            case "MPH":
                outputText1.setText(df1.format(input*1.60934)+" KPH");
                outputText2.setText(df1.format(input*0.868976)+" Kts");
                outputText3.setText(df1.format(input*0.44704)+" MPS");
                outputText4.setText(df1.format(input*1.466667 )+" FPS");
//                Toast.makeText(getContext(), df1.format(input), Toast.LENGTH_SHORT).show();
                break;

            case "KPH":
                outputText1.setText(df1.format(input*0.621371 )+" MPH");
                outputText2.setText(df1.format(input*0.539957 )+" Kts");
                outputText3.setText(df1.format(input*0.277778 )+" MPS");
                outputText4.setText(df1.format(input*0.911344 )+" FPS");
                break;

            case "Knots":
                outputText1.setText(df1.format(input*1.150779 )+" MPH");
                outputText2.setText(df1.format(input*1.852 )+" KPH");
                outputText3.setText(df1.format(input*0.514444 )+" MPS");
                outputText4.setText(df1.format(input*1.68781 )+" FPS");
                break;

            case "MPS":
                outputText1.setText(df1.format(input*2.236936 )+" MPH");
                outputText2.setText(df1.format(input*3.6)+" KPH");
                outputText3.setText(df1.format(input*1.943844 )+" Kts");
                outputText4.setText(df1.format(input*3.28084 )+" FPS");
                break;

            case "FPS":
                outputText1.setText(df1.format(input*0.681818 )+" MPH");
                outputText2.setText(df1.format(input*1.09728 )+" KPH");
                outputText3.setText(df1.format(input*0.592484 )+" Kts");
                outputText4.setText(df1.format(input*0.3048 )+" MPS");
                break;

            default:
                break;

        }
    }

    //This function will take the input number and use it along with the unit designated from the spinner to update the output views
    public void updatePressures(double input, String inputType, TextView outputText1, TextView outputText2) {
        DecimalFormat df2 = new DecimalFormat("#,##0.0#");

        switch (inputType) {
            case "mb":
                outputText1.setText(df2.format(input*0.02953)+" \"Hg");
                outputText2.setText(df2.format(input*0.0145038)+" psi");
//                Toast.makeText(getContext(), df1.format(input), Toast.LENGTH_SHORT).show();
                break;

            case "\"Hg":
                outputText1.setText(df2.format(input*33.863947901411705743 )+" mb");
                outputText2.setText(df2.format(input*0.4911550394354353 )+" psi");
                break;

            case "psi":
                outputText1.setText(df2.format(input*68.94769760513823087 )+" mb");
                outputText2.setText(df2.format(input*2.03602 )+" \"Hg");
                break;

            default:
                break;

        }
    }

    //This function will take the input number and use it along with the unit designated from the spinner to update the output views
    public void updateLengths(double input, String inputType, TextView outputText1, TextView outputText2, TextView outputText3, TextView outputText4) {
        DecimalFormat df1 = new DecimalFormat("#,##0.0");

        switch (inputType) {
            case "m":
                outputText1.setText(df1.format(input*0.001)+" Km");
                outputText2.setText(df1.format(input*0.000539957)+" nm");
                outputText3.setText(df1.format(input*0.000621371)+" Mi");
                outputText4.setText(df1.format(input*3.2808388799999997 )+" Ft");
//                Toast.makeText(getContext(), df1.format(input), Toast.LENGTH_SHORT).show();
                break;

            case "Km":
                outputText1.setText(df1.format(input*1000.0)+" m");
                outputText2.setText(df1.format(input*0.53995663640604751876)+" nm");
                outputText3.setText(df1.format(input*0.62137100000000000666)+" Mi");
                outputText4.setText(df1.format(input*3280.83887999999979 )+" Ft");
                break;

            case "nm":
                outputText1.setText(df1.format(input*1851.9994270356480683 )+" m");
                outputText2.setText(df1.format(input*1.851999427035648127 )+" Km");
                outputText3.setText(df1.format(input*1.150779092000000059 )+" Mi");
                outputText4.setText(df1.format(input*6076.1136057599997002 )+" Ft");
                break;

            case "Mi":
                outputText1.setText(df1.format(input*1.6093435021075908065 )+" m");
                outputText2.setText(df1.format(input*1609.3435021075908935)+" Km");
                outputText3.setText(df1.format(input*0.86897597306025431418 )+" nm");
                outputText4.setText(df1.format(input*5279.9983664947203579 )+" Ft");
                break;

            case "Ft":
                outputText1.setText(df1.format(input*0.3047999057021952285 )+" m");
                outputText2.setText(df1.format(input*0.0003047999057021952285 )+" Km");
                outputText3.setText(df1.format(input*0.0001645787827765632903 )+" nm");
                outputText4.setText(df1.format(input*0.0001893938808000000145 )+" Mi");
                break;

            default:
                break;

        }
    }

    //This function checks to see if a string input is numeric
    private boolean isNumeric(String input) {
        String regex = "\\d+?(\\.)?(\\d+)?";
        return input.matches(regex);
    }

    //This function checks to see if a string input starts with a minus sign
    private boolean isNegative(String input) {
        if(input.charAt(0)=='-') {
            return true;
        }
        return false;
    }

    //This function checks to see if a string is empty
    private boolean isEmpty(String input) {
        return input.length()<1;
    }
}
