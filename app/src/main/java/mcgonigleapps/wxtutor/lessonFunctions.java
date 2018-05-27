package mcgonigleapps.wxtutor;

/*
 *
 *               WxTutor - lessonFunctions.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description: This class houses static functions to populate the lesson fragment with the appropriate lesson and teaching
 *               steps based on the inputs of the main and sub menus.
 *
 */

public class lessonFunctions {

    //This static function returns the lesson title based on the menu and submenu selections
    public static String populateLessonTitles(int grandParentMenu, int parentMenu, int lessonNumber) {
        
        String title;
        
        switch (grandParentMenu) {
            case 0:
                switch (parentMenu) {
                    case 0:
                        //lesson title="A Bunch of Hot Air";
                        switch (lessonNumber) {
                            case 0:
                                title="Earth's Tilt: Reason for the Season";
                                break;

                            case 1:
                                title="Air Density";
                                break;

                            case 2:
                                title="Convection";
                                break;

                            case 3:
                                title="Conduction";
                                break;

                            case 4:
                                title="Advection";
                                break;

                            case 5:
                                title="Unequal Heating";
                                break;

                            case 6:
                                title="The One Cell Model";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 1:
                        //lesson title="Atmospheric Cells";
                        switch (lessonNumber) {
                            case 0:
                                title="Land/Water Distribution";
                                break;

                            case 1:
                                title="The Three Cell Model";
                                break;

                            case 2:
                                title="The Polar Cell";
                                break;

                            case 3:
                                title="The Ferrell Cell";
                                break;

                            case 4:
                                title="The Hadley Cell";
                                break;

                            case 5:
                                title="The Northern Hemisphere";
                                break;

                            case 6:
                                title="The Southern Hemisphere";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 2:
                        //lesson title="Atmospheric Lapse Rate";
                        switch (lessonNumber) {
                            case 0:
                                title="Defining Lapse Rate";
                                break;

                            case 1:
                                title="Dry and Moist Lapse Rates";
                                break;

                            case 2:
                                title="Skew-T Log P Diagram";
                                break;

                            case 3:
                                title="Absolute Stability";
                                break;

                            case 4:
                                title="Absolute Instability";
                                break;

                            case 5:
                                title="Conditional Stability";
                                break;

                            case 6:
                                title="Temperature Inversions";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 3:
                        //lesson title="Atmospheric Layers";
                        switch (lessonNumber) {
                            case 0:
                                title="The Troposphere";
                                break;

                            case 1:
                                title="The Stratosphere";
                                break;

                            case 2:
                                title="The Mesosphere";
                                break;

                            case 3:
                                title="The Thermosphere";
                                break;

                            case 4:
                                title="The Exosphere";
                                break;

                            case 5:
                                title="The Magnetosphere";
                                break;

                            case 6:
                                title="The Van Allen Radiation Belts";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 4:
                        //lesson title="Pressure and Gradient";
                        switch (lessonNumber) {
                            case 0:
                                title="Under Pressure";
                                break;

                            case 1:
                                title="Defining Gradient";
                                break;

                            case 2:
                                title="Isobars and Surface Pressure Charts";
                                break;

                            case 3:
                                title="Pressure Gradient Force and Wind";
                                break;

                            case 4:
                                title="Heights and Upper Air Charts";
                                break;

                            case 5:
                                title="Types of Pressure";
                                break;

                            case 6:
                                title="Pilots Under Pressure";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 5:
                        //lesson title="Coriolis Force";
                        switch (lessonNumber) {
                            case 0:
                                title="What is Coriolis Force?";
                                break;

                            case 1:
                                title="Why is Coriolis Force?";
                                break;

                            case 2:
                                title="How is Coriolis Force?";
                                break;

                            case 3:
                                title="The Numbers by Latitude";
                                break;

                            case 4:
                                title="Curving the Flow";
                                break;

                            case 5:
                                title="Cyclones and Anticyclones";
                                break;

                            case 6:
                                title="Buy Ballot's Law";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 6:
                        //lesson title="Highs and Lows";
                        switch (lessonNumber) {
                            case 0:
                                title="High Pressure Centers";
                                break;

                            case 1:
                                title="Low Pressure Centers";
                                break;

                            case 2:
                                title="High Height Centers";
                                break;

                            case 3:
                                title="Low Height Centers";
                                break;

                            case 4:
                                title="Shallow Systems";
                                break;

                            case 5:
                                title="Deep Systems";
                                break;

                            case 6:
                                title="Neutral Zones";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 7:
                        //lesson title="Convergence and Divergence";
                        switch (lessonNumber) {
                            case 0:
                                title="Convergence and Divergence Defined";
                                break;

                            case 1:
                                title="What happens to the [Mass of] Air?";
                                break;

                            case 2:
                                title="Vertical Motions";
                                break;

                            case 3:
                                title="Chimney and Damper Effects";
                                break;

                            case 4:
                                title="The Level of Non-Divergence";
                                break;

                            case 5:
                                title="Influence on Stability";
                                break;

                            case 6:
                                title="S. M. I. L. E.";
                                break;

                            default:
                                title="Error lesson number";
                                break;
                        }
                        break;

                    default:
                        title= "Error Parent Menu";
                        break;

                }
                break;

            case 1:
                switch (parentMenu) {
                    case 0:
                        //lesson title="Macroscale Features";
                        switch (lessonNumber) {
                            case 0:
                                title="Defining Macroscale";
                                break;

                            case 1:
                                title="Semi-Permanent Highs";
                                break;

                            case 2:
                                title="Semi-Permanent Lows";
                                break;

                            case 3:
                                title="Tying it into the Three Cell Model";
                                break;

                            case 4:
                                title="Seasonal Variations";
                                break;

                            case 5:
                                title="NETWCZ / ICTZ";
                                break;

                            case 6:
                                title="Oscillatory Patterns";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 1:
                        //lesson title="Long Wave Pattern";
                        switch (lessonNumber) {
                            case 0:
                                title="L/W Ridges and Troughs";
                                break;

                            case 1:
                                title="Amplitude";
                                break;

                            case 2:
                                title="Wavelength";
                                break;

                            case 3:
                                title="Zonal Pattern";
                                break;

                            case 4:
                                title="Meridional Pattern";
                                break;

                            case 5:
                                title="North American Seasonal Patterns";
                                break;

                            case 6:
                                title="Strengthening and Weakening Features";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 2:
                        //lesson title="Jet Streams";
                        switch (lessonNumber) {
                            case 0:
                                title="What is a Jet Stream?";
                                break;

                            case 1:
                                title="Where is a Jet Stream?";
                                break;

                            case 2:
                                title="Seasonal Variations";
                                break;

                            case 3:
                                title="The Polar Front Jet";
                                break;

                            case 4:
                                title="The Subtropical Jet";
                                break;

                            case 5:
                                title="The Arctic Jet";
                                break;

                            case 6:
                                title="Jet Maxima";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 3:
                        //lesson title="Air Masses";
                        switch (lessonNumber) {
                            case 0:
                                title="Defining Air Mass";
                                break;

                            case 1:
                                title="Air Mass Characteristics";
                                break;

                            case 2:
                                title="Two-Letter Codes";
                                break;

                            case 3:
                                title="North American Air Masses";
                                break;

                            case 4:
                                title="Air Masses and Semi-Permanent Pressure Systems";
                                break;

                            case 5:
                                title="Where Air Masses Meet";
                                break;

                            case 6:
                                title="Mobile Air Masses";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 4:
                        //lesson title="Synoptic Scale Systems";
                        switch (lessonNumber) {
                            case 0:
                                title="Defining Synoptic";
                                break;

                            case 1:
                                title="Fronts";
                                break;

                            case 2:
                                title="Major Shortwave Troughs";
                                break;

                            case 3:
                                title="Major Shortwave Ridges";
                                break;

                            case 4:
                                title="Back to the Jet Max";
                                break;

                            case 5:
                                title="Cyclones and Anticyclones";
                                break;

                            case 6:
                                title="Diabatic Effects";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 5:
                        //lesson title="Baroclinic Systems";
                        switch (lessonNumber) {
                            case 0:
                                title="Defining Baroclinicity";
                                break;

                            case 1:
                                title="Wave Cyclone Process - 1) Stable Wave Stage";
                                break;

                            case 2:
                                title="2) Unstable Wave Stage";
                                break;

                            case 3:
                                title="3) Mature Wave Stage";
                                break;

                            case 4:
                                title="4) Decaying Wave Stage";
                                break;

                            case 5:
                                title="Baroclinic Highs";
                                break;

                            case 6:
                                title="Major Shortwaves";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 6:
                        //lesson title="Barotropic Systems";
                        switch (lessonNumber) {
                            case 0:
                                title="Defining Barotropic";
                                break;

                            case 1:
                                title="Back to the Macroscale";
                                break;

                            case 2:
                                title="Above the LND";
                                break;

                            case 3:
                                title="Birth and Death of a Baroclinic High";
                                break;

                            case 4:
                                title="Terrain-Induced Highs and Lows";
                                break;

                            case 5:
                                title="Monsoons";
                                break;

                            case 6:
                                title="Blocking Patterns";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 7:
                        //lesson title="Mesoscale Effects";
                        switch (lessonNumber) {
                            case 0:
                                title="Defining Mesoscale";
                                break;

                            case 1:
                                title="Sea/Land Breezes";
                                break;

                            case 2:
                                title="Mountain/Valley Breezes";
                                break;

                            case 3:
                                title="Land/Water Distribution Effects";
                                break;

                            case 4:
                                title="Mesohighs and Mesolows";
                                break;

                            case 5:
                                title="Funneling";
                                break;

                            case 6:
                                title="Effects of Forests, Cities, Plains, etc";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    default:
                        title="Error Parent Menu";
                        break;

                }
                break;

            case 2:
                switch (parentMenu) {
                    case 0:
                        //lesson title="Precipitation";
                        switch (lessonNumber) {
                            case 0:
                                title="Defining Precipitation";
                                break;

                            case 1:
                                title="Rain";
                                break;

                            case 2:
                                title="Snow";
                                break;

                            case 3:
                                title="Sleet";
                                break;

                            case 4:
                                title="Freezing Rain";
                                break;

                            case 5:
                                title="Predicting Freezing Rain";
                                break;

                            case 6:
                                title="Rain, Snow and Thickness";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 1:
                        //lesson title="Hail";
                        switch (lessonNumber) {
                            case 0:
                                title="What is Hail?";
                                break;

                            case 1:
                                title="How Does Hail Form?";
                                break;

                            case 2:
                                title="Single Trip Theory";
                                break;

                            case 3:
                                title="Multi-Trip Theory";
                                break;

                            case 4:
                                title="Predicting Severe Hail";
                                break;

                            case 5:
                                title="Using Skew-T Log P Diagram";
                                break;

                            case 6:
                                title="Using Radar";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 2:
                        //lesson title="Tornadoes";
                        switch (lessonNumber) {
                            case 0:
                                title="What is a Tornado?";
                                break;

                            case 1:
                                title="The Enhanced Fujita Scale";
                                break;

                            case 2:
                                title="The Formation Theory";
                                break;

                            case 3:
                                title="Supercell Thunderstorms";
                                break;

                            case 4:
                                title="Tornadoes and Hurricanes";
                                break;

                            case 5:
                                title="Water Spouts";
                                break;

                            case 6:
                                title="Finding Tornadoes on Radar";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 3:
                        //lesson title="Down Bursts";
                        switch (lessonNumber) {
                            case 0:
                                title="Defining Down Bursts";
                                break;

                            case 1:
                                title="Microburst";
                                break;

                            case 2:
                                title="Macroburst";
                                break;

                            case 3:
                                title="Gust Front";
                                break;

                            case 4:
                                title="Thunderstorm Redevelopment";
                                break;

                            case 5:
                                title="Aviation Hazard";
                                break;

                            case 6:
                                title="Identify Down Bursts on Satellite";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 4:
                        //lesson title="Icing";
                        switch (lessonNumber) {
                            case 0:
                                title="What is Icing?";
                                break;

                            case 1:
                                title="Types and Severity of Icing";
                                break;

                            case 2:
                                title="Where to Find Icing";
                                break;

                            case 3:
                                title="Icing in Cold Fronts";
                                break;

                            case 4:
                                title="Icing in Warm Fronts";
                                break;

                            case 5:
                                title="General Temperature Ranges";
                                break;

                            case 6:
                                title="Icing in Thunderstorms";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 5:
                        //lesson title="Turbulence";
                        switch (lessonNumber) {
                            case 0:
                                title="What is Turbulence?";
                                break;

                            case 1:
                                title="Types of Turbulence";
                                break;

                            case 2:
                                title="Severity of Turbulence";
                                break;

                            case 3:
                                title="Turbulence Shear Categories";
                                break;

                            case 4:
                                title="Turbulence and Fronts";
                                break;

                            case 5:
                                title="Turbulence and Jet Streams";
                                break;

                            case 6:
                                title="Turbulence and Thunderstorms";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 6:
                        //lesson title="Tropical Weather";
                        switch (lessonNumber) {
                            case 0:
                                title="What are the Tropics?";
                                break;

                            case 1:
                                title="Tropical Waves";
                                break;

                            case 2:
                                title="Tropical Cyclones";
                                break;

                            case 3:
                                title="Stages of Cyclone Development";
                                break;

                            case 4:
                                title="Landfall";
                                break;

                            case 5:
                                title="Saffir Simpson Scale";
                                break;

                            case 6:
                                title="Monsoons";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    case 7:
                        //lesson title="Space Weather";
                        switch (lessonNumber) {
                            case 0:
                                title="The Interplanetary Magnetic Field";
                                break;

                            case 1:
                                title="Solar Flares";
                                break;

                            case 2:
                                title="Coronal Mass Ejections";
                                break;

                            case 3:
                                title="Filaments and Prominences";
                                break;

                            case 4:
                                title="The Solar and Hale Cycles";
                                break;

                            case 5:
                                title="Scintillation & Communications";
                                break;

                            case 6:
                                title="GPS and Satellite Tracking";
                                break;

                            default:
                                title="Error lesson number";
                        }
                        break;

                    default:
                        title="Error Parent Menu";
                        break;

                }
                break;

            default:
                title="Error Grandparent Menu";
                break;
        }
        return title;
    }

    //This static function returns the lesson text based on the menu and submenu selections
    public static String populateLessonTexts(int grandParentMenu, int parentMenu, int lessonNumber) {

        String text;

        switch (grandParentMenu) {
            case 0:
                switch (parentMenu) {
                    case 0:
                        //lesson text="A Bunch of Hot Air";
                        switch (lessonNumber) {
                            case 0:
                                //text="Earth's Tilt: Reason for the Season";
                                text="If you had to boil the cause of weather and climate down to a single word, it would be \"heating\".  " +
                                        "From the sun.  Differential heating from the sun due to differences in angular coverage that " +
                                        "are caused by the 23.5° tilt of the earth relative to the plane of rotation that the planets " +
                                        "inhabit around the sun.  Okay, that is more than one word, but that is the gist of it." +
                                        "\n\n" +
                                        "Essentially, differences in heating cause differences in density, and differences in density cause " +
                                        "differences in pressure.  We'll get more into pressure later, but the main idea is that higher " +
                                        "pressure \"presses\" toward lower pressure, which initiates motion in the atmosphere, a.k.a. wind." +
                                        "\n\n" +
                                        "The tropics of Cancer and Capricorn, sitting at 23.5° north and south respectively, represent the area " +
                                        "of the earth that sits directly underneath the sun during their hemisphere's respective summer " +
                                        "solstice.  That is the point at which their hemishere's days are longest.  Because the atmoshpere " +
                                        "takes some time to heat up and cool down - just like a pot of water - the hottest time of year " +
                                        "is generally the month or two after the summer solstice, which is on June 21st.";
                                break;

                            case 1:
                                //text="Air Density";
                                text="Density is a measure of how much mass you have in a given volume.  For instance, if you have a coffee cup " +
                                        "full of water, and a similar coffee cup full of lead, the lead is more dense because it has more mass.  " +
                                        "If you had a volume of lead and a volume of water trying to occupy the same space, the lead would " +
                                        "sink to the bottom due to its higher density.  The atmosphere works in the same way." +
                                        "\n\n" +
                                        "If you have more dense air and less dense air in the same region of the atmosphere, the more dense " +
                                        "air will sink to the bottom.  Think about the act of opening your freezer door.  You will often see " +
                                        "some steam or fog from the freezer drop toward the floor, which is because colder air (holding all " +
                                        "other variables constant) is more dense than warmer air.  Thinking about this from a molecular " +
                                        "standpoint, molecules that are cooler are less energetic, so they can pack in tighter as they don't " +
										"bounce around as much.  If you give or take enough of the energy from the molecules, " +
                                        "that is when you see phase changes.  The six types of phase changes we see in our atmosphere are " +
                                        "freezing, condensation, deposition (releasing energy into the atmosphere), melting, vaporization and " +
                                        "sublimation(absorbing heat from the atmosphere).";
                                break;

                            case 2:
                                //text="Convection";
                                text="One of the three main modes of heat transfer, convection results in a vertical transport of energy " +
                                        "through small-scale currents in the atmosphere.  We've already discussed how cold, dense air sinks, " +
                                        "and convection is the other side of that coin in warm, less dense air rising.  This is a typical day-" +
                                        "time occurrence that results from localized heating, where pockets of terrain or other areas that get " +
                                        "slightly more heating than their surroundings start to cause rising air that initiates currents in the " +
                                        "atmosphere." +
                                        "\n\n" +
                                        "If there is enough moisture in the air being lofted by convective currents, cumuliform clouds will " +
                                        "result.  If the currents are strong enough, the tops of the clouds will build up a significant charge " +
                                        "and lightning results.  We will discuss cloud types and the processes within cumulonimbus (thunderstorm) " +
                                        "clouds in a later lesson.  For now, just know that convection occurs due to small-scale differences " +
                                        "in heating, with warmer, less-dense air forming a lofting current or \"updraft\", and cooler, more " +
                                        "dense air sinking towards the surface of the earth.";
                                break;

                            case 3:
                                //text="Conduction";
                                text="Conduction is another type of heat transfer that occurs as the result of direct contact.  For instance, " +
                                        "if you accidentally touch the surface of a stove-burner that is currently on, some heat energy will be " +
                                        "transferred to your hand, likely resulting in some dead skin cells.  This process is conduction.  In " +
                                        "the lowest layer of the atmoshpere, the air that is in direct contact with the ground steals some of " +
                                        "heat from the ground during the day, and gives some back at night through conduction.  This is because " +
                                        "the ground heats up and cools much faster than the atmosphere.  An interesting result of this process " +
                                        "is the blue shimmering \"mirage\" that you see when looking at pavement on a hot summer day.";
                                break;

                            case 4:
                                //text="Advection";
                                text="The last method of heat transfer that we are going to discuss is the process of advection.  Advection " +
                                        "is the horizontal movement of temperature, moisture or any other property of the atmosphere by the " +
                                        "wind.  A great example of advection is the passing of a cold front, where colder and dryer air moves " +
                                        "into a locality with strong (typically northwesterly) winds.  Cold air advection and dry air advection " +
                                        "are both terms that are used in meteorology, typically accompanied by quantities that describe the " +
                                        "precise amount of advection that is occurring.  For instance, if the front is expected to cool your " +
                                        "town down by an average of 10 °F, you would say that you are expecting 10 °F of cold air advection " +
                                        "with the coming cold front.  Temperature and moisture are the most common properties that are associated " +
                                        "with advection.";
                                break;

                            case 5:
                                //text="Unequal Heating";
                                text="Now that we've discussed the main methods of heat transfer, we can begin to take a more holistic look at our " +
                                        "atmosphere here on earth.  In general, the closer we get to the poles, the less heat and energy from the " +
                                        "sun is hitting the surface area of the earth.  Once again, this is a result of angles and consequently " +
                                        "trigonometry.  Since more energy is being absorbed by the region of the earth near the equator than the " +
                                        "poles, we can generally say that the air at the poles is more dense and the air near the equator is less " +
                                        "dense.  If we think back to the way in which air behaves based on density, you'll remember that dense air " +
                                        "(at the poles) sinks, while less dense air (at the equator) rises.";
                                break;

                            case 6:
                                //text="The One Cell Model";
                                text="Let's take the picture we started describing in \"Unequal Heating\" a little bit further.  What happens " +
                                        "to the air at the equator as it rises?  Surely it must stop rising at some point, right?  Yes, it does, " +
                                        "and where that air stops rising is generally at the top of the troposphere, which is the layer of the " +
                                        "earth closest to the surface in which the vast majority of weather we are concerned with happens.  We " +
                                        "will discuss the layers of the atmosphere in a subsequent section.  " +
                                        "\n\n" +
                                        "Back to the rising air; what happens when it hits this \"ceiling\", so to speak?  Well, it is going to " +
                                        "spread out.  Some of it is going to move toward the south pole, and some of it will head toward the " +
                                        "north pole.  Picturing a two-dimentional cross-section representation of the earth, you can think of " +
                                        "each hemisphere (north and south) as having their own large-scale current of air that flows away from " +
                                        "the earth at the equator, moves poleward, sinks back to earth at the poles and then moves equatorward " +
                                        "along the surface of the earth.  This is of course a highly-simplified representation of how the " +
                                        "atmosphere behaves, and we will be refining it in the next section.";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 1:
                        //lesson text="Atmospheric Cells";
                        switch (lessonNumber) {
                            case 0:
                                //text="Land/Water Distribution";
                                text="We left off the last section letting you know that we would be refining the one-cell model.  One of the " +
                                        "main reasons the atmosphere doesn't follow this model is the distribution of land and water.  As you " +
                                        "know, differences in temperature drive weather, and it turns out that land and water tend to have vastly " +
                                        "different properties when it comes to heat and energy.  In general, land tends to heat up and cool down " +
                                        "approximately five times faster than oceans.  This of course depends on the type of terrain, depth of the " +
                                        "bodies of water, etc, but the difference is quite pronounced.  Just take a look at the National Data " +
                                        "Buoy Center's (NDBC) ocean surface temperatures in comparisons with surface observation temperatures " +
                                        "in the summer time and you will see this in action.  " +
                                        "\n\n" +
                                        "Furthermore, the amount of land at a given " +
                                        "latitude has a big impact on how the atmosphere is structured and the jet streams flow.  To give a " +
                                        "quick visual example of this effect, follow a line of latitude around the globe at 45°N, then follow " +
                                        "30°N and compare the amount of land that you come across.  Once again, land heats and cools faster " +
                                        "than water, so differences in the distribution of land and water are going to disturb the one-cell " +
                                        "model that we envisioned for the atmosphere in the last lesson.";
                                break;

                            case 1:
                                //text="The Three Cell Model";
                                text="As a consequence of the land/water distribution that we just discussed, each hemisphere (north and south) " +
                                        "has three cells.  The boundaries for each cell are approximately every 30°, with the northernmost " +
                                        "cell being from 60° to 90°N, another from 30° to 60°N, 0-30°N, and three similar cells in the southern " +
                                        "hemisphere." +
                                        "\n\n" +
                                        "In a holistic sense, you can still view the atmosphere as rising at the equator and heading poleward " +
                                        "along the top of the troposphere, descending at the poles and moving equatorward along the surface, but " +
                                        "there are additional effects that need to be considered at the boundardies of each of the new cells " +
                                        "we have just introduced.";
                                break;

                            case 2:
                                //text="The Polar Cell";
                                text="As you would probably guess, the two polar cells extend from 60°N and S to the north and south poles, " +
                                        "respectively.  The air is very cold and dense, and in general the entire atmosphere at the poles " +
                                        "is about 1/2 the height of the atmosphere at the equator.  Loosely, the atmosphere at the poles extends " +
                                        "5 miles above the surface while the atmosphere at the equator extends 10 miles.  This is a consequence " +
                                        "of warmer air wanting to expand because of the molecular effects of increased energy in a sample " +
                                        "volume." +
                                        "\n\n" +
                                        "The sinking air at the poles starts to head equatorward, with winds flowing from an easterly fetch.  " +
                                        "This is a good opportunity to discuss east/west-erly vs. east/west-ward.  In meteorology, we discuss " +
                                        "winds in terms of what direction they come from.  Easterly winds come from the east and flow west.  " +
                                        "West-ward is the direction toward which those winds coming from the east flow.  As these easterly winds " +
                                        "continue to move equatorward, they will eventually run into the boundary with the next cell, which " +
                                        "occurs around 60°N and S.  When this occurs, the air converges with the mid-latitude cell and starts " +
                                        "to rise, as though it has run into a wall.  Strong glacial winds are common, as the incredibly dense " +
                                        "air moves quite forcefully.";
                                break;

                            case 3:
                                //text="The Ferrell Cell";
                                text="The cells that occupy 30°N and S to 60°N and S are the Ferrell cells, named after a distinguished " +
                                        "amospheric scientist.  The mid-latitude \"Ferrell\" cells flow with a westerly wind direction.  " +
                                        "Inside the Ferrel cells, air rises around 60°N and S as it collides with the Polar Easterlies, as " +
                                        "discussed in the previous section.  As it hits the top of the troposphere, it spreads out and some of " +
                                        "it begins to head equatorward until it hits 30°.  Just like with the boundary of the Polar and Ferrell " +
                                        "cells, the air hits a boundary between the Ferrell and equatorial cells and when it does so, it sinks " +
                                        "back down to the surface of the earth.  When it hits the surface, it again begins to spread out in " +
                                        "either direction.  The air that begins to head poleward continues feeding into this Ferrell cell, " +
                                        "while the air that moves equatorward initates the Hadley Cell flow." +
                                        "\n\n" +
                                        "The Ferrell Cell tends to get the majority of the severe non-tropical weather.  ";
                                break;

                            case 4:
                                //text="The Hadley Cell";
                                text="All we have left now is the equatorial cell, otherwise known as the Hadley cell.  This region of the earth's " +
								"atmosphere sits between 30°N and S, spanning across the geographic and magnetic equators.  Interestingly, those " +
								"two features don't typically sit in the same location, and that is because the magnetic north and south poles are " +
								"geographically separated from the geographic poles.  In the northern hemisphere's summer, the magnetic equator " +
								"tends to meander between 05 and 10°N, and then to the south in the southern hemisphere's summer.  " +
								"\n\n" +
								"As for the wind flow, it all moves toward the equator from an easterly fetch, (called the Tropical Easterlies), " +
								"and meets in what is called the Near Equatorial Tradewind Convergence Zone (NETWCZ) or Intercontinental Tropical " +
								"Convergence Zone (ICTZ).  At the ICTZ, the air rises and spreads north and south once it reaches the top of the " +
								"troposphere.  When it approaches 30°N and S, it then starts to sink as it converges with air coming from the " +
								"Ferrell cell's upper level flow.";
								break;

                            case 5:
                                //text="The Northern Hemisphere";
                                text="You might think that the weather in the northern and southern hemispheres would be pretty similar given the " +
								"similar characteristics of the atmospheric cells we just described, but there is a key difference that causes " +
								"vastly different weather patterns between the two hemispheres.  If you remember back to \"Unequal Heating\", " +
								"recall that land heats and cools approximately 5 times faster than the oceans.  Now, take a look at a map of the " +
								"earth.  Notice that there is an extreme difference between the amount of land in the mid-latitudes of the northern " +
								"hemisphere as opposed to the southern hemisphere.  Due to the greater amount of land in the northern hemisphere's " +
								"mid-latitudes as opposed to the southern hemisphere, The amount of heating that it gets from the sun is greater " +
								"in each's respective season.  More energy means more intense storm systems, roughly speaking.  Frontal systems span " +
								"larger areas, have greater intensities of winds, and greater intensities of storms.  You'll see this erratic behavior " +
								"mirrored in the jet streams, which we will be learning about in the near future.";
								break;

                            case 6:
                                //text="The Southern Hemisphere";
                                text="Contrasting the northern hemisphere, the fact that the mid-latitudes contain pretty uniform oceanic conditions, " +
								"the weather that the southern hemisphere gets tends to be more uniform in nature.  The jet streams have a less " +
								"extreme pattern, and as a result the weather follows suit.  This discussion is exluding the severe weather that is " +
								"associated with tropical cyclones, which cause devastating weather in both the northern and southern latitudes in the " +
								"equatorial regions to the lower mid-latitudes.";
								break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 2:
                        //lesson text="Atmospheric Lapse Rate";
                        switch (lessonNumber) {
                            case 0:
                                //text="Defining Lapse Rate";
                                text="One of the main ways to determine and predict weather is to look at the stability of the atmosphere, and at the " +
								"level of basic physics, the lapse rate is one of the most important characteristics.  There are varying degrees of " +
								"stability that we will get into, but the basic definition of lapse rate is a change in temperature with height " +
								"in the atmosphere.  Typical lapse rates are measured in °F/km, °F/kft(thousand feet), °C/kft or °C/km.  To calculate " +
								"precisely the lapse rate, you take the temperature at the lower level that you are measuring and subtract the temperature " +
								"at the higher level of the atmosphere.  For instance, if the temperature at the surface is 80°F, and the temperature at " +
								"2,000 feet is 75°, the lapse rate is 5°F/kft.  If the temperature at 2,000 ft is 85°F, the lapse rate is -5°F/kft. " +
								"If the lapse rate is negative, we call this an inversion, because the temperature trend is inverted from typical " +
								"conditions in which the temperature falls as you ascend in the atmosphere.  " +
								"\n\n" +
								"The significance of lapse rate comes into play when discussing rising or sinking air.  We discuss rising and sinking air " +
								"in terms of a \"parcel\" of air, which you can think of simply as a volume of air the size of which is arbitrary.  " +
								"When that parcel of air is given a push in the vertical, atmospheric stability will determine whether that parcel keeps " +
								"ascending, if it stops, or if it drops back down to its original level.  You might be wondering why it matters whether " +
								"air continues rising, but think of it in context of a thunderstorm cloud.  Have you ever noticed how the tops of the " +
								"thunderstorm clouds look somewhat like popcorn, and they keep getting bigger and bigger?  This is a result of air that " +
								"continues rising after given an initial shove in the vertical.";
								break;

                            case 1:
                                //text="Dry and Moist Lapse Rates";
                                text="When the hypothetical parcel of air we discussed in the previous section ascends or descends in the atmosphere, " +
								"several things are going to happen.  With respect to the temperature, it is going to change at either the dry or moist " +
								"lapse rate.  If the air is saturated, which is to say that the relative humidity of the atmosphere through which the " +
								"parcel is moving is near 100%, the air will change by about 1°C/kft.  To put an illustration behind this, think about " +
								"the atmosphere on a cloudy, foggy day.  The air is completely saturated, and something comes along to give a parcel of " +
								"air upward in the atmosphere.  That air will cool off by about 1°C/kft.  If it starts out at the surface at 20°C and is " +
								"lofted to 3,000 feet, the temperature of that air parcel will be 17°C at 3,000 feet.  If the atmosphere were completely " +
								"dry, the temperature would change by about 3°C/kft, which is the dry lapse rate.  Given the same air parcel in a dry " +
								"atmosphere, it would cool off to 11°C at 3,000 feet from the original 20°C at the surface." +
								"\n\n" +
								"So far *we have just talked about rising air and how it cools as it rises.  You might be wondering why it cools down.  " +
								"That has to do with the density of the air as you move up in the atmosphere.  Those of you that have lived in high " +
								"terrain like the Rocky Mountains of the western U.S. or Himalayas of Asia might know that the air pressure is lower " +
								"the higher you go in the atmosphere.  This makes sense because there is less total air pushing down on you from the " +
								"atmosphere.  This means that the air can spread out more, because it has less pressure on it.  As an air parcel rises, " +
								"it starts to spread out.  At the molecular level, allowing the air to spread out means that the molecules are bumping " +
								"into each other less, and therefore cooler.  This is because temperature is simply a measure of the average movement " +
								"of molecules within a given volume." +
								"\n\n" +
								"You may be wondering what happens to an air parcel that is forced down toward the ground from aloft, since we've only " +
								"discussed rising air at this point.  Since rising air cools, does sinking air warm?  Yes, and for the same reasons " +
								"we mentioned in the previous paragraph.  As the air sinks, it has more pressure on it because there is more total air " +
								"in the atmosphere above it.  This means the volume of the air parcel shrinks, and the molecules are forced to bounce " +
								"off of each other more often.  An air parcel at 2,000 feet with a temperature of 15°C sinking in a dry environment " +
								"will reach a temperature of 21°C at the ground level.  If that air parcel were sinking in a moist environment, it would " +
								"reach a temperature of 13°C.";
								break;

                            case 2:
                                //text="Skew-T Log P Diagram";
                                text="The Skew-T Log P Diagram is one of the most complicated looking tools in meteorology, but it is also one of the " +
								"the most useful tools available for determining atmospheric stability and predicting the intensity of thunderstorms, " +
								"among many, many other things.  I am not going to get into great detail about the Skew-T in this module, but I highly " +
								"recommend that you take the time to try and learn about Skew-T at some point in order to truly be able to analyze and " +
								"predict weather.  What I will tell you about the Skew-T is this: the solid red lines that slant to the left are the " +
								"temperature lines, or \"isotherms\", and the scraggly looking thick solid red line that there is only one of is the " +
								"temperature reading that the weather sensors took as the balloon ascended the atmosphere.  These weather balloons (and  " +
								"sensors) are called \"Rawinsondes\", and you can read the temperature at any height by seeing what isotherm intersects " +
								"with the environmental temperature (thick scraggly line), then following that height to the side of the page where you " +
								"should see the height.";
								break;

                            case 3:
                                //text="Absolute Stability";
                                text="There are two conditions of absolute stability: absolutely stable and absolutely unstable.  Absolutely unstable " +
								"air occurs in an environment where the lapse rate is less than 1°C/kft, or the moist lapse rate.  To illustrate this, " +
								"I will give an example of surface air in a moist environment sitting at 20°C.  If the air at 1,000ft is also 20°C, " +
								"the lapse rate is 0°C/kft because 20-20=0.  Now, if we lift that moist air sitting at the surface, it will cool by the " +
								"moist lapse rate, or 1°C/kft.  By the time it gets to 1,000ft, it will cool to 19°C, while the rest of the air around " +
								"it at 1,000ft is 20°C.  Hence, the air parcel that has lifted is cooler than the surrounding air.  What happens to " +
								"cooler air once we have taken away the lifting mechanism?  It will sink, because it is more dense!  Just like the steam " +
								"from the freezer, it is going to sink back down until it can find equillibrium or reach the ground, whichever comes " +
								"first.  Absolutely stable air will always sink back down when lifted up.  There are several mechanism that can cause " +
								"lift.  Convection, or the currents of air caused by warming, typically from the sun, is one.  Another is frontal lift, " +
								"which occurs when a cold or warm front moves through the area and lifts the air ahead of it.  Terrain can also act as " +
								"a source of lift, as air moving up a mountain side is cooled at either the dry or moist lapse rate." +
								"\n\n" +
								"Notice that we only discussed the air rising in a moist lapse rate environment.  The reason for this is that the air " +
								"would be even more stable if our example was in a dry environment.  Lifting that 20°C parcel to 1,000ft would cool it " +
								"to 17°C, which is far cooler than the surrounding 20°C air, causing it to sink even more forcefully and quickly.  " +
								"Absolutely stable air is common in high pressure scenarios and on clear mornings, when the ground has cooled off " +
								"much more rapidly than the lower atmosphere."; 
								break;

                            case 4:
                                //text="Absolute Instability";
                                text="Absolutely unstable air results from an environmental lapse rate greater than 3°C/kft.  An example of this would be " +
								"20°C surface air, with 16°C air at 1,000ft.  As we lift dry 20°C surface air, it will cool to 17°C by the time that it " +
								"hits 1,000ft.  Since the surrounding air is 16°C, our 17°C air parcel is warmer than the surrounding air.  Warmer air " +
								"rises!  Our air parcel continues to ascend.  If we assume that the lapse rate of 4°C continued to 2,000ft, the surrounding " +
								"air would be 12°C.  Lifting our 17°C parcel from 1,000 to 2,000 would cool it by the dry lapse rate, which is again " +
								"3°C/kft, meaning that it would cool to 14°C while the surrounding air is 12°C.  Well, it is still warmer than the " +
								"surrounding environment, so it is going to continue to rise until it reaches equillibrium.  Typically, this is going to " +
								"happen relatively quick, as air that is absolutely unstable is fairly shallow and typically something you only find in " +
								"a desert environment.  Absolutely unstable air will cause a parcel that is lifted to continue rising until it reaches " +
								"equillibrium.";
								break;

                            case 5:
                                //text="Conditional Stability";
                                text="Absolute stability came about when the environmental lapse rate was either less than 1°C/kft or greater than 3°C/kft.  " +
								"Conditional stability occurs when the lapse rate is somewhere in between those two numbers.  There are two categories " +
								"of conditional stability, conditionally stable and conditionally unstable.  The condition upon which stability is " +
								"contingent is whether or not the air is saturated, or near 100% relative humidity.  Let's set the stage for both examples " +
								"by introducing our environmental lapse rate between 1°C and 3°C/kft.  An environment with a lapse rate of 2°C/kft will be " +
								"20°C at the surface, 18°C at 1,000ft and 16°C at 2,000ft.  " +
								"\n\n" +
								"Let's say our air is dry, meaning it will rise at the dry lapse " +
								"rate.  Since the dry lapse rate is 3°C/kft, our air parcel is going to be 17°C at 1,000 feet.  Our 17°C parcel is cooler " +
								"than its 18°C surroundings, so it is going to sink if we remove the lifting mechanism.  This is conditionally stable air, " +
								"and conditionally stable air returns to its original height after lifting ceases.  This occurs in unsaturated air." +
								"\n\n" +
								"Conditionally unstable air occurs when the air is saturated and the lapse rate falls between 1°C and 3°C/kft.  As this " +
								"air is lifted, it will cool at 1°C/kft, which is the moist lapse rate, and it will reach a temperature of 19°C at " +
								"1,000ft.  Since 19°C is warmer than the surrounding air, which is 18°C, the air will continue to rise.  At 2,000ft, we'll " +
								"see our parcel hit 18°C, which is now 2°C cooler than the 16°C surrounding air.  The parcel continues to rise, meaning " +
								"it is unstable." +
								"\n\n" +
								"One final thing that we need to talk about when discussing conditional stability is what happens to the moisture content " +
								"as the air rises.  The temperature at which a parcel of air becomes saturated is called the dew point temperature, and it " +
								"changes at the moist adiabatic lapse rate when an air parcel is lifted or forced downward.  When the temperature and " +
								"dew point temperature are equal, the parcel is said to be saturated.  Let's take the example of our 2°C/kft lapse rate " +
								"with a surface temperature of 20°C, with 18°C and 16°C at 1,000ft and 2,000ft, respectively.  If our surface parcel " +
								"has a dew point temperature of 16°C, the dew point will reach 15°C as the parcel hits 1,000ft, and the temperature " +
								"will hit 17°C since it is rising at the dry lapse rate.  This is conditionally stable air.  The parcel is still unsaturated, so the temperature will fall " +
								"by another 3°C up to 2,000ft, putting the temperature at 14°C.  The dew point temperature drops from 15°C at 1,000ft " +
								"to 14°C at 2,000ft, which is exactly what the temperature is.  The parcel is now saturated!  This means that the air " +
								"has become conditionally unstable, and it will continue to rise because the temperature is going to start decreasing by " +
								"1°C/kft from this point on, until the parcel hits equillibrium.";
								break;

                            case 6:
                                //text="Temperature Inversions";
                                text="If you've made it past the previous section, you deserve a cookie.  Please reward yourself accordingly.  We mentioned " +
								"temperature inversions earlier, which was when the temperature above is actually warmer than below rather than cooler.  " +
								"This can happen in several scenarios, with the most common occurring with night-time cooling ar \"radiation\" inversion).  " +
								"When the land cools more rapidly than the atmosphere above it, you might see a temperature of 15°C at the surface with 20°C " +
								"air at 1,000ft.  Subtracting the temperature at 1,000ft from the surface temperature, you get 15°C-20°C=(-05°C).  " +
								"Temperature inversions will always be negative, and they will always be absolutely stable.  Another type of inversion occurs " +
								"with frontal passage, and is called a frontal inversion.  The last type of inversion I will mention is a subsidence " +
								"inversion, which results from air being forced downward, typically associated with a high.";
								break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 3:
                        //lesson text="Atmospheric Layers";
                        switch (lessonNumber) {
                            case 0:
                                //text="The Troposphere";
                                text="The troposphere is where just about all of the weather that affects us on a day to day basis happens.  " +
                                        "Stretching from the surface of the earth up to anywhere between 5 and 10 miles, lower at the poles" +
                                        "and higher near the equator due to expanding warm air.  This portion of the Earth’s atmosphere " +
                                        "contains what we refer to as weather-producing features, including clouds, " +
                                        "precipitation, fronts, and other atmospheric phenomena.  The temperature " +
                                        "within the Troposphere cools with height by an average 2.2°C/kft.  The top of the first layer is " +
                                        "known as the " +
                                        "Tropopause.  The jet streams are found up against the stratopause in between atmospheric cells.";
                                break;

                            case 1:
                                //text="The Stratosphere";
                                text="The next layer of the Earth’s atmosphere is the stratosphere.  The stratosphere contains the ozone " +
                                        "layer, made up of tri-oxygen molecules, which absorbs incoming ultraviolet rays and acts as the " +
                                        "primary heat source for the " +
                                        "stratosphere.  Temperatures in the stratosphere warm with height, forming a strong temperature " +
                                        "inversion.  The top of the stratosphere is known as the stratopause, where the temperature stops warming.";
                                break;

                            case 2:
                                //text="The Mesosphere";
                                text="The third layer of the Earth’s atmosphere is the mesosphere.  This layer contains the Auroras, which " +
                                        "are reactions within earth's magnetic fields caused by charged particles that are drawn down toward " +
                                        "the earth.  The temperature cools with height in the mesosphere, and the top of this layer is known as the mesopause.";
                                break;

                            case 3:
                                //text="The Thermosphere";
                                text="Next up is the thermosphere.  It extends from the mesopause up to the " +
                                        "beginning of the exosphere.  The thermosphere contains most of the electrically charged molecules " +
                                        "in the atmosphere.  Temperatures in the thermosphere increase with height, forming an inversion " +
                                        "like in the stratosphere.";
                                break;

                            case 4:
                                //text="The Exosphere";
                                text="The final layer atmospheric layer is known as the exosphere, which extends from the " +
                                        "end of the thermosphere up to about 10,000 km/6,215 miles.  The temperature within the exosphere " +
                                        "cools with height, allowing atoms and molecules to escape into space.";
                                break;

                            case 5:
                                //text="The Magnetosphere";
                                text="The Magnetosphere is a magnetic field that is closest to the Earth at the magnetic Poles and has an " +
                                        "elliptical shape in the direction of the flow from the sun.  It stretches away from Earth over the " +
                                        "magnetic Equator on the far side of the earth, but it is compressed by the solar wind on the area " +
                                        "closest to the sun.  The magnetosphere is distorted by the interplanetary magnetic field, which is " +
                                        "what guides radiation from the sun toward and around the earth.  The magnetosphere consists of two " +
                                        "parts: the magneto head and the magneto tail.  One of the final lessones in this app discusses space " +
                                        "weather, which is caused by the interaction of the sun's charged particles and radiation with earth's " +
                                        "magnetic fields.";
                                break;

                            case 6:
                                //text="The Van Allen Radiation Belts";
                                text="Van Allen radiation belts are two zones of energetic charged particles that originate from the solar " +
                                        "wind and become trapped around the earth's magnetic field.  These belts cause issues for orbiting " +
                                        "satellites, sometimes causing damaging discharges and sometimes causing drag that will take the " +
                                        "satellite out of its normal orbit.";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 4:
                        //lesson text="Pressure and Gradient";
                        switch (lessonNumber) {
                            case 0:
                                //text="Under Pressure";
                                text="By this point, we've mentioned pressure several times as being significant to meteorology, but we haven't " +
                                        "quite nailed down why.  Let's start by defining atmospheric pressure, which is a measure of mass and " +
                                        "gravitational force over a given area.  Pressure is the force by which air is carried from place to " +
                                        "place, it is the force that pushes air aside or lofts it skyward, and it drives severe weather.  As a " +
                                        "reminder, pressure is generally driven by differences in heating." +
                                        "\n\n" +
                                        "Pressure can be measured in several different units.  Most people are familiar with PSI, or pounds " +
                                        "per square inch.  The standard atmospheric pressure at sea level is around 14.7PSI.  By another " +
                                        "measure, the standard SLP (sea level pressure) is 29.92 inches of mercury, or \"Hg.  This standard " +
                                        "of unit gets its origin from mercurial barometers.  That measure is more commonplace when dealing " +
                                        "with aviation.  When it comes to meteorology, millibars, or thousandths of a bar, is the standard " +
                                        "unit of measure.  1013.2mb is the standard SLP in this unit of measure.";
                                break;

                            case 1:
                                //text="Defining Gradient";
                                text="Pressure values by themselves don't tell the entire story of how the atmosphere will behave.  The driver " +
                                        "for weather is generally the differences in pressure that interacting air parcels contain.  Pressure " +
                                        "Gradient is the difference in pressure across a horizontal distance, which is typically measured " +
                                        "in the amount of millibar change per 50 or 100 miles." +
                                        "\n\n" +
                                        "Gradient may be a difficult term to understand immediately, but it is probably a term that you are " +
                                        "familiar with in some other area.  For instance, gradient is often a term used with reference to colors.  " +
                                        "An area of differing colors coming together is known as a color gradient.  Think of gradient simply as " +
                                        "the change in a value over a specified horizontal distance.  That value can be pressure, temperature, " +
                                        "moisture or any other meteorologically significant characteristic, and these each will give you " +
                                        "significant information about the state of the atmosphere.";
                                break;

                            case 2:
                                //text="Isobars and Surface Pressure Charts";
                                text="When we were discussing Skew-T charts, the word isotherm was mentioned.  An isotherm is a line of a " +
                                        "specified temperature, which is something that can be viewed in the vertical like in Skew-Ts, or in " +
                                        "the horizontal on a weather chart.  On a surface chart, you will typically see isotherms (0°C, 5°C, " +
                                        "10°C lines, etc) as well as isobars, which are lines of equal pressure.  The values on surface " +
                                        "pressure charts are typically every 4mb, with 1000mb, 1004mb, etc.  The surface pressure charts will " +
                                        "allow you to measure the strength of the winds, fronts, etc.";
                                break;

                            case 3:
                                //text="Pressure Gradient Force and Wind";
                                text="We left off the previous section mentioning that the pressure gradient can tell you how strong the wind " +
                                        "might be in a particular area.  The quantification of that value driving the winds is known as the " +
                                        "pressure gradient force.  It is difficult to determine the exact wind speed just by looking at a " +
                                        "surface pressure chart, but there are generally rules of thumb that work well in different regions.  " +
                                        "Some of the things that you have to take into account are terrain, land/water distribution, etc.  " +
                                        "Pressure gradient force(PGF) may drive the winds, but there are other forces at work.  To paint the picture, " +
                                        "PGF is a force acting on air that pushes it from higher pressure to lower pressure.  Acting counter " +
                                        "to this force is friction, which directly opposes the air's direction of motion.  Further still, there " +
                                        "is the Coriolis force, which is an apparent force that causes air to deflect toward the right from the " +
                                        "path that it is on.  Lastly, there is the centrifugal force, which is another apparent force that is " +
                                        "simply the inertia of the air parcel moving through curved flow.  It is helpful to refer back to " +
                                        "Newton's three laws of motion when visualizing the forces that act upon air parcels:\n" +
                                        "1)  Every object will remain at rest or in uniform motion in a straight line unless compelled to change its state by the action of an external force." +
                                        "2)  The velocity of an object changes when it is subjected to an external force. More specifically, F = M * A." +
                                        "3)  For every action (force) in nature there is an equal and opposite reaction.";
                                break;

                            case 4:
                                //text="Heights and Upper Air Charts";
                                text="Pressure helps us determine and predict the weather at the surface, but unfortunately it is not as " +
                                        "consistent when it comes to analyzing and predicting the atmosphere above the surface of the earth.  " +
                                        "In order to fully analyze the upper atmosphere, a different measure must be used; heights.  Heights " +
                                        "are the distance or length number in the vertical that corresponds to where a specific pressure value " +
                                        "can be found in a particular column of air.  Trying to elucidate this concept, imagine you have a " +
                                        "chart of the U.S. that contains lines corresponding to heights above MSL that correspond with exactly " +
                                        "where you can find 850mb in any location within the united states.  This chart will generate isopleths " +
                                        "of equal height that have high and low centers just like a surface pressure chart, but the values do " +
                                        "not correspond to pressure, since the pressure is the same for the entire map; it is the height above " +
                                        "MSL at which that pressure value can be found that varies across geographic regions.  For many high " +
                                        "and low pressure systems, there will be corresponding high and low height centers in the upper " +
                                        "atmosphere that are associated with these systems." +
                                        "\n\n" +
                                        "The standard atmospheric pressure values that you will see charts analyzed for are 1000mb, 925mb, " +
                                        "850mb, 700mb, 500mb, 300mb and 200mb.  The rough heights associated wtih these levels are MSL, 2,000ft, " +
                                        "4,500ft, 10,000ft, 18,000ft, 30,000ft, and 40,000ft, respectively.";
                                break;

                            case 5:
                                //text="Types of Pressure";
                                text="In meteorology, there are several different types of pressure that are significant.  We discussed SLP, " +
                                        "or sea level pressure, which is used as a reference for other pressure values.  The pressure that is " +
                                        "measured at each weather station across the world is station pressure, which will vary vastly from " +
                                        "location to location depending on the altitude of the weather station.  If you are familiar with " +
                                        "aviation, you may know what an altimeter is.  This is the device that tells the pilot at what height " +
                                        "they are flying, and it is based off of the SLP at a given location.  Altimeter settings are based on " +
                                        "the inches of mercury reference frame, and generally 0.01\"Hg corresponds with roughly 10ft.  This " +
                                        "means that a difference of 0.10\"Hg is 100ft of difference, and 1.00\"Hg would be 1,000ft.";
                                break;

                            case 6:
                                //text="Pilots Under Pressure";
                                text="You may have been able to discern the significance of pressure differences for aviators from the " +
                                        "previous paragraph, but in case you did not, I will explain.  Picture a miserable day in which it " +
                                        "has been drizzling non-stop since morning and you have not once seen the sun.  There are clouds in " +
                                        "every direction, and seemingly at every height.  In this type of weather, pilots rely on their " +
                                        "instruments to be able to navigate their plane, and to land and take off.  Now picture that we are " +
                                        "talking about the Hindu Kush mountain range in Asia, where there are mountains several miles up " +
                                        "throughout the region.  If the altimeter setting that a weather station is giving a pilot is off by " +
                                        "a mere 0.1\"Hg, that means the altitude of the aircraft they are flying might not have the clearance " +
                                        "over the mountains that they thought they had.  There have been many aviation mishaps through the " +
                                        "history of flight that can be attributed to dicey terrainous regions with extreme pressure situations.";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 5:
                        //lesson text="Coriolis Force";
                        switch (lessonNumber) {
                            case 0:
                                //text="What is Coriolis Force?";
                                text="You can't get a complete picture of how and why the atmosphere behaves the way it does without learning " +
                                        "about Coriolis force.  Interestingly enough, it really isn't a force.  Coriolis is an effect caused " +
                                        "by the fact that the earth is rotating in a clockwise fashion if you were to be looking down at the " +
                                        "north pole.  The effect that Coriolis causes is that moving air will deflect from its course toward " +
                                        "the right.  It will do so proportionally to the speed at which the air is moving as well as the " +
                                        "latitude of the air parcel.  The Coriolis effect is strongest at the poles.";
                                break;

                            case 1:
                                //text="Why is Coriolis Force?";
                                text="The earth rotates 360° of longitude in roughly 24 hours.  The atmosphere rotates with the earth, and " +
                                        "depending on what latitude your air parcel is at, it is going to be travelling at a different rate of " +
                                        "linear speed at a different latitude.  ";
                                break;

                            case 2:
                                //text="How is Coriolis Force?";
                                text="Let's put that last statement in geographic terms.  The circumference of the equator is about 25,000 miles, which means that the " +
                                        "earth at the equator is rotating underneath the atmosphere at rougly 1,000 miles per hour.  The earth " +
                                        "of course drags the atmosphere with it so that it for the most part follows with the rotation plus or " +
                                        "minus a dozen miles per hour close to the surface, depending on local and large-scale meteorological " +
                                        "effects.  So the air at the equator is moving 1,000mph with the earth. At 30°N or S latitude, the " +
                                        "circumference of the earth is 21,500 miles, which means that air is travelling with and around the earth " +
                                        "at 900mph as opposed to the equator's 1,000mph.  Now, picture a parcel of air moving north to the 30°N " +
                                        "line.  That parcel that was travelling 1,000mph is going to be moving much faster than the 900mph air and " +
                                        "earth at 30°N, which means that it will be farther east along the earth when it gets there.  This means " +
                                        "that the parcel will have looked like it deflected to the right from the perspective of its original " +
                                        "position at the equator, but really it was just an effect of the air moving faster than the region it was " +
                                        "moving into." +
                                        "\n\n" +
                                        "If we look at the opposite example of a parcel at 30°N that is moving south to the equator, its initial " +
                                        "speed will be 900mph, which will be much slower than the 1,000mph air toward the equator.  This means " +
                                        "that the earth, which will be moving 1,000mph, will be moving faster than the air, and the parcel will " +
                                        "end up farther west than the longitudinal line from which it originated.  This also looks like a " +
                                        "deflection to the right from the perspective of the original position.";
                                break;

                            case 3:
                                //text="The Numbers by Latitude";
                                text="I've already given you the circumference numbers for 0° and 30°, so here are a few more.  This info " +
                                        "is really just gee-whiz and will hopefully help you visualize the Coriolis effect if you are struggling " +
                                        "with it.\n" +
                                        "0°: 24,901 mile circumference, 1037mph linear speed" +
                                        "15°: 24,058 mile circumference, 1002mph linear speed" +
                                        "30°: 21,583 mile circumference, 899mph linear speed" +
                                        "45°: 17,637 mile circumference, 735mph linear speed" +
                                        "60°: 12,482 mile circumference, 520mph linear speed" +
                                        "75°: 6,465 mile circumference, 269mph linear speed" +
                                        "75°: 0 mile circumference, 0mph linear speed";
                                break;

                            case 4:
                                //text="Curving the Flow";
                                text="The examples that I gave to illustrate Coriolis were both of movement directly north or south, starting " +
                                        "out along a longitudinal line.  Please take my word for it that this effect occurs regardless of the " +
                                        "direction that an air parcel is moving.  The air parcel will always be deflected to the right, and " +
                                        "it will always be proportionally stronger as you get closer to the poles.  This perpetual curving is " +
                                        "the reason that air doesn't move directly from high pressure to low pressure in a straight line.  If " +
                                        "that were the case, the atmosphere would find equillibrium fairly quickly, and wind would move " +
                                        "perpendicular to isobard (lines of equal pressure).  As it happens, winds are actually mostly parallel " +
                                        "to the isobars, with means that while they move generally from higher pressure to lower pressure, it " +
                                        "takes the air a very long time to get there since it is moving in a direction that around the low " +
                                        "pressure center.";
                                break;

                            case 5:
                                //text="Cyclones and Anticyclones";
                                text="If you haven't seen a surface pressure chart yet, it would be in your best interest to check out out " +
                                        "to see the result of the Coriolis effect.  You will see elongated ellipse-shaped lines that bullseye " +
                                        "toward a low pressure center, and roughly the same thing but with far fewer lines around a high " +
                                        "pressure center.  These are called cyclones and anticyclones, respectively.  These somewhat circular " +
                                        "features can take many shapes and sizes, from a few miles across to entire countries and oceans, and " +
                                        "some of them stay still while others are highly transitory.";
                                break;

                            case 6:
                                //text="Buy Ballot's Law";
                                text="A result of what we have learned in this section comes in the form of Buy Ballot's Law.  In simple terms, " +
                                        "when the wind is at your back, the low pressure center is to your left.  This is not to say that it " +
                                        "is directly 90° perpendicular to your direction, but it is a general rule based on the fact that " +
                                        "wind moves parallel to isobars, and tends to cycle in toward a low pressure center.";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 6:
                        //lesson text="Highs and Lows";
                        switch (lessonNumber) {
                            case 0:
                                //text="High Pressure Centers";
                                text="A high pressure center is an area of atmosphere that resides on the surface of the earth and is more " +
                                        "dense than the surrounding air.  As previously stated, wind generally moves from higher pressure to " +
                                        "lower pressure.  The wind flowing out of a high pressure area circles around the center in a " +
                                        "clockwise motion in the northern hemisphere and counter-clockwise in the southern hemisphere.  " +
                                        "To simplify the direction, meteorologists refer to the motion around high pressure as anticyclonic " +
                                        "flow.  That way, it works regardless of what hemisphere we are discussing.  In general, the weather " +
                                        "around high pressure is pleasant with relatively clear skies.";
                                break;

                            case 1:
                                //text="Low Pressure Centers";
                                text="Since the weather around high pressure is pleasant, you might guess that the weather around low pressure " +
                                        "is generally less than pleasant, and you'd be mostly correct.  The wind flow around low pressure is " +
                                        "opposite that of high pressure, flowing in toward the center of the low in a counter-clockwise " +
                                        "fashion in the northern hemisphere.  This is cyclonic flow.  Winds near low pressure are generally " +
                                        "stronger than those near high pressure due to the fact that low pressure areas generally have a " +
                                        "stronger pressure gradient, which you would see by looing at  the number of isobars around the center " +
                                        "on a surface pressure chart.";
                                break;

                            case 2:
                                //text="High Height Centers";
                                text="We discussed heights in a previous lesson as being correlated with surface pressure features but " +
                                        "residing in the atmosphere above the surface of the earth.  Weather in the upper atmosphere often " +
                                        "drives a lot of what occurs at the surface, so the upper atmosphere is often a reflection or indication " +
                                        "of what is occurring down at our level.  An example of this can be seen in the Bermuda High, which " +
                                        "is a massive high pressure and high height system that sits off the southeast coast of the United " +
                                        "States.  At the surface, you see a high pressure center that has a maximum height value around 1030mb, " +
                                        "while you see high heights that sit almost directly on top of it throughout the rest of the upper " +
                                        "atmosphere.  The height centers are not always closed, which is to say that sometimes the higher " +
                                        "heights don't have a closed circular contour around them, but they may still contain higher heights " +
                                        "than the surrounding areas." +
                                        "\n\n" +
                                        "If you are still having difficulty grasping the concepts of high and low heights, try to picture " +
                                        "upper air charts (remember, you'll see these at 925mb, 850mb, 700mb, etc) as topographical maps, " +
                                        "envisioning the higher heights as mountain peaks and the lower heights as valleys.  While these " +
                                        "heights do not correspond with terrain, they correspond with the state of the atmosphere and tell us " +
                                        "how the weather should behave.  In general, higher heights correspond with clearer skies and better " +
                                        "weather.";
                                break;

                            case 3:
                                //text="Low Height Centers";
                                text="The low height centers are the valleys and bowls in our upper air constant pressure charts.  Let's give " +
                                        "an example: For instance, when a strong low pressure systen with a " +
                                        "massive frontal system develops, you will see low height centers at 925mb, 850mb, 700mb, and " +
                                        "sometimes 500 and 300mb.  The low height centers look similar to the circular bullseye of  isobars " +
                                        "that you see at the surface, they are just circular closed height contours instead of pressure.  " +
                                        "In the next section, we will discuss the vertical motions in the atmosphere that cause low pressure " +
                                        "to be associated with poorer weather.";
                                break;

                            case 4:
                                //text="Shallow Systems";
                                text="Sometimes, you don't get high heights above high pressure centers and you don't get low heights over " +
                                        "low pressure systems.  These types of systems are called shallow because they don't extend very " +
                                        "high into the atmosphere.  Remember that heights (the height at which you would find a given pressure " +
                                        "value above the surface of the earth) are driven by temperature; a warmer column of air expands " +
                                        "upward, while a cooler column of air compresses toward the surface because it is more dense.  An " +
                                        "example of a very shallow system would be the polar high.  There is a high pressure system that sits " +
                                        "over each of the polar regions of the earth, an area of very cold, dense air.  Because the air is " +
                                        "cold, the heights in the upper atmosphere sag and actually cause low height centers, which sit " +
                                        "directly over the high pressure at the surface.  You might wonder what kind of weather you get with " +
                                        "a system like this since we just said that highs are associated with good weather and lows with bad " +
                                        "weather.  The answer is clear, very, very cold good weather.  It is the high pressure at the surface " +
                                        "that acts as the predominant feature." +
                                        "\n\n" +
                                        "Another example of a shallow system is the low pressure center that forms in desert regions due to " +
                                        "intense surface heating in the summer time.  We call these systems thermal lows.  Because of the " +
                                        "intense heating, the surface air starts to expand because warmer air wants to spread out.  As the air " +
                                        "expands, it becomes less dense and rises, causing a low pressure region at the surface.  In the " +
                                        "atmosphere above the low pressure center, you see the air continuing to expand aloft, which means " +
                                        "that it is causing higher heights aloft.  It is not uncommon to see a high height center " +
                                        "superimposed on a low pressure center at the surface of the earth.";
                                break;

                            case 5:
                                //text="Deep Systems";
                                text="Deep systems are those that have similar pressure characteristics at the surface ane height " +
                                        "characteristics aloft.  The Bermuda High example that we gave above is an excellent example of a " +
                                        "deep system, as there are higher heights superimposed over a high pressure system at the surface of " +
                                        "the earth.";
                                break;

                            case 6:
                                //text="Neutral Zones";
                                text="A neutral zone is a transitional pressure or height area in between two like systems.  For instance, " +
                                        "between two high pressure areas, you may have a neutral zone in which the flow becomes very weak.  " +
                                        "These regions tend to become elongated and distorted, and don't necessarily have a normal shape that " +
                                        "you find on a surface chart.  This occurs because of the fluidity of the atmosphere.";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 7:
                        //lesson text="Convergence and Divergence";
                        switch (lessonNumber) {
                            case 0:
                                //text="Convergence and Divergence Defined";
                                text="Simply put, convergence is air coming together by way of the wind, and divergence is air spreading out.  " +
                                        "there are two types of convergence and divergence that meteorologists tend to focus on, speed and " +
                                        "direction.  For speed convergence, you can picture two cars on the highway as our parcels of air.  " +
                                        "They are both moving in the same direction.  The parcel of air in the rear is travelling 70mph, while " +
                                        "the parcel of air that is leading is moving 60mph.  Pretty soon, those cars, or parcels of air, are " +
                                        "going to come together and crash.  They are said to possess speed convergence.  If we flip this scenario, " +
                                        "putting the faster car in front, they are going to keep separating, resulting in speed divergence." +
                                        "\n\n" +
                                        "Directional convergence is often subtle.  The winds do not have to be diametrically opposed in direction " +
                                        "to be considered converging.  Two parcels of air side-by-side could be moving in the same general " +
                                        "direction, but if they are not completely parallel in their motion they could either be coming " +
                                        "together or moving apart.  This is directional convergence and divergence.  ";
                                break;

                            case 1:
                                //text="What happens to the [Mass of] Air?";
                                text="So if air comes together or spreads apart, what happens?  Can converging air all fit in the same area " +
                                        "that the air parcels are trying to move into?  In short, it has to go somewhere, and depending on " +
                                        "what part of the atmosphere we are discussing, the air could be forced to ascend or descend.";
                                break;

                            case 2:
                                //text="Vertical Motions";
                                text="Let's begin by discussing converging air at the surface.  We just said that the air has to go somewhere, " +
                                        "and since it can't go down when it is already at the surface, it is forced aloft.  Conversely, if " +
                                        "we are discussing diverging air at the surface, or air that is spreading apart, some air has to come " +
                                        "in to replace it.  The atmosphere always wants to try and find equillibrium, and this is what causes " +
                                        "these motions.  The air that replaces divergent surface air is going to come from aloft, therefore " +
                                        "it will be sinking air from above." +
                                        "\n\n" +
                                        "Let's take our examples to the other extreme and say we have converging air at the top of the " +
                                        "troposphere, which is where we find our jet streams.  The top of the troposphere (tropopause) acts as " +
                                        "a ceiling for air, and therefore typically doesn't allow it to climb any higher.  Air converging " +
                                        "at this level will be forced to descend in the atmosphere since it can't travel upward.  Diverging " +
                                        "air at the tropopause will therefore cause air from below to replace it, since it can't come from " +
                                        "above.";
                                break;

                            case 3:
                                //text="Chimney and Damper Effects";
                                text="When we take the holistic view of what is happening in the low levels and what is happening in the " +
                                        "upper levels with a simplified system, we get the chimney and damper effect.  I will start by " +
                                        "describing the chimney effect." +
                                        "\n\n" +
                                        "Let's say we have a low pressure system at the surface.  You already know that air flows cyclonically " +
                                        "into a low pressure system (because wind blows from higher to lower pressure), and air that is " +
                                        "coming together is converging.  From the previous lesson, we know that the air is then going to be " +
                                        "forced upward since it can't descend, so it heads up toward the top of the troposphere.  As the air " +
                                        "reaches the tropopause, it is going to spread out, since it can't travel any further.  The rising air " +
                                        "in this chimney effect is reflected by a high height center in the upper atmosphere, since that is " +
                                        "the type of system from which air flows as it hits the ceiling of the tropopause.  In simple terms, " +
                                        "a vertical cross section of this image is going to have arrows coming together at the surface, pointing " +
                                        "up to the tropopause, then pointing out as the air spreads out." +
                                        "\n\n" +
                                        "The damper effect is the exact opposite of the chimney effect.  If you have a high pressure system at the " +
                                        "surface, the air is flowing away from the center since wind blows from high to low pressure.  This " +
                                        "means that the air toward the center of the high needs to be replaced.  Since we are already at the " +
                                        "surface, that air needs to come from above.  This initiates a downward-moving column of air, and " +
                                        "as you start pulling air from near the tropopause it is going to cause air to converge into that " +
                                        "column like a low height center.  Arrows move out from the center at the surface, with an arrow " +
                                        "pointing down to the surface from the tropopause, and arrows pointing in to the column at the " +
                                        "tropopause.  This is the simple depiction of wind or air flow with the damper effect." +
                                        "\n\n" +
                                        "Of course, these effects are greatly simplified in the examples I gave, and nature doesn't typically " +
                                        "provide these ideal model scenarios.";
                                break;

                            case 4:
                                //text="The Level of Non-Divergence";
                                text="In the chimney effect, we had a high height center superimposed over a low pressure center.  In the " +
                                        "damper effect, we had the exact opposite, with a low height center over a high pressure center.  " +
                                        "There must be a point in the atmosphere where these motions are reversing, since highs and lows behave " +
                                        "exactly opposite of each other.  This is called the Level of Non-Divergence, or LND.  The LND sits at " +
                                        "roughly 600mb in the atmosphere, or 14,000ft.  This is where vertical motions are at their maximum and " +
                                        "horizontal convergence and divergence are at their minimum.  Features tend to move dynamically below " +
                                        "the LND and less so above it.";
                                break;

                            case 5:
                                //text="Influence on Stability";
                                text="Here are a couple good examples of the chimney effect: A thunderstorm.  A hurricane.  Get the picture?  " +
                                        "The chimney effect, which is a model of upward vertical motion, causes bad weather.  Just like the " +
                                        "parcel of air that is in an unstable environment back when we were discussing lapse rates, air that " +
                                        "keeps moving up in the atmosphere is given more opportunity to condense into clouds and develop " +
                                        "cumuliform clouds, potentially thunderstorms.  Therefore, upward vertical motion in the atmosphere " +
                                        "tends to cause stability to decrease." +
                                        "\n\n" +
                                        "The flip side is that the damper effect generally produces pleasant, calm weather, like in Bermuda, " +
                                        "which is under the influence of the Bermuda High.  The same thing goes for our polar highs.  Downward " +
                                        "vertical motions indicate stability in most scenarios.";
                                break;

                            case 6:
                                //text="S. M. I. L. E.";
                                text="This acronym is characteristically misleading.  SMILE is the set of ingredients that are required for " +
                                        "thunderstorm development.  They are Shear, Moisture, Instability, Lift and Exhaust.  Shear is dtrastic " +
                                        "changes in wind direction and/or speed in the vertical or horizontal.  Increasing moisture decreases " +
                                        "air's stability, as moist air is more buoyant than dry air and is more likely to continue rising.  " +
                                        "Instability is an obvious one, and lift is required to initiate the vertical motions.  Exhaust can " +
                                        "be thought of as divergence in the upper levels, because all of the rising air needs a place to go " +
                                        "when it gets to a higher place in the atmosphere.  The more of any of these ingredients you have, " +
                                        "the higher the chance that you develop thunderstorms and/or severe thunderstorms, which we will " +
                                        "define later.";
                                break;

                            default:
                                //text="Error lesson number";
                                text="";
                                break;
                        }
                        break;

                    default:
                        text= "Error Parent Menu";
                        break;

                }
                break;

            case 1:
                switch (parentMenu) {
                    case 0:
                        //lesson text="Macroscale Features";
                        switch (lessonNumber) {
                            case 0:
                                //text="Defining Macroscale";
                                text="When it comes to analyzing and forecasting weather features, we use a process called the forecast " +
                                        "funnel.  This works by focusing on the large-scale picture and systematically stepping down to the " +
                                        "smaller-scale features that are going to impact a region before looking at the local effects.  The " +
                                        "largest of these scales as defined in meteorology is macroscale, and the features that make up this " +
                                        "domain are very large - more than 6,000 miles in size generally.  Semi-permanent pressure systems, " +
                                        "long-wave ridges and troughs, and several other features make up this category.";
                                break;

                            case 1:
                                //text="Semi-Permanent Highs";
                                text="As you could guess by the name, a semi-permanent pressure system is one that moves very slowly - " +
                                        "typically less than 100 miles in a day.  This is because our semi-permanent pressure systems are " +
                                        "extremely large and tend to move in seasonal patterns.  As far as semi-permanent high pressure " +
                                        "areas are concerned, there are two major systems that straddle North America; the Bermuda-Axores " +
                                        "High, and the Pacific High.  In general, pressure systems are named for the area from which they " +
                                        "originate.  These sub-tropical (just outside the tropics) systems typically reside between 30 and " +
                                        "60°N latitude, and there are similar systems that dominate in the southern and eastern hemispheres as well.";
                                break;

                            case 2:
                                //text="Semi-Permanent Lows";
                                text="The semi-permanent lows that affect North America are the Aleutian and Icelandic Lows." +
                                        "The Aleutian low is a subpolar low which forms between the Arctic and Polar front jets.  " +
                                        "This is a cold core system which, like the Arctic high, migrates with the seasons.  During the " +
                                        "winter months, the center is located near the western edge of the Aleutian chain.  In the summer, " +
                                        "the center may be found in the Gulf of Alaska.  The Aleutian low is associated with poor weather." +
                                        "Icelandic low.  The Icelandic Low is a subpolar low which forms between the Arctic and Polar front " +
                                        "jets.  Once again, this is a cold core system which migrates with the seasons.  The Icelandic low’s " +
                                        "center is located between Maine and Greenland during the winter months, but moves near Iceland " +
                                        "during the summer.  The Icelandic low is associated with poor weather.";
                                break;

                            case 3:
                                //text="Tying it into the Three Cell Model";
                                text="If you recall back to the three cell model lesson, there is an area of downward motion around 30°N and " +
                                        "S, where the Ferrell and Hadley cells meet.  This is due to the upper atmospheric convergence " +
                                        "between the cells that creates a damper effect, resulting in high pressure at the surface.  The " +
                                        "semi-permanent lows are more closely aligned with the boundary between the polar and Ferrell cells, " +
                                        "where you see surface convergence between the two cells that creates a chimney effect, resulting in " +
                                        "low pressure and upward vertical motions.";
                                break;

                            case 4:
                                //text="Seasonal Variations";
                                text="Each of these systems tends to move in one direction or the other depending on the season.  In general, the " +
                                        "subtropical highs in the northern hemisphere move westward in the summer and eastward in the winter, " +
                                        "while the subpolar lows (the Aleutian and Icelandic) tend to move in the opposite direction; East in " +
                                        "summer and west in winter.  The polar high, the area of high pressure sitting over the Arctic circle, " +
                                        "will migrate toward Siberia in the winter and North America in the summer.";
                                break;

                            case 5:
                                //text="NETWCZ / ICTZ";
                                text="The equatorial trough is a broad, elongated area of lower pressure that migrates between 10° N and 10° " +
                                        "S with the seasons.  It is formed by the chimney effect between the tradewinds.  For categorical " +
                                        "purposes, we separate the equatorial trough into two tropical features.  The first, the Near " +
                                        "Equatorial Tradewind Convergence Zone (NETWCZ) is an east to west line of convection over the oceans " +
                                        "between 5°N and 10°N.  The second, the Monsoonal Trough, is a series of thermal lows commonly found " +
                                        "over land areas during the summer months.  The Monsoonal Trough is responsible for most thunderstorm " +
                                        "activity over land in the tropics.  ";
                                break;

                            case 6:
                                //text="Oscillatory Patterns";
                                text="There are several oscillatory patterns that affect the weather and climate through broad swatchs of the " +
                                        "globe.  You are probably familiar with the term \"El Nino\", which is Spanish for \"The Nino\".  " +
                                        "This is part of an oscillatory pattern known as the El Nino Southern Oscillation (ENSO) cycle.  " +
                                        "The ENSO cycle is an irregularly periodic variation in winds and sea surface temperatures over " +
                                        "the tropical eastern Pacific Ocean.  Strong El Nino corresponds to increased energy and moisture " +
                                        "across the U.S. in the summer time, which can enhance severe weather and increase temperatures.  " +
                                        "La Nina is the term for the opposite effect of El Nino, and generally causes weather and climate " +
                                        "that is counter to what we described for El Nino." +
                                        "\n\n" +
                                        "The North Atlantic Oscillation (NAO) is another one of these fluctuations and is driven by the " +
                                        "difference of SLP between the Icelandic low and the Azores high. Varying strengths of these features " +
                                        "controls the strength and direction of westerly winds and location of storm tracks across the North " +
                                        "Atlantic.";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 1:
                        //lesson text="Long Wave Pattern";
                        switch (lessonNumber) {
                            case 0:
                                //text="L/W Ridges and Troughs";
                                text="Though you can't often \"see\" the atmosphere in motion just by looking at it visually, try and " +
                                        "envision it as a three-dimensional soupy-fluid (yes, I know it is a mixture of gases).  All of the things we've " +
                                        "discussed to this point had to do with different ways in which it behaves because in general, the " +
                                        "atmosphere does not behave uniformly.  Like the ocean, the atmosphere contains waves of higher " +
                                        "heights and troughs of lower heights in between those crests.  Long-wave ridges area areas of higher " +
                                        "heights that extend poleward from semi-permanent highs, while long-wave troughs extend equatorward from " +
                                        "semi-permanent lows.  " +
                                        "\n\n" +
                                        "The long-wave ridges that affect North America extend North from the Pacific and Subtropical highs, " +
                                        "while a long-wave trough extends south across the center of the continent (it meanders east and " +
                                        "west) from the poles.  If you recall, the polar high is a shallow system, with a strong high pressure " +
                                        "center at the surface and lower heights aloft because the atmosphere becomes compressed due to all of " +
                                        "the cold air.  The North American trough actually extends from the low height center that sits on " +
                                        "top of the polar high.";
                                break;

                            case 1:
                                //text="Amplitude";
                                text="If you think back to your middle or high school science classes, you probably learned the characteristics " +
                                        "of waves, whether they be electromagnetic, fluid, or seismic.  One of those characteristics is " +
                                        "amplitude, and simply stated it is the distance from the top of the crest or bottom of the trough " +
                                        "to the average height of the medium.  Amplitude is typically associated with energy, and increasing " +
                                        "aplitude corresponds to greater energy.  This is true of long-wave features, where stronger ridges " +
                                        "and deeper troughs mean that more energy is being transferred north and south along the long-wave " +
                                        "pattern.";
                                break;

                            case 2:
                                //text="Wavelength";
                                text="Wavelength is the amount of distance from crest to crest or trough to trough, and the longer the wave-" +
                                        "length, the broader the feature is.  Shorter wavelengths mean quicker north-south energy transfer, " +
                                        "which coupled with higher amplitude typically means more intense frontal systems.  Together, " +
                                        "amplitude and wavelength combine to determine the types of weather patterns that are going to " +
                                        "dominate a region.  There are two general long-wave patterns that we will discuss.";
                                break;

                            case 3:
                                //text="Zonal Pattern";
                                text="A zonal pattern is one where the long-waves are broad and flat, meaning the wavelengths are long and " +
                                        "the amplitude is low.  This causes weather features to move more east-west or west-east with little " +
                                        "latitudinal variation.  These types of systems are weak and move through the long-wave pattern " +
                                        "quickly.  In general, you get a zonal pattern when the long-waves are 80-120° in breadth and/or there " +
                                        "are less than 5 couples of long-wave troughs and ridges.";
                                break;

                            case 4:
                                //text="Meridional Pattern";
                                text="A meridional pattern is one with great amplitude and shorter wavelengths.  As discussed, this means ther " +
                                        "there is more north-south energy transfer; the colder air in the north moves further south toward the " +
                                        "tropics, and vice versa.  Weather systems move more slowly through a meridional pattern and grow to " +
                                        "be more intense.";
                                break;

                            case 5:
                                //text="North American Seasonal Patterns";
                                text="The seasons in North America are indicated by the long-waves that you would see on an upper air chart, more " +
                                        "specifically the 500mb level." +
                                        "\n\n" +
                                        "In the Summer, the pattern is zonal, so weather systems move west to east." +
                                        "\n" +
                                        "In the Fall, a long-wave trough sits over the western portion of the continent, and a ridge sits across " +
                                        "the eastern half of the continent.  An easy mnemonic device is to think of the ridge in the east like a " +
                                        "hill and the trough in the west like a valley, so if you were standing on the hill facing east you might " +
                                        "\"fall back\"." +
                                        "\n" +
                                        "In the winter, the pattern is ridge-trough-ridge with a high amplitude, causing great north-south energy " +
                                        "transfer." +
                                        "\n" +
                                        "In the spring, there is a ridge in the west and trough in the east.  In keeping with the fall example, if " +
                                        "you were on the hill (ridge) sitting on the western half of the continent, you might \"Spring Forward\".";
                                break;

                            case 6:
                                //text="Strengthening and Weakening Features";
                                text="There are several things that can cause features to strengthen or weaken.  Convergence/Divergence and " +
                                        "temperature advection are two of these features." +
                                        "\n\n" +
                                        "When dealing with a long-wave trough, ______ upstream will cause the trough to ______ ." +
                                        "\n1) divergence; intensify" +
                                        "\n2) cold air advection; intensify" +
                                        "\n3) convergence; weaken" +
                                        "\n4) warm air advection; weaken" +
                                        "\n\n" +
                                        "When dealing with a long-wave ridges, ______ upstream will cause the ridge to ______ ." +
                                        "\n1) divergence; weaken" +
                                        "\n2) cold air advection; weaken" +
                                        "\n3) convergence; intensify" +
                                        "\n4) warm air advection; intensify";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 2:
                        //lesson text="Jet Streams";
                        switch (lessonNumber) {
                            case 0:
                                //text="What is a Jet Stream?";
                                text="Jet streams are strong horizontal winds concentrated in narrow bands.  Jet streams can be thousands of " +
                                        "miles long, hundreds of miles wide, and two to three miles deep.  The jet axis is the center of the " +
                                        "strong winds.  In other words it is the center of the jet stream.  The jet streams outline the " +
                                        "long-wave pattern and macroscale features, and drive much of the weather we see occurring in the " +
                                        "troposphere.";
                                break;

                            case 1:
                                //text="Where is a Jet Stream?";
                                text="As previously mentioned, jet streams are found at the top of the troposphere, sandwiched against the " +
                                        "tropopause.  You might wonder what causes a jet stream.  Here are the basics:" +
                                        "\n\n" +
                                        "One cause of the jet streams is strong horizontal temperature contrast.  Recall there is relatively " +
                                        "constant and uniform heating at the Equator.  The expanding air results in greater thickness and " +
                                        "therefore higher heights aloft.  There is constant and uniform cooling at the Poles.  The cooling " +
                                        "causes the cold air to contract.  The contracting air results in shallower thickness and lower " +
                                        "heights aloft.  The contrast in heating and cooling creates a strong temperature gradient.  This " +
                                        "results in a strong contour gradient, which initiates the wind.\n" +
                                        "\n\n" +
                                        "The second cause for the formation of jet streams is the conservation of angular momentum.  " +
                                        "Out of balance parcels are displaced poleward in anticyclonic circulation, so velocity increases to " +
                                        "conserve it’s angular momentum.\n";
                                break;

                            case 2:
                                //text="Seasonal Variations";
                                text="In the northern hemisphere, the jet streams will move further north in the summer time and south in " +
                                        "winter.  In the summer, this causes most of the weather systems to stay north of the United States, " +
                                        "while they plummet further south in the winter time.";
                                break;

                            case 3:
                                //text="The Polar Front Jet";
                                text="The most significant jet in the northern hemisphere is the Polar Front Jet (PFJ).  The PFJ is located " +
                                        "at the intersection of polar and mid-latitude tropospheric leafs.  The primary cause of the PFJ is " +
                                        "horizontal temperature contrast, followed by conservation of angular momentum.  The PFJ varies in " +
                                        "altitude and temperature more widely than the other two.";
                                break;

                            case 4:
                                //text="The Subtropical Jet";
                                text="The Subtropical Jet (STJ) is located at the intersection of the mid-latitude and tropical tropospheric " +
                                        "leafs.  The STJ forms primarily due to conservation of angular momentum and is aided secondarily by " +
                                        "horizontal temperature contrast.  The STJ has the highest altitude of the three jets and the coldest " +
                                        "temperature.";
                                break;

                            case 5:
                                //text="The Arctic Jet";
                                text="The Arctic jet is associated with the polar tropospheric leaf and forms due to horizontal temperature " +
                                        "contrast.  Conservation of angular momentum has little to no effect on this jet stream.  The Arctic " +
                                        "jet has the lowest altitude and the warmest temperatures of the three main jets.";
                                break;

                            case 6:
                                //text="Jet Maxima";
                                text="A jet maximum is quite simply an intermittent region of stronger winds along the jet axis.  Often times " +
                                        "the main jet core may have wind speeds of roughly 90 knots, but the jet maximum may be 130 knots.  " +
                                        "The jet maxima can often drive many weather features across continents.";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 3:
                        //lesson text="Air Masses";
                        switch (lessonNumber) {
                            case 0:
                                //text="Defining Air Mass";
                                text="An air mass is a large body of air with similar temperature and moisture characteristics.  Source " +
                                        "regions are areas with relatively flat terrain and with uniform composition.  This might be the ice " +
                                        "cap at the poles or a vast stretch of ocean.  One other important parameter is that the winds must " +
                                        "be light.  If the winds are too strong, too much mixing occurs and an air mass can’t form.  ";
                                break;

                            case 1:
                                //text="Air Mass Characteristics";
                                text="Obviously, the characteristics of an air mass are goin gto vary depending on whether the source region " +
                                        "is over oceanic regions or dryer terrain.  There are also variances with respect to latitude and " +
                                        "proximity to other features.";
                                break;

                            case 2:
                                //text="Two-Letter Codes";
                                text="The first letter of an air mass is determined by moisture characteristics, of which there are two.  " +
                                        "Continental- Continental air masses form over land areas.  It is characterized by a lowercase “c” which " +
                                        "indicates dry air.  Maritime - Maritime air masses form over large open ocean areas.  They are designated by a " +
                                        "lowercase “m” which indicates moist air." +
                                        "\n\n" +
                                        "The second character is based on temperature, and there are three options:" +
                                        "Arctic - Arctic air masses form in frigid climates, they are found closest to the poles.  We designate arctic air masses with the capital letter “A”.\n" +
                                        "Polar - Even though the name “polar” denotes high latitudes, the temperatures must be very cold for a strong air mass to form.  Polar air masses are designated with the capital letter “P”.\n" +
                                        "Tropical - Just as the name implies, tropical air masses form in very warm climates.  Tropical air masses are designated with the capital letter “T”.\n" +
                                        "In total there are five different combinations of air masses (Figure 1-6). \n" +
                                        "Maritime tropical (mT) – warm, moist air\n" +
                                        "Continental tropical (cT) – hot, dry air\n" +
                                        "Maritime polar (mP) – cool, moist air\n" +
                                        "Continental polar (cP) – cold, dry air\n" +
                                        "Continental arctic (cA) – frigid, dry air\n";
                                break;

                            case 3:
                                //text="North American Air Masses";
                                text="In North America, you can find a cA air mass in northwest canada, an mP air mass in the Pacific north-" +
                                        "west, mT air masses to the southwest and southeast of the U.S., and a cT air mass in the desert southwest.";
                                break;

                            case 4:
                                //text="Air Masses and Semi-Permanent Pressure Systems";
                                text="Many air masses are generated in the same locations that produce semi-permanent pressure " +
                                        "systems.  For instance, down in the southeast U.S. you fill fall under the influence of a warm and " +
                                        "maritime tropical (mT) air mass that happens to be associated with the region dominated by the Bermuda-" +
                                        "Azores High.  In Antarctica, you will encounter a very cold, dry air mass (cA) that is associated with " +
                                        "the Antarctic High.  There are also some air masses that move, a result of the atmosphere trying to find " +
                                        "its equillibrium.";
                                break;

                            case 5:
                                //text="Where Air Masses Meet";
                                text="The boundary between air masses is called a frontal zone.  If the air masses aren't moving, neither will " +
                                        "the front.  This type of frontal zone is called a stationary front.  Frontal zones are often areas in " +
                                        "which weather occurs as air with differing temperature, moisture and stability interact with each other, " +
                                        "and the frontal zone provides lift.";
                                break;

                            case 6:
                                //text="Mobile Air Masses";
                                text="When air masses are in motion, this is when we see the classic frontal systems that sweep across from " +
                                        "North America with cold fronts, warm fronts and occluded fronts.  We will discuss fronts in more " +
                                        "detail in the next lesson.  Just know that many of the SMILE ingredients are found/generated in " +
                                        "these frontal regions.";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 4:
                        //lesson text="Synoptic Scale Systems";
                        switch (lessonNumber) {
                            case 0:
                                //text="Defining Synoptic";
                                text="The synoptic scale is the next step down in the forecast funnel from macroscale.  Though different " +
                                        "numbers are given as definitions for this category, features that fall into this domain typically " +
                                        "span 1,000 to 6,000 miles.  This encompasses extra-tropical (outside the tropics) cyclones, frontal " +
                                        "systems, etc.  These systems can be either dynamic or quasi-stationary.";
                                break;

                            case 1:
                                //text="Fronts";
                                text="Fronts are the boundaries between air masses that have differing characteristics.  As you learned in a " +
                                        "previous lesson, some of the significant differences that we care about in meteorology are temperature " +
                                        "and moisture characteristics.  There are four types of fronts that we will discuss in this section.  " +
                                        "There are cold fronts, warm fronts, occluded fronts and stationary fronts." +
                                        "\n\n" +
                                        "Cold fronts form when a cooler air mass moves toward an air mass that is a bit warmer.  In North " +
                                        "America, this typically occurs when mP or cP air masses move toward the subtropical ridge.  The " +
                                        "subtropical ridge is the general band of high pressure that is associated with features like the " +
                                        "Bermuda-Azores and Pacific Highs.  You will see a strong temperature gradient with cold fronts, and " +
                                        "often a high dew point temperature gradient as the cooler air mass is usually much drier than the air " +
                                        "mass that is being imposed upon.  Expect winds to increase and pressure to slowly drop as the front " +
                                        "approaches, with pressure rising sharply after passage as winds remain strong but shift into a more " +
                                        "northwesterly direction.  Clouds with a cold front are cumuliform in nature, often producing thunderstorms " +
                                        "that may be severe in nature." +
                                        "\n\n" +
                                        "Warm fronts are typically found downstream of cold fronts as both are associated with a single low " +
                                        "pressure system.  Warm fronts in North America are typically composed of the mT air mass ahead of the " +
                                        "cold front the is pulled north by the flow around the low.  The temperature gradient with warm fronts is " +
                                        "often more gradual than that of cold fronts, and the winds are generally weaker as well.  While thunderstorms " +
                                        "can be produced in the warm front, clouds are typically more stratiform in nature, producing sheets " +
                                        "of stratus, nimbostratus, altostratus and cirrostratus." +
                                        "\n\n" +
                                        "Occluded fronts are also associated with low pressure systems.  Once the low pressure system with a " +
                                        "cold and warm front matures, it often starts moving northeast and begins interacting with a third air " +
                                        "mass.  Occluded fronts can be more like a cold front or a warm front, but they typically produce weather " +
                                        "and clouds typical of a warm front.  When picturing the low pressure system, the cold front typically " +
                                        "extends south from the center of the low while the warm front extends east, and the occluded front will " +
                                        "extend north and curve westward around it.  This is the stereotypical setup, and weather often does not " +
                                        "fit such a perfect model of behavior." +
                                        "\n\n" +
                                        "Lastly, the stationary front sits between air masses that aren't moving very much, causing clouds and " +
                                        "weather that are somewhat similar to a warm front, though generally less extensive and less intense.  " +
                                        "Stratiform clouds that can produce steady rain occurs north of the front if there is enough moisture in " +
                                        "the atmosphere, while fot is typical to the south of the frontal boundary.";
                                break;

                            case 2:
                                //text="Major Shortwave Troughs";
                                text="Troughing is an area of generally lower heights in the atmosphere compared with surrounding areas.  " +
                                        "Major shortwave troughs and ridges follow the long-wave pattern along the Polar Front Jet (PFJ).  A " +
                                        "feature is typically considered a major shortwave if it is along the PFJ axis and is visible in the data at " +
                                        "two or more of the upper air chart levels (also known as constant pressure charts; typical levels to " +
                                        "view these features are 500mb and 700mb)." +
                                        "\n\n" +
                                        "Major shortwave troughs are disruptions in hemispheric flow, and they provide support for unstable waves.  " +
                                        "They are formed by thermal instability in the jet core created by jet maxima, the area of stronger " +
                                        "winds in the jet core.  Troughs are fueled by strong cold-air advection upstream.  Recall that " +
                                        "advection is a form of energy and temperature exchange, and colder air condenses, thus causing lower " +
                                        "heights in the atmosphere, which is why they are fueling troughing.  Major shortwave troughs often " +
                                        "see clouds and bad weather downstream due to the divergence aloft they cause (exhaust) and the " +
                                        "upward vertical motions (chimney effect) that they are associated with.";
                                break;

                            case 3:
                                //text="Major Shortwave Ridges";
                                text="Ridging is an area of generally higher heights in the atmosphere compared with surrounding areas.  " +
                                        "Major shortwave ridges provide support for baroclinic (dynamic) high pressure systems at the surface, " +
                                        "and can be typically found at 500 and 700mb like major shortwave troughs.  Troughs are fueled by " +
                                        "warm-air advection upstream, and will typically fall about 150-350 miles upstream of the high " +
                                        "pressure.  Pleasant weather and clear skies typically fall downstream of these features.";
                                break;

                            case 4:
                                //text="Back to the Jet Max";
                                text="As mentioned before, the jet maxima will cause major shortwave troughs, which in turn provide support to " +
                                        "unstable waves.  These are the types of systems that will generate fronts and poor weather conditions.  " +
                                        "We will discuss these systems in greater depth during the next page's lessons.  You will find the jet " +
                                        "max on a 300mb or 200mb constant pressure chart as a football-shaped band of stronger winds.  Stronger " +
                                        "winds can produce more energy for the system that it supports.  Jet maxima span in size from 1-2 " +
                                        "Rhode Islands, which I believe is an official SI unit of measure.";
                                break;

                            case 5:
                                //text="Cyclones and Anticyclones";
                                text="Recalling back to earlier lessons, cyclones are areas of low pressure and anticyclones are areas of " +
                                        "high pressure.  On surface pressure charts or constant pressure upper air charts, these systems will " +
                                        "have 1 or more closed isobars/contours around them.  In the synoptic scale, these systems will fall " +
                                        "into the baroclinic (dynamic) or barotropic (not) categories.  ";
                                break;

                            case 6:
                                //text="Diabatic Effects";
                                text="Diabatic effects are small- or large-scale changes that an air mass will undergo when travelling over " +
                                        "a surface with characteristics that are different from the air mass.  This is much like conduction, " +
                                        "just at a larger scale.  For instance, when a cold front travels over an even colder surface, the " +
                                        "cold front will strengthen.  When it travels over a warmer surface, the cold front will weaken.  The " +
                                        "same effect occurs with warm fronts, though opposite - it will weaken over a colder surface and " +
                                        "strengthen over a warmer surface.  Low pressure centers will strengthen over a warmer surface, just " +
                                        "like warm fronts.  The reason for this is that as the air warms, it is more likely to rise and produce " +
                                        "the chimney effect that strengthens lows and upward vertical motion.  High pressure centers strengthen " +
                                        "over colder surfaces due to colder air becoming more dense and creating higher pressure.";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 5:
                        //lesson text="Baroclinic Systems";
                        switch (lessonNumber) {
                            case 0:
                                //text="Defining Baroclinicity";
                                text="Baroclinic zones are areas in the atmosphere over which a strong temperature gradient exists at a " +
                                        "constant pressure surface.  Baroclinicity in meteorology is a measure of the degree to which a " +
                                        "a system is driven by an out-of-phase relationship between the wind flow and temperature gradient.  " +
                                        "I know that sounds like a mouthful, but think of it like this: if the isotherms (temperature lines) " +
                                        "and contours (height lines that outline the general wind flow) are parallel, then nothing is changing " +
                                        "because the wind isn't carrying colder or warmer air in either direction.  Now, picture that the " +
                                        "isotherms are at a 45° angle from the contours, meaning that the wind is driving temperature advection.  " +
                                        "If the wind is crossing progressively warmer isotherms, it is said to be carrying colder air toward " +
                                        "regions of warmer air, or causing cold air advection.  If the temperature lines that the wind crosses " +
                                        "decrease in value, that is warm air advection as warmer air is invading regions of cooler air.";
                                break;

                            case 1:
                                //text="Wave Cyclone Process - 1) Stable Wave Stage";
                                text="A stable wave is an area of lower pressure that develops along a stationary frontal zone without upper " +
                                        "air support.  By upper air support, I mean that there isn't a major shortwave trough that is creating " +
                                        "or causing the low to deepen.  You will see mild cyclonic flow around this low, but unless it ends up " +
                                        "intensifying due to a major shortwave trough or other upper level feature that can cause this, it " +
                                        "will remain a stable wave and eventually die off.  Weather associated with stable waves is usually " +
                                        "mild with some cloud cover and potential rain.  If a trough moves in upstream of the stable wave, " +
                                        "there is a good chance that it will be kicked into the unstable wave phase.";
                                break;

                            case 2:
                                //text="2) Unstable Wave Stage";
                                text="Unstable waves are baroclinic lows with a low pressure center located in the southeast " +
                                        "portion of the dynamic air mass.  An unstable wave will have a cold front extending southward from the " +
                                        "low center and wrapping around to the west.  Expect thunderstorms, rain showers, cumuliform clouds " +
                                        "and icing/turbulence with the cold front.  A warm front will also extend somewhat eastward from the " +
                                        "low center, bringing more stratiform clouds and rain to the somewhat warmer region.  Turbulence is " +
                                        "often less intense in the warm front, but icing can be severe especially in freezing rain scenarios.  ";
                                break;

                            case 3:
                                //text="3) Mature Wave Stage";
                                text="A mature wave is an unstable wave that has developed further and begun interacting with a third air mass " +
                                        "as the direction of movement of the low pressure center begins to move more northeasterly as opposed " +
                                        "to a more southeastward movement of the unstable wave.  Cold and warm fronts are at their most intense " +
                                        "during this stage of development, and this is when we begin to see the occluded front extend northwest " +
                                        "from the low center and begin wrapping westward around the low.  At this point in the development of " +
                                        "the wave cyclone, it is starting to become more barotropic (less movement due to less thermal " +
                                        "advection) due to the upper air support (major shortwave trough) starting to outrun the surface " +
                                        "features of the system, since the fronts and low pressure center are experiencing the effects of " +
                                        "friction at the surface of the earth while the trough is up at 700 and 500mb in the atmosphere.";
                                break;

                            case 4:
                                //text="4) Decaying Wave Stage";
                                text="By the decaying wave stage, the wave cyclone has become barotropic and its upper air support has outrun " +
                                        "the surface features.  The low pressure center will begin to weaken from the surface up through the " +
                                        "atmosphere.";
                                break;

                            case 5:
                                //text="Baroclinic Highs";
                                text="We've discussed baroclinic lows in the wave cyclone process.  Baroclinic lows will always be paired to " +
                                        "a baroclinic high.  As previously mentioned, air flows from higher to lower pressure.  This concept " +
                                        "extends itself somewhat to the pair of baroclinic systems as the dynamic high actually drives the " +
                                        "low pressure system.  In the northern hemisphere, baroclinic systems can form in several source " +
                                        "regions, but many of the systems form in the northwest of the continent when part of the cA air mass " +
                                        "in Canada is ejected from the region due to upper level dynamics and starts moving southeast.  The " +
                                        "weather associated with the baroclinic high is typically fair with cold temperatures and dry " +
                                        "conditions.";
                                break;

                            case 6:
                                //text="Major Shortwaves";
                                text="We've defined major shortwave troughs and ridges in the previous section.  In this section, we've " +
                                        "alluded to the way in which they support baroclinic highs and lows.  Just like baroclinic highs and " +
                                        "lows, major shortwave troughs and ridges also come in pairs, with the major shortwave trough " +
                                        "downstream of the major shortwave ridge.  Both of these features are baroclinic and can support " +
                                        "baroclinic low and high pressure centers, respectively.  The upward vertical motion downstream of a major " +
                                        "shortwave trough intensifies an unstable wave if it remains 150-350 miles upstream of the low pressure " +
                                        "center at the surface.  The same but opposite is true of a major shortwave ridge, with downward " +
                                        "vertical motion downstream that adds mass to a baroclinic high and in turn intensifies it.";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 6:
                        //lesson text="Barotropic Systems";
                        switch (lessonNumber) {
                            case 0:
                                //text="Defining Barotropic";
                                text="Barotropic systems are weather systems that have little to no thermal advection, and because of this " +
                                        "move very slowly.  When looking at a surface or upper air chart, you will see the isobars/contours " +
                                        "in phase with the isotherms, the lines of temperature being parallel to the wind.  This results in " +
                                        "little to no temperature advection.  ";
                                break;

                            case 1:
                                //text="Back to the Macroscale";
                                text="At the macroscale, the semi-permanent pressure systems we discussed are barotropic.  These consisted of " +
                                        "the Bermuda-Azores High, Pacific High, Polar High, sub-polar lows, and several more across the globe.  " +
                                        "They do have movement, as discussed previously, but typically the pressure center might move 50-100 " +
                                        "miles in a 24 hours period.  While this might sound like much, given the scale of these features " +
                                        "(greater than 6,000 miles in breadth), it is a relatively small amount.  Long-wave troughs and ridges " +
                                        "are also barotropic systems, following similar patterns of movement as the pressure systems.";
                                break;

                            case 2:
                                //text="Above the LND";
                                text="The level of non-divergence was discussed in a previous lesson as a boundary in the atmosphere at which " +
                                        "vertical motions are at a maximum and above which atmospheric motions appear to reverse with respect " +
                                        "to convergence and divergence.  It is also said that generally, the atmosphere above the LND is " +
                                        "barotropic, while the atmosphere below it is baroclinic.  This is a broad generalization, as there " +
                                        "are still baroclinic features above the LND such as major shortwave troughs and ridges, but on large " +
                                        "scales the atmosphere behaves in a barotropic fashion.";
                                break;

                            case 3:
                                //text="Birth and Death of a Baroclinic High";
                                text="As mentioned in the section about baroclinic high pressure systems, they tend to originate in the far " +
                                        "northern section of the mid-latitudes from cold air masses.  Before a major shortwave ridge comes " +
                                        "along and \"breaks off a chunk of the air mass\", that cold air mass is barotropic, staying in the " +
                                        "same general area.  The major shortwave ridge then provides the upper-level dynamics to force a " +
                                        "section of the cold air mass to become baroclinic, moving in an southeastward direction.  " +
                                        "As the high continues toward the subtropical ridge, it is warmed from the surface of more southern " +
                                        "geography and begins to weak.  If you recall the section on diabatic effects, you know that warm air " +
                                        "weakens high pressure because warmer air wants to rise and contribute to the chimney effect, the " +
                                        "effect that strengthens low pressure systems.  Finally, as the baroclinic high makes its way to the " +
                                        "far southern portion of the Ferrell cell, it is absorbed into the subtropical ridge near 30° and " +
                                        "becomes barotropic.  At this point, it weakens to the point in which it can't be discerned on the " +
                                        "surface pressure chart.";
                                break;

                            case 4:
                                //text="Terrain-Induced Highs and Lows";
                                text="Some high and low pressure systems are caused by effects of the terrain.  If you recall, desert regions " +
                                        "in low latitudes tend to get intense surface heating, which results in the chimney effect and low " +
                                        "pressure.  In places like the desert southwest of the U.S. and the middle east, synoptic scale " +
                                        "cyclonic circulations around low pressure areas will develop, especially in the summer time when " +
                                        "daytime heating is at a maximum.  These low pressure systems are barotropic, shifting slightly from " +
                                        "day to day but remaining in generally the same location.  These systems are called thermal lows." +
                                        "\n\n" +
                                        "In the winter time, areas of higher terrain such as large plateaus can create dense cold air masses " +
                                        "that result in strong high pressures areas with anticyclonic circulation.  Some regions that are " +
                                        "known to produce these systems are the Anatolian Plateau in Turkey and the Caucsasus Mountains as " +
                                        "well as the Tibetan Plateau.  Like the thermal lows, these high pressure areas remain stationary " +
                                        "for the most part, moving very little from day to day.";
                                break;

                            case 5:
                                //text="Monsoons";
                                text="India and Pakistan also produce thermal lows in the summer time, and they result in the monsoon season " +
                                        "that brings the torrential downpours the name brings to mind.  As these low pressure areas cause " +
                                        "massive areas of upward vertical motion, the moist air from the Indian Ocean rushes in and the influx " +
                                        "of moisture fuels the rain showers that bring hundreds of inches of rain to the region.  This effect " +
                                        "also occurs in the southwest United States to a lesser extent with the thermal low that forms in " +
                                        "southern Texas/Arizona and Mexico.";
                                break;

                            case 6:
                                //text="Blocking Patterns";
                                text="Blocking patterns are quasi-stationary barotropic systems that prevent other systems from passing through a region.  There " +
                                        "are three kinds of blocking patterns that we will discuss in this section.  These systems can remain " +
                                        "in place for days at a time, keeping weather conditions persistent in a region until the blocking " +
                                        "pattern weakens." +
                                        "\n\n" +
                                        "An Omega Block is an area of higher heights aloft, creating a pocket of warm air in the upper levels " +
                                        "that does not reflect down to the surface.  IThis feature forms as the long-wave ridge extends toward " +
                                        "the pole and the polar front jet transports warm air north toward the ridge.  " +
                                        "The pocket of warm air stays north of the jet stream and a high height center forms with it" +
                                        "This type of system can occur year round, but is more likely to occur in the winter." +
                                        "\n\n" +
                                        "A Rex Block is a low height center that forms south of the PFJ and remains quasi-stationary for days " +
                                        "at a time.  This feature forms in much opposite the way an Omega Block forms, and sits south of a " +
                                        "long-wave trough." +
                                        "\n\n" +
                                        "The final blocking pattern is a sharp amplitude ridge, which is a long-wave ridge that grows so strong " +
                                        "that it does not allow weather features in the upper levels to pass, meaning the support for any " +
                                        "baroclinic high or low pressure center will vanquish and the surface feature disappears.";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 7:
                        //lesson text="Mesoscale Effects";
                        switch (lessonNumber) {
                            case 0:
                                //text="Defining Mesoscale";
                                text="Mesoscale features are on a smaller scale than the synoptic scale, less than 1,000 miles.  These types of " +
                                        "systems are highly influenced by local terrain, effects and land/water distribution.  As you get " +
                                        "down to this scale in the forecast funnel, this is the type of weather that is going to impact a local " +
                                        "area.";
                                break;

                            case 1:
                                //text="Sea/Land Breezes";
                                text="Land and sea breezes are a result of differential heating and cooling with respect to land and water.  " +
                                        "As mentioned previously, land heats and cools roughly 5 times faster than water.  During the daytime " +
                                        "in the summer, this means that the air over the coastal land is much warmer than the water, and a low " +
                                        "pressure area will form over the land.  This starts a chimney effect, and the air that rises " +
                                        "vertically needs to be replaced.  Denser air over the water moves toward land to replace it, and the air " +
                                        "that has risen starts to form a vertical current where the air at the surface moves toward the land " +
                                        "and the air aloft moves back over the water." +
                                        "\n\n" +
                                        "During the night, the land cools off faster than the water and creates an area of higher pressure.  " +
                                        "Since the water is warmer, it begins to rise in a chimney effect, creating an area of low pressure.  " +
                                        "Cooler air over the land moves in to replace the rising air over the water and creates a scenario " +
                                        "opposite of the sea breeze in the daytime.";
                                break;

                            case 2:
                                //text="Mountain/Valley Breezes";
                                text="Mountain and valley breezes are similar to land and sea breezes, caused by the fact that the mountainous " +
                                        "areas tend to heat and cool faster than the surrounding land.  The reason for this is the fact that " +
                                        "the mountains have more surface area and less volume to heat and cool.  During the daytime, a valley " +
                                        "breeze forms meaning the wind comes from the valley and heads up the mountains.  At night, the cooler, " +
                                        "denser air over the mountain will rush down to the valleys in a mountain breeze.";
                                break;

                            case 3:
                                //text="Land/Water Distribution Effects";
                                text="Introducing mixtures of land and water can have varied effects on weather systems.  Depending on the type " +
                                        "of system, it could cause weakening or strengthening a system, initiate convective currents that form " +
                                        "thunderstorms, cause fog, etc.  In general, low pressure systems and thunderstorms are going to be " +
                                        "strengthened by areas with higher temperatures and humidity, while cooler and drier areas will " +
                                        "weaken them.  ";
                                break;

                            case 4:
                                //text="Mesohighs and Mesolows";
                                text="Areas of high or low pressure can span pretty much any scale, and those that are on the mesoscale are " +
                                        "typically not supported by upper level features associated with the jet stream.  These types of " +
                                        "systems may be caused by terrain, local effects or other features.  Some larger thunderstorms can be " +
                                        "considered mesolows, especially supercell thunderstorms, which are large, rotating thunderstorms that " +
                                        "often produce severe weather like tornadoes and large hail.  Interestingly enough, when thunderstorms " +
                                        "collapse at the end of their lifecycle, they can produce mesohighs due to all of the cold, dense air " +
                                        "that had been suspended aloft due to strong updrafts rushing to the surface.  We will discuss this " +
                                        "in greater depth in the next lesson section.";
                                break;

                            case 5:
                                //text="Funneling";
                                text="Funneling is an effect by which winds can be strengthened by terrain influences similar to squeezing a " +
                                        "garden hose.  For instance, if strong winds make their way through mountain passes, they may be " +
                                        "intensified if the breadth of the area through which they travel becomes restricted, perhaps by " +
                                        "mountains.  This will result in strengthening winds, sometimes with damaging results.";
                                break;

                            case 6:
                                //text="Effects of Forests, Cities, Plains, etc";
                                text="We've mentioned how terrain can affect weather, and now let's discuss some of the ways in which that " +
                                        "happens." +
                                        "\n\n" +
                                        "Mountains heat and cool faster than surrounding areas, influencing not just the winds, but " +
                                        "precipitation and humidity.  Areas that fall on the lee side of the mountains experience drier " +
                                        "conditions than the windward side.  Drainage winds will set up at night and a gentle flow from the " +
                                        "mountains will prevail, though they can sometimes be strong in extreme situations.  " +
                                        "\n\n" +
                                        "Cities are typically about 5-10°F warmer than surrounding areas and have poorer air quality." +
                                        "\n\n" +
                                        "Areas with flat terrain like deserts and plains will have stronger winds as there is low friction " +
                                        "with flatter regions." +
                                        "\n\n" +
                                        "Unlike flat areas, forests cause weaker winds due to the obstruction and frictional effects of trees.  " +
                                        "Another effect of forested areas is that they retain more moisture and heat/cool slower than other " +
                                        "regions.  ";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    default:
                        text="Error Parent Menu";
                        break;

                }
                break;

            case 2:
                switch (parentMenu) {
                    case 0:
                        //lesson text="Precipitation";
                        switch (lessonNumber) {
                            case 0:
                                //text="Defining Precipitation";
                                text="";
                                break;

                            case 1:
                                //text="Rain";
                                text="";
                                break;

                            case 2:
                                //text="Snow";
                                text="";
                                break;

                            case 3:
                                //text="Sleet";
                                text="";
                                break;

                            case 4:
                                //text="Freezing Rain";
                                text="";
                                break;

                            case 5:
                                //text="Predicting Freezing Rain";
                                text="";
                                break;

                            case 6:
                                //text="Rain, Snow and Thickness";
                                text="";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 1:
                        //lesson text="Hail";
                        switch (lessonNumber) {
                            case 0:
                                //text="What is Hail?";
                                text="";
                                break;

                            case 1:
                                //text="How Does Hail Form?";
                                text="";
                                break;

                            case 2:
                                //text="Single Trip Theory";
                                text="";
                                break;

                            case 3:
                                //text="Multi-Trip Theory";
                                text="";
                                break;

                            case 4:
                                //text="Predicting Severe Hail";
                                text="";
                                break;

                            case 5:
                                //text="Using Skew-T Log P Diagram";
                                text="";
                                break;

                            case 6:
                                //text="Using Radar";
                                text="";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 2:
                        //lesson text="Tornadoes";
                        switch (lessonNumber) {
                            case 0:
                                //text="What is a Tornado?";
                                text="";
                                break;

                            case 1:
                                //text="The Enhanced Fujita Scale";
                                text="";
                                break;

                            case 2:
                                //text="The Formation Theory";
                                text="";
                                break;

                            case 3:
                                //text="Supercell Thunderstorms";
                                text="";
                                break;

                            case 4:
                                //text="Tornadoes and Hurricanes";
                                text="";
                                break;

                            case 5:
                                //text="Water Spouts";
                                text="";
                                break;

                            case 6:
                                //text="Finding Tornadoes on Radar";
                                text="";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 3:
                        //lesson text="Down Bursts";
                        switch (lessonNumber) {
                            case 0:
                                //text="Defining Down Bursts";
                                text="";
                                break;

                            case 1:
                                //text="Microburst";
                                text="";
                                break;

                            case 2:
                                //text="Macroburst";
                                text="";
                                break;

                            case 3:
                                //text="Gust Front";
                                text="";
                                break;

                            case 4:
                                //text="Thunderstorm Redevelopment";
                                text="";
                                break;

                            case 5:
                                //text="Aviation Hazard";
                                text="";
                                break;

                            case 6:
                                //text="Identify Down Bursts on Satellite";
                                text="";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 4:
                        //lesson text="Icing";
                        switch (lessonNumber) {
                            case 0:
                                //text="What is Icing?";
                                text="";
                                break;

                            case 1:
                                //text="Types and Severity of Icing";
                                text="";
                                break;

                            case 2:
                                //text="Where to Find Icing";
                                text="";
                                break;

                            case 3:
                                //text="Icing in Cold Fronts";
                                text="";
                                break;

                            case 4:
                                //text="Icing in Warm Fronts";
                                text="";
                                break;

                            case 5:
                                //text="General Temperature Ranges";
                                text="";
                                break;

                            case 6:
                                //text="Icing in Thunderstorms";
                                text="";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 5:
                        //lesson text="Turbulence";
                        switch (lessonNumber) {
                            case 0:
                                //text="What is Turbulence?";
                                text="";
                                break;

                            case 1:
                                //text="Types of Turbulence";
                                text="";
                                break;

                            case 2:
                                //text="Severity of Turbulence";
                                text="";
                                break;

                            case 3:
                                //text="Turbulence Shear Categories";
                                text="";
                                break;

                            case 4:
                                //text="Turbulence and Fronts";
                                text="";
                                break;

                            case 5:
                                //text="Turbulence and Jet Streams";
                                text="";
                                break;

                            case 6:
                                //text="Turbulence and Thunderstorms";
                                text="";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 6:
                        //lesson text="Tropical Weather";
                        switch (lessonNumber) {
                            case 0:
                                //text="What are the Tropics?";
                                text="";
                                break;

                            case 1:
                                //text="Tropical Waves";
                                text="";
                                break;

                            case 2:
                                //text="Tropical Cyclones";
                                text="";
                                break;

                            case 3:
                                //text="Stages of Cyclone Development";
                                text="";
                                break;

                            case 4:
                                //text="Landfall";
                                text="";
                                break;

                            case 5:
                                //text="Saffir Simpson Scale";
                                text="";
                                break;

                            case 6:
                                //text="Monsoons";
                                text="";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    case 7:
                        //lesson text="Space Weather";
                        switch (lessonNumber) {
                            case 0:
                                //text="The Interplanetary Magnetic Field";
                                text="";
                                break;

                            case 1:
                                //text="Solar Flares";
                                text="";
                                break;

                            case 2:
                                //text="Coronal Mass Ejections";
                                text="";
                                break;

                            case 3:
                                //text="Filaments and Prominences";
                                text="";
                                break;

                            case 4:
                                //text="The Solar and Hale Cycles";
                                text="";
                                break;

                            case 5:
                                //text="Scintillation & Communications";
                                text="";
                                break;

                            case 6:
                                //text="GPS and Satellite Tracking";
                                text="";
                                break;

                            default:
                                text="Error lesson number";
                        }
                        break;

                    default:
                        text="Error Parent Menu";
                        break;

                }
                text="This section is going to be completed during the next update, and it will contain all of the subsections listed in the " +
                        "previous menu." +
                        "\n\n" +
                        "-Dan McGonigle, May 25, 2018";
                break;

            default:
                text="Error Grandparent Menu";
                break;
        }
        return text;
    }




}
