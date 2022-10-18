package CustomerService;

import java.util.List;

public class MySqlImpl implements CustomerRepository{
    @Override
    public List<String> findNames() {
        return List.of("vanity","brown");
    }
}
