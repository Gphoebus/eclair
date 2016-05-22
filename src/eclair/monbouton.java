/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eclair;

import javax.swing.JButton;

/**
 *
 * @author phoebus
 */
public class monbouton extends JButton{
   private int numero=0;
   private String texte_question = null;
    public monbouton()
    {
        
    }
    public void setnumber(int _numero)
    {
        numero=_numero;
    } 
    
    public int getnumber()
    {
        return numero;
    }

    /**
     * @return the texte_question
     */
    public String getTexte_question() {
        return texte_question;
    }

    /**
     * @param texte_question the texte_question to set
     */
    public void setTexte_question(String texte_question) {
        this.texte_question = texte_question;
    }
    public void affiche()
    {
        this.setText(texte_question);
    }
}
