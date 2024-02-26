
/**
 *
 * Scala package     lv.yu.sca
 *
 * Scala program     SCA_02_text.scala     Apache License 2.0
 *
 * Copyright (c)     Yuri Utkin 2023       mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.sca

import javax.swing.JFrame
import javax.swing.ImageIcon
import javax.swing.JScrollPane
import javax.swing.JTextArea

import java.awt.BorderLayout

import javax.swing.WindowConstants

import javax.swing.SwingUtilities

//------------------------------

//  SCA_02_text demonstrates Scala Text in Scala Frame
final class SCA_02_text {

    /** frame */
    val frame = new JFrame()

//------------------------------

    val imgURL     =               getClass.getResource("/lv/yu/sca/SCA_resources/SCA.jpg")
    val icon_frame = new ImageIcon(getClass.getResource("/lv/yu/sca/SCA_resources/SCA.jpg"))

//------------------------------

    val title = "SCALA -- SCA_02_text -- v. 2023.12.12"

        frame.setTitle("     " + title)

        frame.setBounds(10+1*40+150, 10+1*40, 1000, 600)

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)

        frame.setIconImage(icon_frame.getImage())

        frame.setLayout(new BorderLayout())

        frame.setVisible(true)

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

}  //  end class SCA_02_text

//------------------------------

/**
 * SCALA SCA_02_text
 *
 * @param args[]
 */
object SCA_02_text {

def main(args: Array[String]): Unit = {
                                        SwingUtilities.invokeLater( () => { new SCA_02_text } )
}  //  end main

}  //  end object SCA_02_text

//------------------------------
