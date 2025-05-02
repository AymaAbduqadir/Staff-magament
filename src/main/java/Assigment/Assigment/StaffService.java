package Assigment.Assigment;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StaffService {
    private final Map<Long, staff.Staff> staffMap = new HashMap<>();
    private Long idCounter = 1L;

    public List<staff.Staff> getAllStaff() {
        return new ArrayList<>(staffMap.values());
    }

    public staff.Staff getStaffById(Long id) {
        return staffMap.get(id);
    }

    public staff.Staff createStaff(staff.Staff staff) {
        staff.setId(idCounter++);
        staffMap.put(staff.getId(), staff);
        return staff;
    }

    public staff.Staff updateStaff(Long id, staff.Staff updatedStaff) {
        if (staffMap.containsKey(id)) {
            updatedStaff.setId(id);
            staffMap.put(id, updatedStaff);
            return updatedStaff;
        }
        return null;
    }

    public boolean deleteStaff(Long id) {
        return staffMap.remove(id) != null;
    }
}
