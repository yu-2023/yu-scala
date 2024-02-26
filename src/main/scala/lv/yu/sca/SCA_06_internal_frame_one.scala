
/**
 *
 * Scala package     lv.yu.sca
 *
 * Scala program     SCA_06_internal_frame_one.scala     Apache License 2.0
 *
 * Copyright (c)     Yuri Utkin 2023                     mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.sca

import javax.swing.JFrame
import javax.swing.ImageIcon
import javax.swing.JInternalFrame
import javax.swing.JPanel
import javax.swing.JDesktopPane
import javax.swing.JLabel
import javax.swing.JMenu
import javax.swing.JMenuBar
import javax.swing.JMenuItem
import javax.swing.JCheckBoxMenuItem
import javax.swing.KeyStroke

import java.awt.Toolkit
import java.awt.Color
import java.awt.Dimension
import java.awt.BorderLayout

import java.awt.event.KeyEvent
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

import javax.swing.WindowConstants

import javax.swing.SwingUtilities

//------------------------------

//  SCA_06_internal_frame_one demonstrates Scala Internal Frame One in Scala Frame
final class SCA_06_internal_frame_one {

    /** frame */
    val frame = new JFrame()

    /** manubar */
    val menubar = new JMenuBar()

    /** panel_1 */
    val panel_1 = new JPanel()

    /** panel_3 */
    val panel_3 = new JPanel()

    /** label_info */
    val label_info = new JLabel()

    /** desktoppane_12 */
    val desktoppane_12 = new JDesktopPane()

//------------------------------

    val imgURL     =               getClass.getResource("/lv/yu/sca/SCA_resources/SCA.jpg")
    val icon_frame = new ImageIcon(getClass.getResource("/lv/yu/sca/SCA_resources/SCA.jpg"))

//------------------------------

    val title = "SCALA -- SCA_06_internal_frame_one -- v. 2023.12.12"

        frame.setTitle("     " + title)

        frame.setBounds(10+5*40+150, 10+5*40, 1000, 600)

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)

        frame.setIconImage(icon_frame.getImage())

        frame.setLayout(new BorderLayout())

        frame.setVisible(true)

//------------------------------

    val icon_Start       = new ImageIcon(getClass.getResource("/lv/yu/sca/SCA_resources/start.gif"))
    val icon_Load        = new ImageIcon(getClass.getResource("/lv/yu/sca/SCA_resources/load.gif"))
    val icon_Xxxx        = new ImageIcon(getClass.getResource("/lv/yu/sca/SCA_resources/xxxx.png"))
    val icon_Information = new ImageIcon(getClass.getResource("/lv/yu/sca/SCA_resources/information.gif"))
    val icon_Help        = new ImageIcon(getClass.getResource("/lv/yu/sca/SCA_resources/help.png"))
    val icon_About       = new ImageIcon(getClass.getResource("/lv/yu/sca/SCA_resources/about.gif"))
    val icon_Eng         = new ImageIcon(getClass.getResource("/lv/yu/sca/SCA_resources/prefs.gif"))
    val icon_Rus         = new ImageIcon(getClass.getResource("/lv/yu/sca/SCA_resources/prefs.gif"))
    val icon_Lat         = new ImageIcon(getClass.getResource("/lv/yu/sca/SCA_resources/prefs.gif"))
    val icon_Exit        = new ImageIcon(getClass.getResource("/lv/yu/sca/SCA_resources/exit.png"))

