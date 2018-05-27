package mcgonigleapps.wxtutor;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/*
*
*               WxTutor - SingletonTestQuestions.java
*               Created by Dan McGonigle
*               Last Updated: 5/26/2018
*               Description: This class is used in conjunction with TestFragment.java class to display the comprehensive test.
*
 */

public class SingletonTestQuestions {
    //note the s prefix rather than m (static vs member), which allows the object to retain its state
    private static SingletonTestQuestions sSingletonTestQuestions;
    private List<testQuestion> mTestQuestions;
    private static final int TOTAL_QUESTIONS = 79;

    //This is a "Singleton" class, allows only one instance of itself to be created. get() returns it if exists, creates it if not
    //Singletons are good for storing a global object that can be used across activities and fragments
    //The get() method effectively acts as a constructor for this class, as the actual constructor is private
    public static SingletonTestQuestions get(Context context) {
        if(sSingletonTestQuestions==null) {
            sSingletonTestQuestions=new SingletonTestQuestions(context);
        }
        return sSingletonTestQuestions;
    }

    synchronized static void resetTheInstance(Context context){
        /*Reset the singleton state as you wish. just like you reinitialized*/
        sSingletonTestQuestions=new SingletonTestQuestions(context);
    }

    //The constructor for SingletonMainMenu is private
    //The for loop generates all of the Crimes in the list, then sets each equal Crime to "solved" and each 5th Crime to "Requires Police"
    private SingletonTestQuestions(Context context) {
        mTestQuestions=new ArrayList<testQuestion>();
        List<String> mAnswers = new ArrayList<String>();
        String mQuestion;
        testQuestion mTestQuestion;

        //      CREATE ALL OF THE TEST QUESTIONS!!!!!!!!!!
        mQuestion = "Why does the earth experience different seasons?";
        mAnswers = Arrays.asList("The earth is tilted at an angle of 23.5° from the plane of revolution around the sun",
                "The earth is tilted at an angle of 20.5° from the plane of revolution around the sun",
                "The earth is farther away from the sun during winter",
                "The sun gets hotter and cooler on a 365.24 day cycle",
                "The atmospheric carbon cycle",
                "Human activity",
                "Biological cycles of plants and trees",
                "The lunar cycle",
                "The earth is tilted at an angle of 30° from the plane of revolution around the sun");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "At what latitude can you find the tropic of cancer?";
        mAnswers = Arrays.asList("23.5°N", "15.5°N", "23.5°S", "15.5°S", "30°N", "30°S", "0°", "60°N", "60°S");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "At what latitude can you find the tropic of capricorn?";
        mAnswers = Arrays.asList("23.5°N", "15.5°N", "23.5°S", "15.5°S", "30°N", "30°S", "0°", "60°N", "60°S");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "Define air density.";
        mAnswers = Arrays.asList("The mass of the air in a given volume",
                "The mass of the Oxygen in a given volume",
                "The weight of the air",
                "The air's concentration of hydrogen",
                "The thickness of a volume of air",
                "The amount of water vapor in a volume of air",
                "The measure of air molecules",
                "The pressure caused by the column of atmosphere above a given air sample",
                "Gravity's influence on a given volume of air");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        //Q5
        mQuestion = "What effect will cooling a parcel of air have?";
        mAnswers = Arrays.asList("The air will become more dense, sink in the atmosphere and contract",
                "The air will become more dense, sink in the atmosphere and expand",
                "The air will become less dense, sink in the atmosphere and contract",
                "The air will become less dense, sink in the atmosphere and expand",
                "The air will become more dense, rise in the atmosphere and contract",
                "The air will become more dense, rise in the atmosphere and expand",
                "The air will become less dense, rise in the atmosphere and contract",
                "The air will become less dense, rise in the atmosphere and expand",
                "The air will increase in moisture content and become less dense");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "Which types of phase changes cause water to absorb heat from the atmosphere?";
        mAnswers = Arrays.asList("Vaporiation, Sublimation and Melting",
                "Vaporiation, Sublimation and Condensation",
                "Vaporiation, Sublimation and Deposition",
                "Freezing, Sublimation and Melting",
                "Freezing, Sublimation and Condensation",
                "Freezing, Deposition and Sublimation",
                "Sublimation, Condensation and Deposition",
                "Vaporization and Melting only",
                "Condensation and Freezing only");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What is convection?";
        mAnswers = Arrays.asList("The vertical transportation of heat through currents in the atmosphere",
                "The horizontal transportation of heat through currents in the atmosphere",
                "Heat transfer through direct contact",
                "Heat transfer through indirect contact",
                "Horizontal temperature exchange driven by wind",
                "Vertical temperature exchange driven by wind",
                "The effect that warm fronts have on low pressure systems",
                "The effect that cold fronts have on low pressure systems",
                "The intensification of a high pressure system");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What is advection?";
        mAnswers = Arrays.asList("Horizontal temperature exchange driven by wind",
                "The horizontal transportation of heat through currents in the atmosphere",
                "Heat transfer through direct contact",
                "Heat transfer through indirect contact",
                "Vertical transportation of heat through currents in the atmosphere",
                "Vertical temperature exchange driven by wind",
                "The effect that warm fronts have on low pressure systems",
                "The effect that cold fronts have on low pressure systems",
                "The intensification of a high pressure system");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What types of advection are meteorologists concerned with?";
        mAnswers = Arrays.asList("Temperature and Moisture",
                "Temperature only",
                "Moisture only",
                "Temperature, Moisture and Wind",
                "Moisture and Wind only",
                "Temperature and Wind only",
                "Wind only",
                "Jet Streams and Jet Maxima",
                "Occluded frontal systems");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        //Q10
        mQuestion = "How does the air circulation flow in the one-cell model?";
        mAnswers = Arrays.asList("Equatorward at the surface of the earth, and poleward aloft",
                "Poleward at the surface of the earth, and poleward aloft",
                "Equatorward at the surface of the earth, and equatorward aloft",
                "Poleward at the surface of the earth, and equatorward aloft",
                "East to west in the northern hemisphere, and west to east in the southern hemisphere",
                "East to west in the northern hemisphere, and east to west in the southern hemisphere",
                "West to east in the northern hemisphere, and west to east in the southern hemisphere",
                "West to east in the northern hemisphere, and east to west in the southern hemisphere",
                "Perpendicular to isobars");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "From which direction does wind flow in each cell of the three-cell model?";
        mAnswers = Arrays.asList("From east to west at the poles, west to east in the mid-latitudes, and east to west in the tropics",
                "From west to east at the poles, west to east in the mid-latitudes, and east to west in the tropics",
                "From west to east at the poles, east to west in the mid-latitudes, and east to west in the tropics",
                "From west to east at the poles, west to east in the mid-latitudes, and west to east in the tropics",
                "From east to west at the poles, east to west in the mid-latitudes, and east to west in the tropics",
                "From east to west at the poles, west to east in the mid-latitudes, and west to east in the tropics",
                "Cyclonically in the norhtern hemisphere and anticyclonically in the southern hemisphere",
                "Anticyclonically in the norhtern hemisphere and anticyclonically in the southern hemisphere",
                "Cyclonically in the norhtern hemisphere and cyclonically in the southern hemisphere");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "Why are frontal systems less intense in the southern hemisphere?";
        mAnswers = Arrays.asList("The southern mid-latitudes are more uniform because it is mostly ocean",
                "The southern mid-latitudes are more uniform because it is mostly land",
                "The southern polar region is more uniform because it is mostly ocean",
                "The southern polar region more uniform because it is mostly land",
                "The southern mid-latitudes are less uniform",
                "The El Nino Southern Oscillation prevents strong fronts",
                "The southern polar region is less uniform",
                "The North Atlantic Oscillation prevents strong fronts",
                "The southwest monsoon prevents strong fronts");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "Why are the northern hemisphere's mid-latitudes warmer than the southern hemisphere's mid-latitude region? during their" +
                "respective summers?";
        mAnswers = Arrays.asList("There is more land in the northern mid-latitudes",
                "There is less land in the northern mid-latitudes",
                "There is more land in the northern polar regions",
                "There is less land in the northern polar regions",
                "The El Nino effects influence the northern hemisphere more",
                "The La Nina effects influence the northern hemisphere more",
                "There are more people living in the northern hemisphere",
                "There are more people living in the southern hemisphere",
                "There are more deserts in the northern hemisphere");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What is the NETWCZ / ICTZ?";
        mAnswers = Arrays.asList("The area near the equator in which the easterly winds from the northern hemisphere and southern hemisphere converge",
                "The band of thunderstorms at the equator",
                "The band of higher pressure at the equator",
                "The area of higher heights at the equator",
                "A stationary front near the equator",
                "The boundary between the Ferrell and Hadley Cells",
                "The boundary between the Ferrell and Polar Cells",
                "The boundary between the Polar and Hadley Cells",
                "The jet stream near the equator");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        //Q15
        mQuestion = "What is lapse rate?";
        mAnswers = Arrays.asList("A change in temperature with height in the atmosphere",
                "A change in pressure with height in the atmosphere",
                "A change in moisture with height in the atmosphere",
                "A change in wind speed with height in the atmosphere",
                "A change in wind direction with height in the atmosphere",
                "The frequency of thunderstorms an area receives in a given month",
                "The frequency of rain showers an area receives in a given month",
                "The frequency of fog an area receives in a given month",
                "Layers in the atmosphere with lapses in cloud coverage");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What will happen to saturated (100% relative humidity) air as it ascends in the atmosphere?";
        mAnswers = Arrays.asList("It will cool by 1°C/kft and expand",
                "It will cool by 1°C/kft and contract",
                "It will warm by 1°C/kft and expand",
                "It will warm by 1°C/kft and contract",
                "It will cool by 3°C/kft and expand",
                "It will cool by 3°C/kft and contract",
                "It will warm by 3°C/kft and expand",
                "It will warm by 3°C/kft and contract",
                "It will cool by 2.2°C/kft and expand");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What will happen to dry air as it descends in the atmosphere?";
        mAnswers = Arrays.asList("It will warm by 3°C/kft and contract",
                "It will cool by 1°C/kft and expand",
                "It will cool by 1°C/kft and contract",
                "It will warm by 1°C/kft and expand",
                "It will warm by 1°C/kft and contract",
                "It will cool by 3°C/kft and expand",
                "It will cool by 3°C/kft and contract",
                "It will warm by 3°C/kft and expand",
                "It will cool by 2.2°C/kft and expand");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "Which of these tools would be best for predicting the intensity of a thunderstorm?";
        mAnswers = Arrays.asList("Skew-T Log P Diagram",
                "Surface Pressure Chart",
                "700mb upper air chart",
                "300mb upper air chart",
                "Satellite imagery",
                "Surface weather observations",
                "Pressure altimeter",
                "Anemometer",
                "Hodograph");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "When is air considered absolutely unstable?";
        mAnswers = Arrays.asList("When the lapse rate is greater than 3°C/kft",
                "When the lapse rate is less than 3°C/kft",
                "When the lapse rate is greater than 1°C/kft",
                "When the lapse rate is less than 1°C/kft",
                "When the lapse rate is greater than 2.2°C/kft",
                "When the lapse rate is less than 2.2°C/kft",
                "When the lapse rate is between 1°C/kft and 3°C/kft and the air is saturated",
                "When the lapse rate is between 1°C/kft and 3°C/kft and the air is unsaturated",
                "When there is fog");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        //Q20
        mQuestion = "When is air considered conditionally unstable?";
        mAnswers = Arrays.asList("When the lapse rate is between 1°C/kft and 3°C/kft and the air is saturated",
                "When the lapse rate is greater than 3°C/kft",
                "When the lapse rate is less than 3°C/kft",
                "When the lapse rate is greater than 1°C/kft",
                "When the lapse rate is less than 1°C/kft",
                "When the lapse rate is greater than 2.2°C/kft",
                "When the lapse rate is less than 2.2°C/kft",
                "When the lapse rate is between 1°C/kft and 3°C/kft and the air is unsaturated",
                "When there is fog");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What happens to absolutely stable surface air that is lifted to 2,000 feet?";
        mAnswers = Arrays.asList("It will descend back to the surface after the lifting mechanism is removed",
                "It will continue to rise after the lifting mechanism is removed",
                "It will remain at 2,000 feet after the lifting mechanism is removed",
                "It will become saturated after the lifting mechanism is removed",
                "It will become unstable",
                "It will become conditionally unstable",
                "It will rise and contract",
                "It will sink and expand",
                "Nothing");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "Where does the majority of weather occur within the atmosphere?";
        mAnswers = Arrays.asList("The troposphere",
                "The tropopause",
                "The stratosphere",
                "The stratopause",
                "The mesosphere",
                "The mesopause",
                "The thermosphere",
                "The thermopause",
                "The exosphere");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "In what layer of the atmosphere is the O-zone located?";
        mAnswers = Arrays.asList("The stratosphere",
                "The troposphere",
                "The tropopause",
                "The stratopause",
                "The mesosphere",
                "The mesopause",
                "The thermosphere",
                "The thermopause",
                "The exosphere");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What kinds of issues do the Van Allen radiation belts cause?";
        mAnswers = Arrays.asList("Damage to satellites from electric discharge and orbital problems from atmospheric drag",
                "Damage to the O-zone layer",
                "Atmospheric refraction",
                "Intense wind storms",
                "Heat waves due to intnse radiational heating",
                "None",
                "Impacts to commercial flights",
                "Impacts to military flights",
                "Impacts to commercial and military flights");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        //Q25
        mQuestion = "Which of the following effects does pressure gradient cause?";
        mAnswers = Arrays.asList("Pressure gradient drives wind",
                "Pressure gradient increases atmospheric density",
                "Pressure gradient decreases wind",
                "Pressure gradient causes thunderstorms",
                "Pressure gradient prevents thunderstorms",
                "Pressure gradient increases atmospheric stability",
                "Pressure gradient decreases atmospheric stability",
                "Pressure gradient increases temperature",
                "Pressure gradient decreases temperature");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What is a thermal gradient?";
        mAnswers = Arrays.asList("A change in temperature over horizontal distance",
                "A change in moisture over horizontal distance",
                "A change in moisture over vertical distance",
                "A warm pocket in the atmosphere",
                "A cold pocket in the atmosphere",
                "A convective current",
                "A change in wind speed over horizontal distance",
                "A change in wind speed over horizontal distance",
                "Either a warm or cold pocket in the atmosphere");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What are isobars?";
        mAnswers = Arrays.asList("Lines of equal pressure on a surface chart",
                "Lines of equal pressure on an upper air chart chart",
                "Lines of equal height on a surface chart",
                "Lines of equal height on an upper air chart",
                "Low pressure centers",
                "Low height centers",
                "High pressure centers",
                "High height centers",
                "Lines of equal temperature on a surface chart");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What is Newton's third law of motion?";
        mAnswers = Arrays.asList("For every action (force) in nature there is an equal and opposite reaction",
                "The velocity of an object changes when it is subjected to an external force",
                "Every object will remain at  rest or in uniform motion in a straight line unless compelled to change its state by the action " +
                        "of an external force",
                "Every action (force) in nature happens for a reason",
                "The acceleration of an object changes when it is subjected to an external force",
                "Every object will come to rest in a point of equillibrium if given enough time",
                "The entropy of a system will always increase",
                "The energy of a system is equivalent to its mass mutiplied by the square of the speed of light",
                "Objects with opposite properties will attract each other");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What is Newton's second law of motion?";
        mAnswers = Arrays.asList("The velocity of an object changes when it is subjected to an external force",
                "For every action (force) in nature there is an equal and opposite reaction",
                "Every object will remain at  rest or in uniform motion in a straight line unless compelled to change its state by the action " +
                        "of an external force",
                "Every action (force) in nature happens for a reason",
                "The acceleration of an object changes when it is subjected to an external force",
                "Every object will come to rest in a point of equillibrium if given enough time",
                "The entropy of a system will always increase",
                "The energy of a system is equivalent to its mass mutiplied by the square of the speed of light",
                "Objects with opposite properties will attract each other");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        //Q30
        mQuestion = "What is Newton's first law of motion?";
        mAnswers = Arrays.asList("Every object will remain at  rest or in uniform motion in a straight line unless compelled to change its state by the action " +
                        "of an external force",
                "The velocity of an object changes when it is subjected to an external force",
                "For every action (force) in nature there is an equal and opposite reaction",
                "Every action (force) in nature happens for a reason",
                "The acceleration of an object changes when it is subjected to an external force",
                "Every object will come to rest in a point of equillibrium if given enough time",
                "The entropy of a system will always increase",
                "The energy of a system is equivalent to its mass mutiplied by the square of the speed of light",
                "Objects with opposite properties will attract each other");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What do the contours on upper air charts represent?";
        mAnswers = Arrays.asList("Lines of equal height above mean sea level at which you would find a given pressure",
                "Lines of equal height above ground level at which you would find a given pressure",
                "Lines of equal pressure at a given height",
                "The Level of Non-Divergence (LND)",
                "The altimeter setting that pilots use to determine their altitude",
                "The value that pilots use to determine their bearing",
                "Thunderstorms",
                "The jet steam",
                "Jet maxima");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What are some of the standard pressure levels that are analyzed as upper air charts?";
        mAnswers = Arrays.asList("850mb, 700mb and 500mb",
                "900mb, 800mb, and 700mb",
                "900mb, 700mb, and 500mb",
                "950mb, 700mb, and 500mb",
                "950mb, 500mb, and 300mb",
                "1000mb, 800mb, and 600mb",
                "700mb, 650mb, and 600mb",
                "400mb, 300mb and 200mb",
                "300mb, 200mb and 100mb");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "By how much might an aircraft's actual altitude vary if the altimeter setting is off by 0.12\"Hg?";
        mAnswers = Arrays.asList("120 feet", "60 feet", "240 feet", "120 meters", "60 meters", "240 meters",
                "1.2 miles", "0.6 miles", "2.4 miles");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "Why is pressure significant to pilots?";
        mAnswers = Arrays.asList("When using instruments, it gives them their altitude",
                "When using instruments, it gives them their bearing",
                "When using instruments, it gives them their wind speed",
                "When using instruments, it gives them thunderstorm location",
                "When using instruments, it gives them thunderstorm intensity",
                "It is only significant if there are no clouds",
                "It is only significant if there is turbulence",
                "Pilots need to know the air pressure at all times",
                "When using instruments, it gives them their visibility");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        //Q35
        mQuestion = "What is the coriolis force?";
        mAnswers = Arrays.asList("An apparent force that causes wind to deflect to the right in both hemispheres",
                "An apparent force that causes wind to deflect to the left in both hemispheres",
                "An apparent force that causes wind to deflect to the right in the northern hemisphere",
                "An apparent force that causes wind to deflect to the left in the northern hemisphere",
                "The force of friction on an air parcel",
                "The apparent outward force of an air parcel moving through curved flow",
                "The gravitational force that pulls on an air parcel",
                "The inward force of an air parcel moving through curved flow",
                "The equal and opposite force to the pressure gradient force");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "How does the wind flow around pressure and height centers?";
        mAnswers = Arrays.asList("Counter-clockwise around lows and clockwise around highs in the northern hemisphere, " +
                "and clockwise around lows and counter-clockwise around highs in the southern hemisphere",
                "Counter-clockwise around lows and clockwise around highs in the northern hemisphere, " +
                        "and counter-clockwise around lows and clockwise around highs in the southern hemisphere",
                "Clockwise around lows and counter-clockwise around highs in the northern hemisphere, " +
                        "and clockwise around lows and counter-clockwise around highs in the southern hemisphere",
                "Clockwise around lows and counter-clockwise around highs in the northern hemisphere, " +
                        "and counter-clockwise around lows and clockwise around highs in the southern hemisphere",
                "Clockwise around lows and counter-clockwise around highs in both hemispheres",
                "Counter-clockwise around lows and clockwise around highs in both hemispheres",
                "Toward low centers in the northern hemisphere and away from low centers in the southern hemisphere",
                "Away from low centers in the northern hemisphere and toward low centers in the southern hemisphere",
                "Toward high centers in the northern hemisphere and away from high centers in the southern hemisphere");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What is Buy Ballot's Law?";
        mAnswers = Arrays.asList("When the wind is at your back, low pressure is to your left",
                "When the wind is at your back, low pressure is to your right",
                "For every action (force) in nature there is an equal and opposite reaction",
                "Every action (force) in nature happens for a reason",
                "The acceleration of an object changes when it is subjected to an external force",
                "Every object will come to rest in a point of equillibrium if given enough time",
                "The entropy of a system will always increase",
                "The energy of a system is equivalent to its mass mutiplied by the square of the speed of light",
                "Objects with opposite properties will attract each other");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What kind of weather is associated with high pressure centers?";
        mAnswers = Arrays.asList("Fair weather and clear skies",
                "Thunderstorms",
                "Persistent low visibility",
                "Hail",
                "Freezing rain",
                "Abundant cumuliform clouds",
                "Fair weather in the morning and fog in the afternoon",
                "The type of weather isn't dependent on the type of pressure system",
                "No weather at all");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What are examples of shallow pressure systems?";
        mAnswers = Arrays.asList("Polar highs, thermal lows and plateau highs",
                "Thermal highs, polar lows and plateau highs",
                "Mesohighs, thermal lows and plateau lows",
                "Polar highs, thermal lows and plateau lows",
                "Polar highs, thermal highs and plateau lows",
                "Sub-polar highs, thermal lows and plateau highs",
                "Sub-polar lows, thermal lows and plateau highs",
                "Subtropical highs, thermal lows and plateau highs",
                "Polar highs, thermal lows and subtropical highs");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        //Q40
        mQuestion = "What happens to air as it converges at the surface of the earth?";
        mAnswers = Arrays.asList("The air will be forced upward, cool and expand",
                "The air will be forced upward, cool and contract",
                "The air will be forced upward, warm and expand",
                "The air will be forced upward, warm and contract",
                "The air will be forced north, cool and expand",
                "The air will be forced north, cool and contract",
                "The air will be forced north, warm and contract",
                "Thunderstorms with hail will form",
                "Thunderstorms without hail will form");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What is the chimney effect?";
        mAnswers = Arrays.asList("Upward vertical motion caused by surface air converging around a low pressure center, causing a high height center aloft",
                "Upward vertical motion caused by surface air converging around a low pressure center, causing a low height center aloft",
                "Upward vertical motion caused by surface air diverging around a low pressure center, causing a high height center aloft",
                "Upward vertical motion caused by surface air diverging around a low pressure center, causing a low height center aloft",
                "Upward vertical motion caused by surface air converging around a high pressure center, causing a high height center aloft",
                "Upward vertical motion caused by surface air converging around a high pressure center, causing a low height center aloft",
                "Upward vertical motion caused by surface air diverging around a high pressure center, causing a high height center aloft",
                "Upward vertical motion caused by surface air diverging around a high pressure center, causing a low height center aloft",
                "Downward vertical motion caused by surface air converging around a low pressure center, causing a high height center aloft");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What type of effect is associated with diverging air at the surface of the earth?";
        mAnswers = Arrays.asList("Downward vertical motion, a low center aloft, and the damper effect",
                "Downward vertical motion, a high center aloft, and the damper effect",
                "Downward vertical motion, a low center aloft, and the chimney effect",
                "Downward vertical motion, a high center aloft, and the chimney effect",
                "Upward vertical motion, a low center aloft, and the damper effect",
                "Upward vertical motion, a high center aloft, and the damper effect",
                "Upward vertical motion, a low center aloft, and the chimney effect",
                "Upward vertical motion, a high center aloft, and the chimney effect",
                "Downward vertical motion above the level of non-divergence and upward vertical motion above it");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What are the ingredients required for thunderstorm development?";
        mAnswers = Arrays.asList("Shear, Moisture, Instability, Lift, and Exhaust",
                "Shear, Momentum, Instability, Lift, and Exhaust",
                "Stratus, Moisture, Instability, Lift, and Exhaust",
                "Shear, Moisture, Instability, Level of non-divergence, and Exhaust",
                "Shear, Momentum, Instability, Level of non-divergence, and Exhaust",
                "Shear, Moisture, Instability, Lift, and Extra-tropical cyclones",
                "Shear, Momentum, Instability, Lift, and Extra-tropical cyclones",
                "Shear, Moisture, Instability, Level of non-divergence, and Extra-tropical cyclones",
                "Shear, Momentum, Instability, Level of non-divergence, and Extra-tropical cyclones");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "Which of these features would you expect to find associated with the Bermuda-Azores high?";
        mAnswers = Arrays.asList("Long-wave ridging",
                "Long-wave troughing",
                "A warm front",
                "A cold front",
                "An occluded front",
                "A tropical cyclone",
                "A low height center aloft",
                "Troughing in the upper atmosphere",
                "A cold pocket in the upper atmosphere");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        //Q45
        mQuestion = "What would diverging air at the top of the troposphere cause?";
        mAnswers = Arrays.asList("Upward vertical motion, a high center aloft, and the chimney effect",
                "Downward vertical motion, a low center aloft, and the damper effect",
                "Downward vertical motion, a high center aloft, and the damper effect",
                "Downward vertical motion, a low center aloft, and the chimney effect",
                "Downward vertical motion, a high center aloft, and the chimney effect",
                "Upward vertical motion, a low center aloft, and the damper effect",
                "Upward vertical motion, a high center aloft, and the damper effect",
                "Upward vertical motion, a low center aloft, and the chimney effect",
                "Downward vertical motion above the level of non-divergence and upward vertical motion above it");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What is the level of non-divergence?";
        mAnswers = Arrays.asList("The level at which vertical motions are at their maximum and horizontal convergence and divergence are at " +
                "their minimum, typically 14,000ft or 600mb",
                "The level at which vertical motions are at their maximum and horizontal convergence and divergence are at " +
                        "their minimum, typically 10,000ft or 700mb",
                "The level at which vertical motions are at their minimum and horizontal convergence and divergence are at " +
                        "their maximum, typically 14,000ft or 600mb",
                "The level at which vertical motions are at their minimum and horizontal convergence and divergence are at " +
                        "their maximum, typically 10,000ft or 700mb",
                "The part of a frontal system where you are least likely to see thunderstorms",
                "The part of a frontal system where you are most likely to see thunderstorms",
                "The part of a frontal system where you are least likely to see tornadoes",
                "The part of a frontal system where you are most likely to see tornadoes",
                "The layer in the atmosphere that is in direct contact with the surface of the earth");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What are some examples of macroscale features?";
        mAnswers = Arrays.asList("Polar highs, sub-polar lows and sub-tropical highs",
                "Thermal highs, polar lows and plateau highs",
                "Mesohighs, thermal lows and plateau lows",
                "Polar highs, thermal lows and plateau lows",
                "Polar highs, thermal highs and plateau lows",
                "Sub-polar highs, thermal lows and plateau highs",
                "Sub-polar lows, thermal lows and plateau highs",
                "Subtropical highs, thermal lows and plateau highs",
                "Polar highs, thermal lows and subtropical highs");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "How do semi-permanent pressure systems move?";
        mAnswers = Arrays.asList("Sub-tropical highs move west in summer and east in winter, and sub-polar lows move east in summer and west in winter",
                "Sub-tropical highs move east in summer and west in winter, and sub-polar lows move east in summer and west in winter",
                "Sub-tropical highs move west in summer and east in winter, and sub-polar lows move west in summer and east in winter",
                "Sub-tropical highs move north in summer and south in winter, and sub-polar lows move east in summer and west in winter",
                "Sub-tropical highs move south in summer and north in winter, and sub-polar lows move east in summer and west in winter",
                "Sub-tropical highs move north in summer and south in winter, and sub-polar lows move north in summer and south in winter",
                "Sub-tropical highs move south in summer and north in winter, and sub-polar lows move south in summer and north in winter",
                "Sub-tropical highs move southwest in summer and northeast in winter, and sub-polar lows move east in summer and west in winter",
                "Sub-tropical highs move northwest in summer and southeast in winter, and sub-polar lows move east in summer and west in winter");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What type of weather is typically associated with the NETWCZ / ICTZ over land?";
        mAnswers = Arrays.asList("Thunderstorms and rain showers",
                "Persistent low visibility",
                "Fair weather and clear skies",
                "Hail",
                "Freezing rain",
                "Abundant stratiform clouds",
                "Fair weather in the morning and fog in the afternoon",
                "The type of weather isn't dependent on this feature",
                "No weather at all");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        //Q50
        mQuestion = "What type of weather is associated with a strong El Nino season?";
        mAnswers = Arrays.asList("Warmer temperatures in North America in the summer, with increased rainfall in many areas",
                "Cooler temperatures in North America in the summer, with increased rainfall in many areas",
                "Warmer temperatures in North America in the winter, with increased rainfall in many areas",
                "Cooler temperatures in North America in the winter, with increased rainfall in many areas",
                "Warmer temperatures in South America in the summer, with increased rainfall in many areas",
                "Cooler temperatures in South America in the summer, with increased rainfall in many areas",
                "Warmer temperatures in South America in the winter, with increased rainfall in many areas",
                "Cooler temperatures in South America in the winter, with increased rainfall in many areas",
                "Warmer temperatures in Asia in the summer, with increased rainfall in many areas");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "Where can you find long-wave ridges and troughs?";
        mAnswers = Arrays.asList("Ridges extend poleward from sub-tropical highs, and troughs extend equatorward from sub-polar lows",
                "Ridges extend equatorward from sub-tropical highs, and troughs extend poleward from sub-polar lows",
                "Ridges extend poleward from sub-tropical highs, and troughs extend poleward from sub-polar lows",
                "Ridges extend equatorward from sub-tropical highs, and troughs extend equatorward from sub-polar lows",
                "Ridges extend equatorward from sub-tropical lows, and troughs extend poleward from sub-polar highs",
                "Ridges extend poleward from sub-tropical lows, and troughs extend equatorward from sub-polar highs",
                "Ridges extend poleward from polar highs, and troughs extend equatorward from sub-polar lows",
                "Ridges extend poleward from polar lows, and troughs extend equatorward from sub-polar highs",
                "Ridges extend eastward from sub-tropical highs, and troughs extend westward from sub-polar lows");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What is the significance of amplitude and wave length in the long-wave pattern?";
        mAnswers = Arrays.asList("Increasing amplitude and decreasing wavelength causes weather systems to move more slowly and intensify",
                "Decreasing amplitude and decreasing wavelength causes weather systems to move more slowly and intensify",
                "Increasing amplitude and increasing wavelength causes weather systems to move more slowly and intensify",
                "Decreasing amplitude and increasing wavelength causes weather systems to move more slowly and intensify",
                "Increasing amplitude and decreasing wavelength causes weather systems to move more slowly and weaken",
                "Decreasing amplitude and decreasing wavelength causes weather systems to move more slowly and weaken",
                "Increasing amplitude and increasing wavelength causes weather systems to move more slowly and weaken",
                "Decreasing amplitude and increasing wavelength causes weather systems to move more slowly and weaken",
                "Increasing amplitude and decreasing wavelength causes weather systems to move more quickly and intensify");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What is a zonal pattern?";
        mAnswers = Arrays.asList("A long-wave pattern that has broad ridges and troughs with little amplitude, causing systems to remain weak and move quickly",
                "A long-wave pattern that has broad ridges and troughs with large amplitude, causing systems to remain weak and move quickly",
                "A long-wave pattern that has sharp ridges and troughs with little amplitude, causing systems to remain weak and move quickly",
                "A long-wave pattern that has sharp ridges and troughs with large amplitude, causing systems to remain weak and move quickly",
                "A long-wave pattern that has broad ridges and troughs with little amplitude, causing systems to intensify and move quickly",
                "A long-wave pattern that has broad ridges and troughs with large amplitude, causing systems to intensify weak and move quickly",
                "A long-wave pattern that has sharp ridges and troughs with little amplitude, causing systems to intensify and move slowly",
                "A long-wave pattern that has sharp ridges and troughs with large amplitude, causing systems to intensify and move slowly",
                "A long-wave pattern that has broad ridges and troughs with large amplitude, causing systems to remain weak and become stationary");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "Whatis a meridional pattern?";
        mAnswers = Arrays.asList("A long-wave pattern that has sharp ridges and troughs with large amplitude, causing systems to intensify and move slowly",
                "A long-wave pattern that has broad ridges and troughs with little amplitude, causing systems to remain weak and move quickly",
                "A long-wave pattern that has broad ridges and troughs with large amplitude, causing systems to remain weak and move quickly",
                "A long-wave pattern that has sharp ridges and troughs with little amplitude, causing systems to remain weak and move quickly",
                "A long-wave pattern that has sharp ridges and troughs with large amplitude, causing systems to remain weak and move quickly",
                "A long-wave pattern that has broad ridges and troughs with little amplitude, causing systems to intensify and move quickly",
                "A long-wave pattern that has broad ridges and troughs with large amplitude, causing systems to intensify weak and move quickly",
                "A long-wave pattern that has sharp ridges and troughs with little amplitude, causing systems to intensify and move slowly",
                "A long-wave pattern that has broad ridges and troughs with large amplitude, causing systems to remain weak and become stationary");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        //Q55
        mQuestion = "Which of these will intensify a long-wave trough?";
        mAnswers = Arrays.asList("Cold air advection aloft and divergence aloft",
                "Warm air advection aloft and divergence aloft",
                "Cold air advection aloft and convergence aloft",
                "Warm air advection aloft and convergence aloft",
                "Cold air advection aloft and divergence at the surface",
                "Warm air advection aloft and divergence at the surface",
                "Cold air advection aloft and convergence at the surface",
                "Warm air advection aloft and convergence at the surface",
                "Cold air advection at the surface and convergence aloft");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "Which of these will intensify a long-wave ridge?";
        mAnswers = Arrays.asList("Warm air advection aloft and convergence aloft",
                "Cold air advection aloft and convergence aloft",
                "Cold air advection aloft and divergence aloft",
                "Warm air advection aloft and divergence aloft",
                "Cold air advection aloft and divergence at the surface",
                "Warm air advection aloft and divergence at the surface",
                "Cold air advection aloft and convergence at the surface",
                "Warm air advection aloft and convergence at the surface",
                "Cold air advection at the surface and convergence aloft");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What is a jet stream?";
        mAnswers = Arrays.asList("Strong horizontal winds concentrated in narrow bands located at the top of the troposphere",
                "Strong vertical winds concentrated in narrow bands located at the top of the troposphere",
                "Strong horizontal winds concentrated in narrow bands located at the top of the tropopause",
                "Strong vertical winds concentrated in narrow bands located at the top of the tropopause",
                "Strong horizontal winds concentrated in narrow bands located at the top of the stratosphere",
                "Strong vertical winds concentrated in narrow bands located at the top of the stratosphere",
                "Strong horizontal winds concentrated in narrow bands located at the top of the stratopause",
                "Strong vertical winds concentrated in narrow bands located at the top of the stratopause",
                "Broad areas of weak winds in the upper atmosphere that transport moisture around the earth");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "Where can you find the Polar Front Jet (PFJ)?";
        mAnswers = Arrays.asList("At the top of the troposphere between the Polar and Ferrel cells",
                "At the top of the tropopause between the Polar and Ferrel cells",
                "At the top of the troposphere between the Polar and Hadley cells",
                "At the top of the tropopause between the Polar and Hadley cells",
                "At the top of the troposphere between the Ferrell and Hadley cells",
                "At the top of the tropopause between the Ferrell and Hadley cells",
                "At the top of the stratosphere between the Polar and Hadley cells",
                "At the top of the stratopause between the Polar and Hadley cells",
                "At the top of the mesosphere between the Polar and Ferrell cells");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What is a jet maximum?";
        mAnswers = Arrays.asList("A relatively small area along the jet core with stronger winds due to thermal instability",
                "A relatively large area along the jet core with stronger winds due to thermal instability",
                "The strongest jet stream in the northern hemisphere",
                "The strongest jet stream in the southern hemisphere",
                "The strongest jet stream in both hemispheres",
                "The northern-most point of the jet stream",
                "The southern-most point of the jet stream",
                "The highest point in the atmospher the jet stream reaches",
                "The lowest point in the atmospher the jet stream reaches");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        //Q60
        mQuestion = "Where do the most significant frontal systems occur in the northern hemisphere?";
        mAnswers = Arrays.asList("Along the Polar Front Jet in the Ferrell cell",
                "Along the Polar Front Jet in the Polar cell",
                "Along the Polar Front Jet in the Hadley cell",
                "Along the Sub-tropical Jet in the Ferrell cell",
                "Along the Sub-tropical Jet in the Hadley cell",
                "Along the Arctic Jet in the Ferrell cell",
                "Along the Arctic Jet in the Hadley cell",
                "Along the Arctic Jet in the Polar cell",
                "Along the Tropical Easterly Jet in the Ferrell cell");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What identifier would you give to an air mass that formed over the Pacific Ocean at 35° latitude (c=continental, m=maritime, A=arctic, P=polar, T=tropical)?";
        mAnswers = Arrays.asList("mT", "mP", "cT", "cP", "cA", "A", "P", "Not enough information", "mA");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What type of air mass might you find in northern Canada(c=continental, m=maritime, A=arctic, P=polar, T=tropical)?";
        mAnswers = Arrays.asList("cA", "mP", "cT", "cP", "mT", "A", "P", "Not enough information", "mA");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "On what meteorological scale are cold and warm fronts analyzed?";
        mAnswers = Arrays.asList("Synoptic", "Hemispheric", "Macroscale", "Mesoscale", "Microscale", "Globalscale", "Meso and Microscale", "Microscale and Macroscale", "All scales");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "Where would you expect to find a cold front associated with an unstable wave?";
        mAnswers = Arrays.asList("South of the low pressure center",
                "East of the low pressure center",
                "North of the low pressure center",
                "West of the low pressure center",
                "East of the warm front",
                "North of the warm front",
                "North of the high pressure center",
                "South of the high pressure center",
                "West of the high pressure center");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        //Q65
        mQuestion = "Where would you expect to find a warm front associated with an unstable wave?";
        mAnswers = Arrays.asList("East of the low pressure center",
                "South of the low pressure center",
                "North of the low pressure center",
                "West of the low pressure center",
                "West of the cold front",
                "North of the cold front",
                "North of the high pressure center",
                "South of the high pressure center",
                "West of the high pressure center");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What type of upper-level weather feature might cause a stable wave to develop into an unstable wave?";
        mAnswers = Arrays.asList("Major short-wave trough",
                "Major short-wave ridge",
                "Long-wave trough",
                "Long-wave ridge",
                "High height center",
                "Jet minimum",
                "Rex Block",
                "Omega block",
                "Sharp amplitude ridge");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What type of upper-level feature would you expect to support a baroclinic high pressure system?";
        mAnswers = Arrays.asList("Major short-wave ridge",
                "Major short-wave trough",
                "Long-wave trough",
                "Long-wave ridge",
                "Low height center",
                "Jet minimum",
                "Rex Block",
                "Jet maximum",
                "Sharp amplitude ridge");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What are diabatic effects?";
        mAnswers = Arrays.asList("Effects that an air parcel experiences due to the nature of the surface over which it travels",
                "Intensification due to atmospheric instability",
                "Weakening due to atmospheric stability",
                "Daily cyclical weather phenomena",
                "Intensification due to major short-wave troughs and ridges",
                "The decaying wave stage of a wave cyclone",
                "Effects that a baroclinic high has on a baroclinic low",
                "Temperature advection aloft",
                "Moisture advection at the surface");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What is baroclinicity?";
        mAnswers = Arrays.asList("The degree of dynamics a system possesses due to temperature advection",
                "The elasticity of of an air parcel",
                "The degree of dynamics a system possesses due to moisture content",
                "The degree of dynamics a system possesses due to pressure gradient",
                "An air parcel's measure of instability",
                "The likelihood of an air mass to produce thunderstorms",
                "The likelihood of an air mass to produce severe thunderstorms",
                "The likelihood of an air mass to produce hail",
                "The likelihood of wave cyclone formation");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        //Q70
        mQuestion = "What causes a wave cyclone to decay?";
        mAnswers = Arrays.asList("The upper level major short-wave trough support outruns the surface low pressure system",
                "The upper level major short-wave ridge support outruns the surface low pressure system",
                "The upper level major short-wave trough support outruns the surface high pressure system",
                "The upper level major short-wave ridge support outruns the surface high pressure system",
                "Cold air advection aloft",
                "Divergence aloft",
                "Warm air advection at the surface",
                "Convergence at the surface",
                "The major short-wave trough support intensifies");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "When would you expect to see an occluded frontal system associated with a wave cyclone?";
        mAnswers = Arrays.asList("During the Mature and Decaying wave phase",
                "During the unstable wave phase",
                "During the stable wave phase",
                "During the mature wave phase only",
                "During the decaying wave phase only",
                "During the unstable and mature wave phase",
                "During the stable and unstable wave phase",
                "During the stable and mature wave phase",
                "Throughout the entire life of the wave cyclone");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What is a wave cyclone?";
        mAnswers = Arrays.asList("A synoptic-scale baroclinic low pressure system",
                "A synoptic-scale barotropic low pressure system",
                "A synoptic-scale baroclinic high pressure system",
                "A synoptic-scale barotropic high pressure system",
                "A macro-scale baroclinic low pressure system",
                "A macro-scale barotropic low pressure system",
                "A macro-scale baroclinic high pressure system",
                "A macro-scale barotropic high pressure system",
                "A micro-scale barotropic low pressure system");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "How far upstream of a baroclinic high would a major short-wave ridge continue to strengthen the surface system?";
        mAnswers = Arrays.asList("150-350 miles", "100 miles", "500 miles", "Directly overhead", "50-150 miles", "50 miles",
                "300-500 miles", "10-20 km", "100-200 km");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What causes monsoons?";
        mAnswers = Arrays.asList("Thermal lows during summer causing the chimney effect resulting in abundant rain",
                "Thermal highs during summer causing the chimney effect resulting in abundant rain",
                "Thermal lows during winter causing the chimney effect resulting in abundant rain",
                "Thermal lows during winter causing the chimney effect resulting in abundant snow",
                "Thermal lows during summer causing the damper effect resulting in abundant rain",
                "Thermal lows during winter causing the damper effect resulting in abundant rain",
                "Intense cold fronts in the summer causing the chimney effect resulting in abundant rain",
                "Intense cold fronts in the winter causing the chimney effect resulting in abundant snow",
                "Intense cold fronts in the summer causing the damper effect resulting in abundant rain");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        //Q75
        mQuestion = "What is an example of a terrain-induced synoptic scale high pressure center?";
        mAnswers = Arrays.asList("A plateau high",
                "A mesohigh",
                "An unstable wave",
                "A decaying wave",
                "A mature wave",
                "The Bermuda-Azores High",
                "The Pacific High",
                "Buy Ballot's Law",
                "The Coriolis Force");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What is a blocking pattern?";
        mAnswers = Arrays.asList("A quasi-stationary barotropic system that prevents other weather systems from passing through a region.",
                "A quasi-stationary baroclinic system that prevents other weather systems from passing through a region.",
                "A mesoscale barotropic system that prevents other weather systems from passing through a region.",
                "A microscale baroclinic system that prevents other weather systems from passing through a region.",
                "A type of cold front that blocks weather features from passing",
                "A type of warm front that blocks weather features from passing",
                "A type of stationary front that blocks weather features from passing",
                "A type of jet stream that blocks weather features from passing",
                "An area of warm air advection that blocks weather features from passing");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What causes an Omega Block pattern?";
        mAnswers = Arrays.asList("A cut-off low in the upper atmosphere",
                "A cut-off low at the surface",
                "A cut-off high in the upper atmosphere",
                "A cut-off high at the surface",
                "A strong jet maximum",
                "Awarm front that blocks weather features from passing",
                "A stationary front that blocks weather features from passing",
                "A jet stream that blocks weather features from passing",
                "An area of moist air advection that blocks weather features from passing");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What causes a sea breeze?";
        mAnswers = Arrays.asList("A thermal low forming over land during the day, bringing in air from over the water",
                "A thermal low forming over water during the day, bringing in air from over land",
                "A thermal low forming over land at night, bringing in air from over the water",
                "A thermal low forming over water at night, bringing in air from over land",
                "A thermal high forming over land during the day, bringing in air from over the water",
                "A thermal high forming over water during the day, bringing in air from over land",
                "A thermal high forming over land at night, bringing in air from over the water",
                "A thermal high forming over water at night, bringing in air from over land",
                "A strong cold front");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);

