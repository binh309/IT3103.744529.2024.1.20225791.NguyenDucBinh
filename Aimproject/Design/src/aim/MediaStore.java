//package aimProject;
package aim;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import hust.soict.dsai.aims.media.Media;

public class MediaStore extends JPanel {
    private Media media;

    public MediaStore(Media media) {
        this.media = media;

        // Set layout for the panel
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Title Label
        JLabel titleLabel = new JLabel(media.getTitle());
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titleLabel.setAlignmentX(CENTER_ALIGNMENT);
        this.add(titleLabel);

        // Cost Label
        JLabel costLabel = new JLabel(String.format("%.2f $", media.getCost()));
        costLabel.setAlignmentX(CENTER_ALIGNMENT);
        this.add(costLabel);

        // Play Button
        JButton playButton = new JButton("Play");
        playButton.setAlignmentX(CENTER_ALIGNMENT);
        playButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Playing: " + media.getTitle());
        });

        // Add to Cart Button
        JButton addToCartButton = new JButton("Add to Cart");
        addToCartButton.setAlignmentX(CENTER_ALIGNMENT);
        addToCartButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, media.getTitle() + " added to cart!");
        });

        // Add buttons to the panel
        this.add(playButton);
        this.add(addToCartButton);

        // Set a border for better visibility
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}