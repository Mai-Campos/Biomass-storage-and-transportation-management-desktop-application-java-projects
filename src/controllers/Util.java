/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.io.File;
import java.net.URISyntaxException;
import javax.swing.JTable;
import javax.swing.table.TableColumn;


public class Util {
     private static String getJarName()
    {
        return new File(Util.class.getProtectionDomain()
                .getCodeSource()
                .getLocation()
                .getPath())
                .getName();
    }

    private static boolean runningFromJAR()
    {
        String jarName = getJarName();
        return jarName.contains(".jar");
    }

    public static String getProgramDirectory()
    {
        if (runningFromJAR())
        {
            return getCurrentJARDirectory();
        } else
        {
            return getCurrentProjectDirectory();
        }
    }

    private static String getCurrentProjectDirectory()
    {
        return new File("").getAbsolutePath();
    }

    private static String getCurrentJARDirectory()
    {
        try
        {
            return new File(Util.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getParent();
        } catch (URISyntaxException exception)
        {
            exception.printStackTrace();
        }

        return null;
    }    
    
   
    
    public void prepareFolder(File file, String path) {
        File dir = new File(path + "data");            

        if (!dir.isDirectory()) {
            dir.mkdirs();
        } else {
            if (file.exists()) {
                file.delete();
            }
        }        
    }       
    
}
