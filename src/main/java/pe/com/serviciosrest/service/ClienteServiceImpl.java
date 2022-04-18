package pe.com.serviciosrest.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.serviciosrest.entity.Cliente;
import pe.com.serviciosrest.entity.Producto;
import pe.com.serviciosrest.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> finAll() {
        return clienteRepository.findAllCustom();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public List<Cliente> findByName(String name) {
        return clienteRepository.findByName(name);
    }

    @Override
    public Cliente add(Cliente cl) {
        return clienteRepository.save(cl);
    }

    @Override
    public Cliente update(Cliente cl) {
        Cliente objcliente = clienteRepository.getById(cl.getCodigo());
        BeanUtils.copyProperties(cl, objcliente);
        return clienteRepository.save(objcliente);
    }

    @Override
    public Cliente delete(Cliente cl) {
        Cliente objcliente = clienteRepository.getById(cl.getCodigo());
        objcliente.setEstado(false);
        return clienteRepository.save(objcliente);
    }
    
}
