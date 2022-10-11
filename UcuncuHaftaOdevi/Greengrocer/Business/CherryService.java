package Business;

import Entities.Cherry;

public interface CherryService {
    void Add(Cherry cherry, double kg);
    void Buy(Cherry cherry, double kg);
}
