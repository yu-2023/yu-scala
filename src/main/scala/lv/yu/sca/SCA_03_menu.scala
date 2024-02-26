
/**
 *
 * Scala package     lv.yu.sca
 *
 * Scala program     SCA_03_menu.scala     Apache License 2.0
 *
 * Copyright (c)     Yuri Utkin 2023       mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.sca

import javax.swing.JFrame
import javax.swing.ImageIcon
import javax.swing.JScrollPane
import javax.swing.JTextArea
import javax.swing.JMenu
import javax.swing.JMenuBar
import javax.swing.JMenuItem
import javax.swing.JCheckBoxMenuItem
import javax.swing.KeyStroke

import java.awt.BorderLayout

import java.awt.event.KeyEvent
import java.awt.event.ActionEvent

import javax.swing.WindowConstants

import javax.swing.SwingUtilities

//------------------------------

//  SCA_03_menu demonstrates Scala Menu in Scala Frame
final class SCA_03_menu {

    /** frame */
    val frame = new JFrame()
    /** manubar */
    val menubar = new JMenuBar()

//------------------------------

    val imgURL     =               getClass.getResource("/lv/yu/sca/SCA_resources/SCA.jpg")
    val icon_frame = new ImageIcon(getClass.getResource("/lv/yu/sca/SCA_resources/SCA.jpg"))

//------------------------------

    val title = "SCALA -- SCA_03_menu -- v. 2023.12.12"

        frame.setTitle("     " + title)

        frame.setBounds(10+2*40+150, 10+2*40, 1000, 600)

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

//------------------------------

        frame.setJMenuBar(menubar)

//------------------------------

    val textarea   = new JTextArea()
    val scrollpane = new JScrollPane(textarea)

        textarea.setText("" +
"        \r\n" +
"        💞️💞️ EN\r\n" +
"        \r\n" +
"        Comparative analysis of programming in Java, Kotlin, Clojure, Groovy, Scala and Jython.\r\n" +
"        \r\n" +
"        How to Program Java, Kotlin, Clojure, Groovy, Scala and Jython Simultaneously.\r\n" +
"        \r\n" +
"        Integration of Java, Kotlin, Clojure, Groovy, Scala and Jython in one software product.\r\n" +
"        \r\n" +
"        \r\n" +
"        \r\n" +
"        👋👋 RU\r\n" +
"        \r\n" +
"        Сравнительный анализ программирование на Java, Kotlin, Clojure, Groovy, Scala и Jython.\r\n" +
"        \r\n" +
"        Как программировать одновременно на Java, Kotlin, Clojure, Groovy, Scala и Jython.\r\n" +
"        \r\n" +
"        Интеграция Java, Kotlin, Clojure, Groovy, Scala и Jython в одном программном продукте.\r\n" +
"        \r\n" +
"        \r\n" +
"        \r\n" +
"        🌱🌱 LV\r\n" +
"        \r\n" +
"        Java, Kotlin, Clojure, Groovy, Scala un Jython programmēšanas salīdzinošā analīze.\r\n" +
"        \r\n" +
"        Kā programmēt Java, Kotlin, Clojure, Groovy, Scala un Jython vienlaicīgi.\r\n" +
"        \r\n" +
"        Java, Kotlin, Clojure, Groovy, Scala un Jython integrācija vienā programmatūras produktā.\r\n" +
"        \r\n" +
                         "")

        frame.getContentPane().add(scrollpane, BorderLayout.CENTER)

        frame.setVisible(true)

//------------------------------

}  //  end class SCA_03_menu

//------------------------------

/**
 * SCALA SCA_03_menu
 *
 * @param args[]
 */
object SCA_03_menu {

def main(args: Array[String]): Unit = {
                                        SwingUtilities.invokeLater( () => { new SCA_03_menu } )
}  //  end main

}  //  end object SCA_03_menu

//------------------------------
