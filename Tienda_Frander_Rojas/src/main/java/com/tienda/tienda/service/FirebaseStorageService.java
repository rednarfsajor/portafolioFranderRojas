/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.tienda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {
    
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    final String BucketName ="techshop-ba9b1-.appspot.com"; //id de firebase
    final String rutaSuperiorStorage ="techshop"; //Ruta básica del proyecto
    final String rutaJsonFile ="firebase"; //carpeta de ubicación de la llave privada JSON
    final String archivoJsonFile = "techshop-ba9b1-firebase-adminsdk-k6si2-a33249f0dc.json";//Nombre del archivo JSON de llave privada
    
}