//------------------------------

    val menu_Menu = new JMenu("Menu")
      val item_Start = new JMenuItem("Start", icon_Start)
      val item_Load  = new JMenuItem("Load", icon_Load)
      val item_Xxxx  = new JMenuItem("Xxxx", icon_Xxxx)

    val menu_Start1 = new JMenu("Start1")
      val item_St11 = new JMenuItem("St11")
      val item_St12 = new JMenuItem("St12")

    val menu_Start2 = new JMenu("Start2")
      val item_St21 = new JMenuItem("St21")
      val item_St22 = new JMenuItem("St22")

    val menu_Start3 = new JMenu("Start3")
      val item_St31 = new JMenuItem("St31")
      val item_St32 = new JMenuItem("St32")

    val menu_Help = new JMenu("Help")
      val item_Information = new JMenuItem("Information", icon_Information)
      val item_Help        = new JMenuItem("Help", icon_Help)
      val item_About       = new JMenuItem("About", icon_About)

    val menu_Lang = new JMenu("Lang")
      val item_Eng = new JCheckBoxMenuItem("Eng", icon_Eng)
      val item_Rus = new JCheckBoxMenuItem("Rus", icon_Rus)
      val item_Lat = new JCheckBoxMenuItem("Lat", icon_Lat)

    val menu_Exit = new JMenu("Exit")
      val item_Exit = new JMenuItem("Exit", icon_Exit)

//------------------------------

        menu_Menu.setMnemonic(KeyEvent.VK_M)  //  Alt M
        menu_Menu.setToolTipText("Menu commands")
          item_Start.setToolTipText("Start application")
          item_Load.setToolTipText("Load application")
          item_Xxxx.setToolTipText("Xxxx application")
          item_Start.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK))  //  Alt S
          item_Load.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.ALT_MASK))   //  Alt L
          item_Xxxx.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK))   //  Alt X

        menu_Start1.setMnemonic(KeyEvent.VK_1)  //  Alt 1
        menu_Start1.setToolTipText("Start1 commands")
          item_St11.setToolTipText("St11 application")
          item_St12.setToolTipText("St12 application")

        menu_Start2.setMnemonic(KeyEvent.VK_2)  //  Alt 2
        menu_Start2.setToolTipText("Start2 commands")
          item_St21.setToolTipText("St21 application")
          item_St22.setToolTipText("St22 application")

        menu_Start3.setMnemonic(KeyEvent.VK_3)  //  Alt 3
        menu_Start3.setToolTipText("Start3 commands")
          item_St31.setToolTipText("St31 application")
          item_St32.setToolTipText("St32 application")

        menu_Help.setMnemonic(KeyEvent.VK_H)  //  Alt H
        menu_Help.setToolTipText("Help commands")
          item_Information.setToolTipText("Information application")
          item_Help.setToolTipText("Help application")
          item_About.setToolTipText("About application")

        menu_Lang.setMnemonic(KeyEvent.VK_L)  //  Alt L
        menu_Lang.setToolTipText("Lang commands")
          item_Eng.setToolTipText("Eng application")
          item_Rus.setToolTipText("Rus application")
          item_Lat.setToolTipText("Lat application")
          item_Eng.setSelected(true)

        menu_Exit.setMnemonic(KeyEvent.VK_E)  //  Alt E
        menu_Exit.setToolTipText("Exit commands")
          item_Exit.setToolTipText("Exit application")

//------------------------------

        item_Start.addActionListener       (new ActionListener { def actionPerformed(e: ActionEvent) = { println("Selected menu: " + e.getActionCommand()) } } )
        item_Load.addActionListener        (new ActionListener { def actionPerformed(e: ActionEvent) = { println("Selected menu: " + e.getActionCommand()) } } )
        item_Xxxx.addActionListener        (new ActionListener { def actionPerformed(e: ActionEvent) = { println("Selected menu: " + e.getActionCommand()) } } )
        item_St11.addActionListener        (new ActionListener { def actionPerformed(e: ActionEvent) = { println("Selected menu: " + e.getActionCommand()) } } )
        item_St12.addActionListener        (new ActionListener { def actionPerformed(e: ActionEvent) = { println("Selected menu: " + e.getActionCommand()) } } )
        item_St21.addActionListener        (new ActionListener { def actionPerformed(e: ActionEvent) = { println("Selected menu: " + e.getActionCommand()) } } )
        item_St22.addActionListener        (new ActionListener { def actionPerformed(e: ActionEvent) = { println("Selected menu: " + e.getActionCommand()) } } )
        item_St31.addActionListener        (new ActionListener { def actionPerformed(e: ActionEvent) = { println("Selected menu: " + e.getActionCommand()) } } )
        item_St32.addActionListener        (new ActionListener { def actionPerformed(e: ActionEvent) = { println("Selected menu: " + e.getActionCommand()) } } )
        item_Eng.addActionListener         (new ActionListener { def actionPerformed(e: ActionEvent) = { println("Selected menu: " + e.getActionCommand()) } } )
        item_Rus.addActionListener         (new ActionListener { def actionPerformed(e: ActionEvent) = { println("Selected menu: " + e.getActionCommand()) } } )
        item_Lat.addActionListener         (new ActionListener { def actionPerformed(e: ActionEvent) = { println("Selected menu: " + e.getActionCommand()) } } )
        item_Information.addActionListener (new ActionListener { def actionPerformed(e: ActionEvent) = { println("Selected menu: " + e.getActionCommand()) } } )
        item_Help.addActionListener        (new ActionListener { def actionPerformed(e: ActionEvent) = { println("Selected menu: " + e.getActionCommand()) } } )
        item_About.addActionListener       (new ActionListener { def actionPerformed(e: ActionEvent) = { println("Selected menu: " + e.getActionCommand()) } } )
        item_Exit.addActionListener        (new ActionListener { def actionPerformed(e: ActionEvent) = { System.exit(0) } } )

