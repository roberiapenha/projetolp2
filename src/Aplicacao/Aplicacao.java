/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import classes.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author nonet
 */
public class Aplicacao extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Projeto");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        
        /// TESTE DA ÁRVORE BINÁRIA DE BUSCA (inserção, remoção e percursos)
        /*
        Atendente a1 = new Atendente("A1", "", "", "", "", 0, 5);
        Atendente a2 = new Atendente("A2", "", "", "", "", 0, 3);
        Atendente a3 = new Atendente("A3", "", "", "", "", 0, 7);
        Atendente a4 = new Atendente("A4", "", "", "", "", 0, 6);
        Atendente a5 = new Atendente("A5", "", "", "", "", 0, 4);
        Atendente a6 = new Atendente("A6", "", "", "", "", 0, 1);
        
        ArvoreBinariaBusca abb = new ArvoreBinariaBusca();
        abb.inserir(a1);
        abb.inserir(a2);
        abb.inserir(a3);
        abb.inserir(a4);
        abb.inserir(a5);
        abb.inserir(a6);
        
        abb.remover(a1);
        
        abb.printPreOrder();
        abb.printInOrder();
        abb.printPosOrder();
        */
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