        mQuestion = "What effect does a forest have on weather and climate?";
        mAnswers = Arrays.asList("Weaker winds, more moisture and less temperature variation",
                "Stronger winds, more moisture and less temperature variation",
                "Weaker winds, less moisture and less temperature variation",
                "Weaker winds, more moisture and more temperature variation",
                "Stronger winds, less moisture and less temperature variation",
                "Stronger winds, more moisture and more temperature variation",
                "Weaker winds, less moisture and more temperature variation",
                "No effect on winds, more moisture and less temperature variation",
                "Weaker winds, No effect on moisture and less temperature variation");
        mTestQuestion=new testQuestion();
        mTestQuestion.setmQuestion(mQuestion);
        mTestQuestion.setmAnswers(mAnswers, 0);
        mTestQuestions.add(mTestQuestion);
    }

    private int randInt(int min, int max) {
        Random rand=new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    //Get entire list
    public List<testQuestion> getTestQuestions() {
        List<testQuestion> twentyQuestions = new ArrayList<testQuestion>();
        int randomNum;
        boolean[] alreadySelected = new boolean[TOTAL_QUESTIONS];

        while(twentyQuestions.size()<20) {
            // nextInt is normally exclusive of the top value,
            // so add 1 to make it inclusive
            randomNum = randInt(0, TOTAL_QUESTIONS-1);
            Log.d("Randomize test qs", Integer.toString(randomNum));

            if(!alreadySelected[randomNum]) {
                twentyQuestions.add(mTestQuestions.get(randomNum));

                alreadySelected[randomNum]=true;
            }
        }

        return twentyQuestions;
    }

    //Get a specific Test Question based on the position
    public testQuestion getTestQuestion(int position) {
        return mTestQuestions.get(position);
    }

    //Brutal search for a specific test question based on the UUID
    public testQuestion getTestQuestion(UUID questionId) {
        for(int x=0;x<TOTAL_QUESTIONS;x++) {
            if(mTestQuestions.get(x).getmID()==questionId) {
                return mTestQuestions.get(x);
            }
        }
        return null;
    }
}
