class Calculation {

    static String convert(String input, String from, String to) {
        String output;
        Double value = Double.parseDouble(input);

        switch (from) {
            // Length: !meter -> meter
            case "Millimeter (mm)":
                value = value * 0.001;
                break;
            case "Centimeter (cm)":
                value = value * 0.01;
                break;
            case "Kilometer (km)":
                value = value * 1000;
                break;
            case "Inch (in)":
                value = value * 0.0254;
                break;
            case "Feet (ft)":
                value = value * 0.3048;
                break;
            case "Yard (yd)":
                value = value * 0.9144;
                break;
            case "Mile (ml)":
                value = value * 1609.34;
                break;
            // Area: !sq meter -> sq meter
            case "Square Millimeter (mm2)":
                value = value * 1e-6;
                break;
            case "Square Centimeter (cm2)":
                value = value * 0.0001;
                break;
            case "Hectare (ha)":
                value = value * 10000;
                break;
            case "Square Kilometer (km2)":
                value = value * 1000000;
                break;
            case "Square Inch (in2)":
                value = value * 0.00064516;
                break;
            case "Square Feet (ft2)":
                value = value * 0.092903;
                break;
            case "Square Yard (yd2)":
                value = value * 0.836127;
                break;
            case "Acre (a)":
                value = value * 4046.86;
                break;
            case "Square Mile (ml2)":
                value = value * 2.59e+6;
                break;
            // Volume: !cb meter -> cb meter
            case "Cubic Centimeter (cm3)":
                value = value * 1e-6;
                break;
            case "Cubic Decimeter (dm3)":
            case "Liter (l)":
                value = value * 0.001;
                break;
            case "Hectoliter (hl)":
                value = value * 0.1;
                break;
            case "Cubic Inch (in3)":
                value = value * 1.63871e-5;
                break;
            case "Fluid Ounce (fl oz)":
                value = value * 2.841312e-5;
                break;
            case "Pint (pt)":
                value = value *0.0005682624;
                break;
            case "Gallon (gal)":
                value = value * 0.004546099;
                break;
            // Mass: !gram -> gram
            case "Milligram (mg)":
                value = value * 0.001;
                break;
            case "Kilogram (kg)":
                value = value * 1000;
                break;
            case "Tonne (t)":
                value = value * 1000000;
                break;
            case "Ounce (oz)":
                value = value * 28.35;
                break;
            case "Pound (lb)":
                value = value * 453.592;
                break;
            case "Stone (s)":
                value = value * 6350.29;
                break;
            // Temperature: !celsius -> celsius
            case "Fahrenheit (f)":
                value = (value - 32) * 0.5556;
                break;
        }

        switch (to) {
            // Length: meter -> selected unit
            case "Millimeter (mm)":
                value = value * 1000;
                break;
            case "Centimeter (cm)":
                value = value * 100;
                break;
            case "Kilometer (km)":
                value = value * 0.001;
                break;
            case "Inch (in)":
                value = value * 39.3701;
                break;
            case "Feet (ft)":
                value = value * 3.28084;
                break;
            case "Yard (yd)":
                value = value * 1.09361;
                break;
            case "Mile (ml)":
                value = value * 0.000621371;
                break;
            // Area: sq meter -> selected unit
            case "Square Millimeter (mm2)":
                value = value * 1000000;
                break;
            case "Square Centimeter (cm2)":
                value = value * 10000;
                break;
            case "Hectare (ha)":
                value = value * 0.0001;
                break;
            case "Square Kilometer (km2)":
                value = value * 1e-6;
                break;
            case "Square Inch (in2)":
                value = value * 1550;
                break;
            case "Square Feet (ft2)":
                value = value * 10.7639;
                break;
            case "Square Yard (yd2)":
                value = value * 1.19599;
                break;
            case "Acre (a)":
                value = value * 0.000247105;
                break;
            case "Square Mile (ml2)":
                value = value * 3.86102e-7;
                break;
            // Volume: cb meter -> selected unit
            case "Cubic Centimeter (cm3)":
                value = value * 1000000;
                break;
            case "Cubic Decimeter (dm3)":
            case "Liter (l)":
                value = value * 1000;
                break;
            case "Hectoliter (hl)":
                value = value * 10;
                break;
            case "Cubic Inch (in3)":
                value = value * 61023.7;
                break;
            case "Fluid Ounce (fl oz)":
                value = value * 35195.0085;
                break;
            case "Pint (pt)":
                value = value * 1759.75043;
                break;
            case "Gallon (gal)":
                value = value * 219.968813;
                break;
            // Mass: gram -> selected unit
            case "Milligram (mg)":
                value = value * 1000;
                break;
            case "Kilogram (kg)":
                value = value * 0.001;
                break;
            case "Tonne (t)":
                value = value * 1e-6;
                break;
            case "Ounce (oz)":
                value = value * 0.035274;
                break;
            case "Pound (lb)":
                value = value * 0.00220462;
                break;
            case "Stone (s)":
                value = value * 0.000157473;
                break;
            // Temperature: celsius -> selected unit
            case "Fahrenheit (f)":
                value = (value / 0.5556) + 32;
                break;
        }

        output = String.valueOf(value);

        return output;
    }

}