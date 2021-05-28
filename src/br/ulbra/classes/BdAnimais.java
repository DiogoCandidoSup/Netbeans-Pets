package br.ulbra.classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Jeferson Assunto: Será implementado nesta classe o "banco de Dados" -
 * ArrayList
 */
public class BdAnimais 
{

    public List<Animal> bdAnimais;

    public BdAnimais() 
    {
        bdAnimais = new ArrayList<Animal>();
    }

    public void adicionar(Animal p) 
    {
        bdAnimais.add(p);
        JOptionPane.showMessageDialog(null, p.getNome() + ", foi salvo com Sucesso!");
    }
    
    public void excluir(int i)
    {
        if(JOptionPane.showConfirmDialog(null,"Tem certeza que deseja excluir o(a) "
          +bdAnimais.get(i).getNome()
                +"?","Exclusão",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null, "O(A) "+bdAnimais.get(i).getNome()
                    +" foi excluido(a) com sucesso!");
            bdAnimais.remove(i);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Exclusão cancelada!!");
        }
    }
    
    public void alterar(int i, Animal p)
    {
        bdAnimais.set(i, p);
        JOptionPane.showMessageDialog(null ,"Registro modificado com Sucesso!!");
    }
    
    public String Ordenar()
    {
          Collections.sort(bdAnimais);
          JOptionPane.showMessageDialog(null, "Ordenado com sucesso");
          String resultado = "Animais cadastrados\n";
        if (!bdAnimais.isEmpty()) 
        {
            for (int i = 0; i < bdAnimais.size(); i++) 
            {
               // resultado = resultado + bdAgenda.get(i).getNome()+" "+bdAgenda.get(i).getSobre() + "\n";
                resultado = resultado + (i+1) + " - " + bdAnimais.get(i).toString() + "\n";
            }
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Agenda Vazia!");
        }
        return resultado;
    
    }
    
    public String mostrar() 
    {
      
        String resultado = "Animais cadastrados\n";
        if (!bdAnimais.isEmpty()) {
            for (int i = 0; i < bdAnimais.size(); i++) 
            {
               // resultado = resultado + bdAgenda.get(i).getNome()+" "+bdAgenda.get(i).getSobre() + "\n";
                resultado = resultado +(i+1)+" - "+bdAnimais.get(i).toString() + "\n";
            }
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Agenda Vazia!");
        }
        return resultado;
    }
    
    public int encontrar(Animal p)
    {
        int aux=-1;
        for (int i=0; i<bdAnimais.size();i++)
        {
            if(bdAnimais.get(i).getNome().equals(p.getNome()))
            {
                aux = i;
            }
        }
            return aux;
        }
    
    public Animal getAnimal(int i)
    {
        return bdAnimais.get(i);
    }
}
