package com.rbelchior.marvel.data.remote

object CharactersDtoMother {

    val sampleResponse = """
{
    "code": 200,
    "status": "Ok",
    "copyright": "© 2022 MARVEL",
    "attributionText": "Data provided by Marvel. © 2022 MARVEL",
    "attributionHTML": "<a href=\"http://marvel.com\">Data provided by Marvel. © 2022 MARVEL</a>",
    "etag": "80f5e7fb141d52dd02568e5ae90823cdc43e2793",
    "data": {
        "offset": 0,
        "limit": 1,
        "total": 1559,
        "count": 1,
        "results": [
            {
                "id": 1011334,
                "name": "3-D Man",
                "description": "",
                "modified": "2014-04-29T14:18:17-0400",
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784",
                    "extension": "jpg"
                },
                "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011334",
                "comics": {
                    "available": 1,
                    "collectionURI": "http://gateway.marvel.com/v1/public/characters/1011334/comics",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/comics/21366",
                            "name": "Avengers: The Initiative (2007) #14"
                        }
                    ],
                    "returned": 1
                },
                "series": {
                    "available": 1,
                    "collectionURI": "http://gateway.marvel.com/v1/public/characters/1011334/series",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/series/1945",
                            "name": "Avengers: The Initiative (2007 - 2010)"
                        }
                    ],
                    "returned": 3
                },
                "stories": {
                    "available": 1,
                    "collectionURI": "http://gateway.marvel.com/v1/public/characters/1011334/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/19947",
                            "name": "Cover #19947",
                            "type": "cover"
                        }
                    ],
                    "returned": 1
                },
                "events": {
                    "available": 1,
                    "collectionURI": "http://gateway.marvel.com/v1/public/characters/1011334/events",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/events/269",
                            "name": "Secret Invasion"
                        }
                    ],
                    "returned": 1
                },
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/characters/1011334/3-d_man?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "wiki",
                        "url": "http://marvel.com/universe/3-D_Man_(Chandler)?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "comiclink",
                        "url": "http://marvel.com/comics/characters/1011334/3-d_man?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ]
            }
        ]
    }
}
        """.trimIndent()
}