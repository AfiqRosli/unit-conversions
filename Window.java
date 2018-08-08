import net.miginfocom.swing.MigLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;

class Window extends JFrame {

    private JFrame window = new JFrame("Unit Conversions");
    private Container content = window.getContentPane();

    private JPanel panel = new JPanel(new MigLayout("center, center"));

    private JLabel header = new JLabel("Unit Conversions");
    private JLabel selectType = new JLabel("Type:");
    private JLabel to = new JLabel("to");
    private JButton convert = new JButton("Convert");
    private JTextField input = new JTextField(10);
    private JTextField output = new JTextField(10);

    private String[] types = {"Length",
                              "Area",
                              "Volume",
                              "Mass",
                              "Temperature"};

    private String[] length = {"Millimeter (mm)",
                               "Centimeter (cm)",
                               "Meter (m)",
                               "Kilometer (km)",
                               "Inch (in)",
                               "Feet (ft)",
                               "Yard (yd)",
                               "Mile (ml)"};

    private String[] area = {"Square Millimeter (mm2)",
                             "Square Centimeter (cm2)",
                             "Square Meter (m2)",
                             "Hectare (ha)",
                             "Square Kilometer (km2)",
                             "Square Inch (in2)",
                             "Square Feet (ft2)",
                             "Square Yard (yd2)",
                             "Acre (a)",
                             "Square Mile (ml2)"};

    private String[] volume = {"Cubic Centimeter (cm3)",
                               "Cubic Decimeter (dm3)",
                               "Cubic Meter (m3)",
                               "Liter (l)",
                               "Hectoliter (hl)",
                               "Cubic Inch (in3)",
                               "Fluid Ounce (fl oz)",
                               "Pint (pt)",
                               "Gallon (gal)"};

    private String[] mass = {"Milligram (mg)",
                             "Gram (g)",
                             "Kilogram (kg)",
                             "Tonne (t)",
                             "Ounce (oz)",
                             "Pound (lb)",
                             "Stone (s)"};

    private String[] temperature = {"Celsius (c)",
                                    "Fahrenheit (f)"};

    private JComboBox typeSelection = new JComboBox(types);
    private JComboBox unitFrom = new JComboBox(length);
    private JComboBox unitTo = new JComboBox(length);

    void startup() {
        window.setSize(600,400);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);

        header.setFont(new Font("monospace", Font.PLAIN, 20));

        content.add(panel);

        panel.add(header, "align center, wrap 60");
        panel.add(selectType, "split 2, align center");
        panel.add(typeSelection, "wrap 20");
        panel.add(input, "split 4, align center, pushx, growx");
        panel.add(unitFrom, "w 170!");
        panel.add(to);
        panel.add(unitTo, "w 165!, wrap 20");
        panel.add(convert, "align center, pushx, growx, wrap 20");
        panel.add(output, "align center, growx");

        input.setHorizontalAlignment(JTextField.CENTER);
        output.setHorizontalAlignment(JTextField.CENTER);

        typeSelection.addActionListener(changeUnits);
        convert.addActionListener(convertInput);
    }

    private ActionListener changeUnits = e -> {
        String selectedType = String.valueOf(typeSelection.getSelectedItem());

        switch (selectedType) {
            case "Length":
                unitFrom.setModel(new DefaultComboBoxModel(length));
                unitTo.setModel(new DefaultComboBoxModel(length));
                break;
            case "Area":
                unitFrom.setModel(new DefaultComboBoxModel(area));
                unitTo.setModel(new DefaultComboBoxModel(area));
                break;
            case "Volume":
                unitFrom.setModel(new DefaultComboBoxModel(volume));
                unitTo.setModel(new DefaultComboBoxModel(volume));
                break;
            case "Mass":
                unitFrom.setModel(new DefaultComboBoxModel(mass));
                unitTo.setModel(new DefaultComboBoxModel(mass));
                break;
            case "Temperature":
                unitFrom.setModel(new DefaultComboBoxModel(temperature));
                unitTo.setModel(new DefaultComboBoxModel(temperature));
                break;
        }
    };

    private ActionListener convertInput = e -> {
        String value = input.getText();
        String from = String.valueOf(unitFrom.getSelectedItem());
        String to = String.valueOf(unitTo.getSelectedItem());

        output.setText(Calculation.convert(value, from, to));
    };
}
