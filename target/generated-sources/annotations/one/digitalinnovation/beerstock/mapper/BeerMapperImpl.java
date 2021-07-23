package one.digitalinnovation.beerstock.mapper;

import javax.annotation.processing.Generated;
import one.digitalinnovation.beerstock.dto.BeerDTO;
import one.digitalinnovation.beerstock.entity.Beer;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-22T20:51:55-0300",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1300.v20210419-1022, environment: Java 16.0.1 (Oracle Corporation)"
)
public class BeerMapperImpl implements BeerMapper {

    @Override
    public Beer toModel(BeerDTO beerDTO) {
        if ( beerDTO == null ) {
            return null;
        }

        Beer beer = new Beer();

        return beer;
    }

    @Override
    public BeerDTO toDTO(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDTO beerDTO = new BeerDTO();

        return beerDTO;
    }
}
