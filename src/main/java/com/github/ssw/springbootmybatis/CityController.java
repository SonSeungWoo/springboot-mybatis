package com.github.ssw.springbootmybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * Created by Leo.
 * User: sonseungwoo
 * Date: 2019-02-22
 * Time: 21:37
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/city")
public class CityController {

    private final CityService cityService;


    @GetMapping("/{cityId}")
    public ResponseEntity<ExResponse> getCity(@PathVariable Long cityId) {
        City city = cityService.getCityById(cityId);
        return ResponseEntity.ok(
                new ExResponse.Builder<>(city)
                        .setIsSucceed(true)
                        .setIsWarning(false)
                        .build());
    }

    @PostMapping
    public ResponseEntity<ExResponse> getCityList(@RequestBody RequestDto<CityDto.CityData> requestDto) {
        CityDto.CityListData cityList = cityService.getAllCity(requestDto.getRequest());
        return ResponseEntity.ok(
                new ExResponse.Builder<>(cityList)
                        .setIsSucceed(true)
                        .setIsWarning(false)
                        .build());
    }

    @PutMapping
    public ResponseEntity<ExResponse> mergeCity(@Valid @RequestBody RequestDto<List<City>> requestDto) {
        cityService.mergeCity(requestDto.getRequest());
        return ResponseEntity.ok(
                new ExResponse.Builder<>("SUCCESS")
                        .setIsSucceed(true)
                        .setIsWarning(false)
                        .build());
    }

    @DeleteMapping
    public ResponseEntity<ExResponse> deleteCity(@RequestBody RequestDto<City> requestDto){
        return ResponseEntity.ok(
                new ExResponse.Builder<>("SUCCESS")
                        .setIsSucceed(true)
                        .setIsWarning(false)
                        .build());
    }

    @GetMapping("/test")
    public ResponseEntity<String> resultHtml() {
        String html = "<html><body>test</body></html>";
        return ResponseEntity.ok(html);
    }

}
