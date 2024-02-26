
/**
 *
 * Scala package     lv.yu.sca
 *
 * Scala program     SCA_01_frame.scala     Apache License 2.0
 *
 * Copyright (c)     Yuri Utkin 2023        mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.sca

import javax.swing.JFrame
import javax.swing.ImageIcon

import java.awt.BorderLayout

import javax.swing.WindowConstants

import javax.swing.SwingUtilities

//------------------------------

/** SCA_01_frame demonstrates Scala Frame */
final class SCA_01_frame {

    /** frame */
    val frame = new JFrame()

//------------------------------

    val imgURL     =               getClass.getResource("/lv/yu/sca/SCA_resources/SCA.jpg")
    val icon_frame = new ImageIcon(getClass.getResource("/lv/yu/sca/SCA_resources/SCA.jpg"))

//------------------------------

    val title = "SCALA -- SCA_01_frame -- v. 2023.12.12"

        frame.setTitle("     " + title)

        frame.setBounds(10+0*40+150, 10+0*40, 1000, 600)

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)

        frame.setIconImage(icon_frame.getImage())

        frame.setLayout(new BorderLayout())

        frame.setVisible(true)

//------------------------------

}  //  end class SCA_01_frame

//------------------------------

/**
 * SCALA SCA_01_frame
 *
 * @param args[]
 */
object SCA_01_frame {

def main(args: Array[String]): Unit = {

                                        SwingUtilities.invokeLater( () => { new           SCA_01_frame } )
                                                                            new lv.yu.sca.SCA_02_text
                                                                            new lv.yu.sca.SCA_03_menu
                                                                            new lv.yu.sca.SCA_04_menu_wrap
                                                                            new lv.yu.sca.SCA_05_action
                                                                            new lv.yu.sca.SCA_06_internal_frame_one
                                                                            new lv.yu.sca.SCA_07_internal_frame_six
}  //  end main

}  //  end object SCA_01_frame

//------------------------------