//------------------------------

        menu_Menu.add(item_Start)
        menu_Menu.add(item_Load)
        menu_Menu.add(item_Xxxx)

        menu_Start1.add(item_St11)
        menu_Start1.add(item_St12)

        menu_Start2.add(item_St21)
        menu_Start2.add(item_St22)

        menu_Start3.add(item_St31)
        menu_Start3.add(item_St32)

        menu_Help.add(item_Information)
        menu_Help.add(item_Help)
        menu_Help.add(item_About)

        menu_Lang.add(item_Eng)
        menu_Lang.add(item_Rus)
        menu_Lang.add(item_Lat)

        menu_Exit.add(item_Exit)

        menubar.add(menu_Menu)
        menubar.add(menu_Start1)
        menubar.add(menu_Start2)
        menubar.add(menu_Start3)
        menubar.add(menu_Help)
        menubar.add(menu_Lang)
        menubar.add(menu_Exit)

        menubar.setLayout( new lv.yu.sca.JAV_LIB_wrap_layout (0, 0, 0) )

//------------------------------

        frame.setJMenuBar(menubar)

//------------------------------

        panel_1.setLayout(new BorderLayout())
        panel_1.setBackground(Color.CYAN)

        panel_3.setLayout(new BorderLayout())
        panel_3.setBackground(Color.lightGray)

        label_info.setText("     Copyright     (c)     Yuri Utkin 2023     mob.+371 12345678     https://www.jago.lv")
        label_info.setForeground(Color.BLACK)

        panel_3.add(label_info, BorderLayout.CENTER)

        frame.getContentPane().add(panel_1, BorderLayout.NORTH)
        frame.getContentPane().add(panel_3, BorderLayout.SOUTH)

//------------------------------

        desktoppane_12.setLayout(new BorderLayout())
        desktoppane_12.setBackground(Color.RED)
        desktoppane_12.setPreferredSize(new Dimension(1000, 500+22))

//------------------------------

    val internalframe_start_12 = new JInternalFrame("12 START START START", true, false, true, true)
        internalframe_start_12.setLayout(new BorderLayout())
        internalframe_start_12.setBackground(Color.GRAY)
        internalframe_start_12.setVisible(true)

//------------------------------

        desktoppane_12.add(internalframe_start_12, BorderLayout.CENTER)

        panel_1.add(desktoppane_12, BorderLayout.CENTER)

//------------------------------

        frame.setVisible(true)

//------------------------------

}  //  end class SCA_06_internal_frame_one

//------------------------------

/**
 * SCALA SCA_06_internal_frame_one
 *
 * @param args[]
 */
object SCA_06_internal_frame_one {

def main(args: Array[String]): Unit = {
                                        SwingUtilities.invokeLater( () => { new SCA_06_internal_frame_one } )
}  //  end main

}  //  end object SCA_06_internal_frame_one

//------------------------------
