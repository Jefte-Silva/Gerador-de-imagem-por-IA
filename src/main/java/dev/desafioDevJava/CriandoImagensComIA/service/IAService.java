package
dev.desafioDevJava.CriandoImagensComIA.service;

import org.springframework.stereotype.Service;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Service
public class IAService {
    public String gerarImagem(String prompt){
        return "https://via.placeholder.com/400x300?text=" + URLEncoder.encode(prompt, StandardCharsets.UTF_8); } }