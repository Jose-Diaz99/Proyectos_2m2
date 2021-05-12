/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.backend.dao;

import java.io.IOException;
import java.util.Collection;
import ni.edu.uni.fcys.programacion2.backend.pojo.Vehicle;

/**
 *
 * @author LENOVO 17
 */
public interface VehicleDao extends Dao<Vehicle>{
    Vehicle findById(int id) throws IOException;
    Collection<Vehicle> findByStatus(String status) throws IOException;
}
