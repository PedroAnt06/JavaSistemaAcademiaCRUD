package service;

import entities.Cliente;
import entities.Plano;

import java.util.ArrayList;
import java.util.List;

public class AcademiaService {
    private final List<Cliente> clientes = new ArrayList<>();
    private int nextId = 1;

    public Cliente cadastrar(String nome, String telefone, Plano plano) {
        Cliente c = new Cliente(nextId++, nome, telefone, plano);
        clientes.add(c);
        return c;
    }

    public List<Cliente> listar() {
        return clientes;
    }

    public Cliente buscarPorId(int id) {
        for (Cliente c : clientes) {
            if (c.getId() == id)
                return c;
        }
        return null;
    }

    public boolean editar(int id, String novoNome, String novoTelefone, Plano novoPlano) {
        Cliente c = buscarPorId(id);
        if (c == null) return false;

        c.setNome(novoNome);
        c.setTelefone(novoTelefone);
        c.setPlano(novoPlano);
        return true;
    }

    public boolean inativar(int id) {
        Cliente c = buscarPorId(id);
        if (c == null)
            return false;
        c.inativar();
        return true;
    }

    public boolean marcarMensalidade(int id, boolean pago) {
        Cliente c = buscarPorId(id);
        if (c == null)
            return false;
        if (pago == true)
            c.marcarPago();
        else
            c.marcarNaoPago();
        return true;
    }

    public List<Cliente> listarInadimplentes() {
        List<Cliente> inadimplentes = new ArrayList<>();
        for (Cliente c : clientes) {
            if (c.isAtivo() && !c.isMensalidadePaga()) {
                inadimplentes.add(c);
            }
        }
        return inadimplentes;
    }
}
