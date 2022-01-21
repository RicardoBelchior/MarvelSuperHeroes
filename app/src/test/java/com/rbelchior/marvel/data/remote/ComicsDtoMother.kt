package com.rbelchior.marvel.data.remote

object ComicsDtoMother {

    val comicsListSampleResponse = """
{
    "code": 200,
    "status": "Ok",
    "copyright": "© 2022 MARVEL",
    "attributionText": "Data provided by Marvel. © 2022 MARVEL",
    "attributionHTML": "<a href=\"http://marvel.com\">Data provided by Marvel. © 2022 MARVEL</a>",
    "etag": "3fa2afcafca234e2b9b945662c289fe621d925c8",
    "data": {
        "offset": 0,
        "limit": 100,
        "total": 37,
        "count": 37,
        "results": [
            {
                "id": 95052,
                "digitalId": 56901,
                "title": "Marvel's Voices: Pride (2021) #1",
                "issueNumber": 1,
                "variantDescription": "",
                "description": null,
                "modified": "2021-06-17T11:05:07-0400",
                "isbn": "",
                "upc": "75960620185300111",
                "diamondCode": "APR210808",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 88,
                "textObjects": [],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/95052",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/95052/marvels_voices_pride_2021_1?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/MARVEL-S-VOICES-PRIDE-1-1/digital-comic/56901?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=56901&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/56901?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/32375",
                    "name": "Marvel's Voices: Pride (2021)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2021-06-23T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2021-05-31T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2021-09-27T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2021-06-23T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 9.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 9.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/6/40/60cd0f40b0989",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/6/40/60cd0f40b0989",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 35,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/95052/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/14282",
                            "name": "Claudia Aguirre",
                            "role": "penciler"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11575",
                            "name": "Kris Anka",
                            "role": "penciler"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12998",
                            "name": "Jan Bazaldua",
                            "role": "penciler"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/14271",
                            "name": "Samantha Dodge",
                            "role": "penciler"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13162",
                            "name": "Erick Arciniega",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12744",
                            "name": "Tamra Bonvillain",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/8653",
                            "name": "Jacopo Camagni",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13021",
                            "name": "David Curiel",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12990",
                            "name": "Paulina Ganucheau",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13590",
                            "name": "Vita Ayala",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/14184",
                            "name": "Terry Blas",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/14148",
                            "name": "Crystal Frasier",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/8901",
                            "name": "Kieron Gillen",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/358",
                            "name": "Allan Heinberg",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13200",
                            "name": "Sarah Brunstad",
                            "role": "editor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13526",
                            "name": "Derek Charm",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/357",
                            "name": "Jim Cheung",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/14192",
                            "name": "Joanna Estep",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12426",
                            "name": "Javier Garron",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/14264",
                            "name": "Jennifer Hickman",
                            "role": "inker"
                        }
                    ],
                    "returned": 20
                },
                "characters": {
                    "available": 18,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/95052/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009185",
                            "name": "Black Cat"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011001",
                            "name": "Daken"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009271",
                            "name": "Destiny"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009343",
                            "name": "Hercules"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009355",
                            "name": "Hulkling"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009362",
                            "name": "Iceman"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011386",
                            "name": "Karma"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010752",
                            "name": "Karolina Dean "
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010450",
                            "name": "Lightspeed"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009427",
                            "name": "Marvel Boy"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009465",
                            "name": "Mystique"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010746",
                            "name": "Nico Minoru"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009476",
                            "name": "Northstar"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011030",
                            "name": "Prodigy"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009542",
                            "name": "Rictor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010833",
                            "name": "Speed"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009714",
                            "name": "Wiccan"
                        }
                    ],
                    "returned": 18
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/95052/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/211232",
                            "name": "cover from Marvel's Voices: Pride (2021) #1",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/211233",
                            "name": "story from Marvel's Voices: Pride (2021) #1",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/95052/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 80560,
                "digitalId": 54932,
                "title": "Strikeforce (2019) #9",
                "issueNumber": 9,
                "variantDescription": "",
                "description": null,
                "modified": "2019-06-24T09:28:39-0400",
                "isbn": "",
                "upc": "759606095101000911",
                "diamondCode": "MAR201045",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/80560",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/80560/strikeforce_2019_9?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Strikeforce-9/digital-comic/54932?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=54932&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/54932?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/27891",
                    "name": "Strikeforce (2019 - 2020)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2020-08-05T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2020-07-13T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2020-11-09T00:00:00-0500"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2020-08-05T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/3/e0/5f282d442496e",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/3/e0/5f282d442496e",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 9,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80560/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12239",
                            "name": "Guru Efx",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13536",
                            "name": "Tini Howard",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13038",
                            "name": "Daniel Mora",
                            "role": "inker (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12376",
                            "name": "Wilson Moss",
                            "role": "editor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12435",
                            "name": "German Peralta",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10344",
                            "name": "Juan Jose Ryp",
                            "role": "penciler (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12974",
                            "name": "Vc Joe Sabino",
                            "role": "letterer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10279",
                            "name": "Matthew Wilson",
                            "role": "colorist (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13003",
                            "name": "Nolan Woodard",
                            "role": "colorist (cover)"
                        }
                    ],
                    "returned": 9
                },
                "characters": {
                    "available": 8,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80560/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009191",
                            "name": "Blade"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010719",
                            "name": "Daimon Hellstrom"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009268",
                            "name": "Deadpool"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010705",
                            "name": "Spectrum"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009608",
                            "name": "Spider-Woman (Jessica Drew)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009714",
                            "name": "Wiccan"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010740",
                            "name": "Winter Soldier"
                        }
                    ],
                    "returned": 8
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80560/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/178246",
                            "name": "cover from Strikeforce (2019) #9",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/178247",
                            "name": "story from Strikeforce (2019) #9",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80560/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 80559,
                "digitalId": 54656,
                "title": "Strikeforce (2019) #8",
                "issueNumber": 8,
                "variantDescription": "",
                "description": null,
                "modified": "2020-07-13T11:26:55-0400",
                "isbn": "",
                "upc": "759606095101000811",
                "diamondCode": "FEB200991",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/80559",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/80559/strikeforce_2019_8?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Strikeforce-8/digital-comic/54656?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=54656&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/54656?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/27891",
                    "name": "Strikeforce (2019 - 2020)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2020-07-15T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2020-03-09T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2020-10-19T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2020-07-15T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/a/80/5e7e69e393c5f",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/a/80/5e7e69e393c5f",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 7,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80559/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12239",
                            "name": "Guru Efx",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13536",
                            "name": "Tini Howard",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12376",
                            "name": "Wilson Moss",
                            "role": "editor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12435",
                            "name": "German Peralta",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10344",
                            "name": "Juan Jose Ryp",
                            "role": "penciler (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12974",
                            "name": "Vc Joe Sabino",
                            "role": "letterer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10279",
                            "name": "Matthew Wilson",
                            "role": "colorist (cover)"
                        }
                    ],
                    "returned": 7
                },
                "characters": {
                    "available": 7,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80559/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009191",
                            "name": "Blade"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010719",
                            "name": "Daimon Hellstrom"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010705",
                            "name": "Spectrum"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009608",
                            "name": "Spider-Woman (Jessica Drew)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009714",
                            "name": "Wiccan"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010740",
                            "name": "Winter Soldier"
                        }
                    ],
                    "returned": 7
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80559/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/178244",
                            "name": "cover from Strikeforce (2019) #8",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/178245",
                            "name": "story from Strikeforce (2019) #8",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80559/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 80558,
                "digitalId": 54329,
                "title": "Strikeforce (2019) #7",
                "issueNumber": 7,
                "variantDescription": "",
                "description": null,
                "modified": "2020-02-27T13:33:03-0500",
                "isbn": "",
                "upc": "759606095101000711",
                "diamondCode": "JAN201003",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/80558",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/80558/strikeforce_2019_7?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Strikeforce-7/digital-comic/54329?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=54329&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/54329?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/27891",
                    "name": "Strikeforce (2019 - 2020)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2020-03-04T00:00:00-0500"
                    },
                    {
                        "type": "focDate",
                        "date": "2020-02-10T00:00:00-0500"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2020-09-07T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2020-03-04T00:00:00-0500"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/9/40/5e53eb29c9c00",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/9/40/5e53eb29c9c00",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 7,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80558/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12239",
                            "name": "Guru Efx",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13536",
                            "name": "Tini Howard",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12376",
                            "name": "Wilson Moss",
                            "role": "editor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12435",
                            "name": "German Peralta",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10344",
                            "name": "Juan Jose Ryp",
                            "role": "penciler (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12974",
                            "name": "Vc Joe Sabino",
                            "role": "letterer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10279",
                            "name": "Matthew Wilson",
                            "role": "colorist (cover)"
                        }
                    ],
                    "returned": 7
                },
                "characters": {
                    "available": 7,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80558/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009191",
                            "name": "Blade"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010719",
                            "name": "Daimon Hellstrom"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009268",
                            "name": "Deadpool"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010705",
                            "name": "Spectrum"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009608",
                            "name": "Spider-Woman (Jessica Drew)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009714",
                            "name": "Wiccan"
                        }
                    ],
                    "returned": 7
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80558/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/178242",
                            "name": "cover from Strikeforce (2019) #7",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/178243",
                            "name": "story from Strikeforce (2019) #7",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80558/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 80555,
                "digitalId": 53298,
                "title": "Strikeforce (2019) #4",
                "issueNumber": 4,
                "variantDescription": "",
                "description": null,
                "modified": "2019-09-25T09:07:06-0400",
                "isbn": "",
                "upc": "759606095101000411",
                "diamondCode": "OCT191048",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/80555",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/80555/strikeforce_2019_4?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Strikeforce-4/digital-comic/53298?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=53298&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/53298?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/27891",
                    "name": "Strikeforce (2019 - 2020)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2019-12-11T00:00:00-0500"
                    },
                    {
                        "type": "focDate",
                        "date": "2019-11-11T00:00:00-0500"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2020-06-15T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2019-12-11T00:00:00-0500"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/6/e0/5de5498b44e60",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/6/e0/5de5498b44e60",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 11,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80555/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11543",
                            "name": "Dan Brown",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12239",
                            "name": "Guru Efx",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13199",
                            "name": "Marika Cresta",
                            "role": "penciler"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/9089",
                            "name": "Max Fiumara",
                            "role": "penciler"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12437",
                            "name": "Stacey Lee",
                            "role": "penciler"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13536",
                            "name": "Tini Howard",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12376",
                            "name": "Wilson Moss",
                            "role": "editor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12435",
                            "name": "German Peralta",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10344",
                            "name": "Juan Jose Ryp",
                            "role": "penciler (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12974",
                            "name": "Vc Joe Sabino",
                            "role": "letterer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10279",
                            "name": "Matthew Wilson",
                            "role": "colorist (cover)"
                        }
                    ],
                    "returned": 11
                },
                "characters": {
                    "available": 6,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80555/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009191",
                            "name": "Blade"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010705",
                            "name": "Spectrum"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009608",
                            "name": "Spider-Woman (Jessica Drew)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009714",
                            "name": "Wiccan"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010740",
                            "name": "Winter Soldier"
                        }
                    ],
                    "returned": 6
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80555/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/178236",
                            "name": "cover from Strikeforce (2019) #4",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/178237",
                            "name": "story from Strikeforce (2019) #4",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80555/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 80552,
                "digitalId": 52810,
                "title": "Strikeforce (2019) #2",
                "issueNumber": 2,
                "variantDescription": "",
                "description": null,
                "modified": "2019-07-26T09:07:29-0400",
                "isbn": "",
                "upc": "759606095101000211",
                "diamondCode": "AUG191085",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/80552",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/80552/strikeforce_2019_2?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Strikeforce-2/digital-comic/52810?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=52810&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/52810?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/27891",
                    "name": "Strikeforce (2019 - 2020)"
                },
                "variants": [
                    {
                        "resourceURI": "http://gateway.marvel.com/v1/public/comics/79810",
                        "name": "Strikeforce (2019) #2 (Variant)"
                    }
                ],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2019-10-23T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2019-09-30T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2020-04-27T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2019-10-23T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/8/10/5da4ca9bcfcbe",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/8/10/5da4ca9bcfcbe",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 7,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80552/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13536",
                            "name": "Tini Howard",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12376",
                            "name": "Wilson Moss",
                            "role": "editor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13028",
                            "name": "Miroslav Mrva",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12435",
                            "name": "German Peralta",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12974",
                            "name": "Vc Joe Sabino",
                            "role": "letterer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12462",
                            "name": "Andrea Sorrentino",
                            "role": "penciler (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/442",
                            "name": "Dean White",
                            "role": "colorist (cover)"
                        }
                    ],
                    "returned": 7
                },
                "characters": {
                    "available": 7,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80552/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009191",
                            "name": "Blade"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010719",
                            "name": "Daimon Hellstrom"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010705",
                            "name": "Spectrum"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009608",
                            "name": "Spider-Woman (Jessica Drew)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009714",
                            "name": "Wiccan"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010740",
                            "name": "Winter Soldier"
                        }
                    ],
                    "returned": 7
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80552/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/178230",
                            "name": "cover from Strikeforce (2019) #2",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/178231",
                            "name": "story from Strikeforce (2019) #2",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/80552/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 78928,
                "digitalId": 52593,
                "title": "Strikeforce (2019) #1",
                "issueNumber": 1,
                "variantDescription": "",
                "description": null,
                "modified": "2019-06-27T09:28:51-0400",
                "isbn": "",
                "upc": "759606095101000111",
                "diamondCode": "JUL190842",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/78928",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/78928/strikeforce_2019_1?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Strikeforce-1/digital-comic/52593?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=52593&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/27891",
                    "name": "Strikeforce (2019 - 2020)"
                },
                "variants": [
                    {
                        "resourceURI": "http://gateway.marvel.com/v1/public/comics/78338",
                        "name": "Strikeforce (2019) #1 (Variant)"
                    },
                    {
                        "resourceURI": "http://gateway.marvel.com/v1/public/comics/78554",
                        "name": "Strikeforce (2019) #1 (Variant)"
                    },
                    {
                        "resourceURI": "http://gateway.marvel.com/v1/public/comics/78929",
                        "name": "Strikeforce (2019) #1 (Variant)"
                    },
                    {
                        "resourceURI": "http://gateway.marvel.com/v1/public/comics/78930",
                        "name": "Strikeforce (2019) #1 (Variant)"
                    },
                    {
                        "resourceURI": "http://gateway.marvel.com/v1/public/comics/78931",
                        "name": "Strikeforce (2019) #1 (Variant)"
                    },
                    {
                        "resourceURI": "http://gateway.marvel.com/v1/public/comics/82551",
                        "name": "Strikeforce (2019) #1 (Variant)"
                    }
                ],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2019-09-25T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2019-09-02T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2020-03-30T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2019-09-20T11:50:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/5/f0/5d84f2cd11134",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/5/f0/5d84f2cd11134",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 7,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/78928/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12989",
                            "name": "Jordie Bellaire",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13536",
                            "name": "Tini Howard",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12376",
                            "name": "Wilson Moss",
                            "role": "editor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12435",
                            "name": "German Peralta",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12974",
                            "name": "Vc Joe Sabino",
                            "role": "letterer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12462",
                            "name": "Andrea Sorrentino",
                            "role": "penciler (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/442",
                            "name": "Dean White",
                            "role": "colorist (cover)"
                        }
                    ],
                    "returned": 7
                },
                "characters": {
                    "available": 7,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/78928/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009191",
                            "name": "Blade"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010719",
                            "name": "Daimon Hellstrom"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010705",
                            "name": "Spectrum"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009608",
                            "name": "Spider-Woman (Jessica Drew)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009714",
                            "name": "Wiccan"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010740",
                            "name": "Winter Soldier"
                        }
                    ],
                    "returned": 7
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/78928/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/174878",
                            "name": "cover from Strikeforce (2019) #1",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/174879",
                            "name": "story from Strikeforce (2019) #1",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/78928/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 73998,
                "digitalId": 51715,
                "title": "Asgardians of the Galaxy (2018) #10",
                "issueNumber": 10,
                "variantDescription": "",
                "description": null,
                "modified": "2019-06-12T09:02:14-0400",
                "isbn": "",
                "upc": "75960609118801011",
                "diamondCode": "APR190762",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/73998",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/73998/asgardians_of_the_galaxy_2018_10?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Asgardians-of-the-Galaxy-10/digital-comic/51715?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=51715&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/51715?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/25996",
                    "name": "Asgardians of the Galaxy (2018 - Present)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2019-06-12T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2019-05-20T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2019-12-16T00:00:00-0500"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2019-06-12T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/f/10/5cf826abc72ba",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/f/10/5cf826abc72ba",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/5/c0/5cf7dcdd8fd0e",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 7,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/73998/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13180",
                            "name": "Federico Blee",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13200",
                            "name": "Sarah Brunstad",
                            "role": "editor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10023",
                            "name": "Cullen Bunn",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/428",
                            "name": "Antonio Fabela",
                            "role": "colorist (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13617",
                            "name": "Luca Maresca",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12980",
                            "name": "Vc Cory Petit",
                            "role": "letterer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12369",
                            "name": "Gerardo Sandoval",
                            "role": "penciler (cover)"
                        }
                    ],
                    "returned": 7
                },
                "characters": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/73998/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011389",
                            "name": "Frog Thor"
                        }
                    ],
                    "returned": 2
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/73998/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/164810",
                            "name": "cover from Asgardians of the Galaxy (2018) #10",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/164811",
                            "name": "story from Asgardians of the Galaxy (2018) #10",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/73998/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 73996,
                "digitalId": 51122,
                "title": "Asgardians of the Galaxy (2018) #8",
                "issueNumber": 8,
                "variantDescription": "",
                "description": "WAR OF THE REALMS TIE-IN! Bit by bit, the Dark Elf King Malekith has been taking over the Ten Realms. Now at last every realm has fallen save one: Midgard. The invasion has begun, and Earth’s Mightiest Heroes will need all the help they can get. The Asgardians of the Galaxy join the battle for the Tenth Realm!\n",
                "modified": "2019-04-10T09:03:50-0400",
                "isbn": "",
                "upc": "75960609118800811",
                "diamondCode": "FEB190778",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "WAR OF THE REALMS TIE-IN! Bit by bit, the Dark Elf King Malekith has been taking over the Ten Realms. Now at last every realm has fallen save one: Midgard. The invasion has begun, and Earth’s Mightiest Heroes will need all the help they can get. The Asgardians of the Galaxy join the battle for the Tenth Realm!\n"
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/73996",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/73996/asgardians_of_the_galaxy_2018_8?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Asgardians-of-the-Galaxy-8/digital-comic/51122?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=51122&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/51122?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/25996",
                    "name": "Asgardians of the Galaxy (2018 - Present)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2019-04-10T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2019-03-18T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2019-10-14T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2019-04-10T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/c/10/5ca3bc5f952d0",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/c/10/5ca3bc5f952d0",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/9/40/5c51f69ba0b56",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 7,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/73996/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13180",
                            "name": "Federico Blee",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13200",
                            "name": "Sarah Brunstad",
                            "role": "editor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10023",
                            "name": "Cullen Bunn",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/428",
                            "name": "Antonio Fabela",
                            "role": "colorist (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/9081",
                            "name": "Matteo Lolli",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12980",
                            "name": "Vc Cory Petit",
                            "role": "letterer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12369",
                            "name": "Gerardo Sandoval",
                            "role": "penciler (cover)"
                        }
                    ],
                    "returned": 7
                },
                "characters": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/73996/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011389",
                            "name": "Frog Thor"
                        }
                    ],
                    "returned": 2
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/73996/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/164806",
                            "name": "cover from Asgardians of the Galaxy (2018) #8",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/164807",
                            "name": "story from Asgardians of the Galaxy (2018) #8",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/73996/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 71309,
                "digitalId": 0,
                "title": "Asgardians Of The Galaxy Vol. 1: The Infinity Armada (Trade Paperback)",
                "issueNumber": 0,
                "variantDescription": "",
                "description": "Collects Asgardians Of The Galaxy #1-5.\n\nSpinning out of INFINITY WARS comes an epic space opera! Angela, Thor’s half-sister. The hotheaded Valkyrie — and Annabelle Riggs, the human whoshares her form. Skurge the Executioner, freshly returned from Hel. Throg, the mighty frog of thunder. Kevin Masterson, the boy who took his father’s mace to become the hero Thunderstrike. And the Destroyer, the Asgardian armor built to take down Celestials — its current occupant unknown. A team of murderers, assassins, heroes — and frogs — assembles to save the universe from a weapon even Thor himself would fear to fight! Thanos’ deadly granddaughter, Nebula, is out to rule the galaxy — and not even the dead will stand in her way! Allied uneasily with Loki and targeted by the Nova Corps, can the Asgardians possibly triumph over Nebula’s armada?",
                "modified": "2019-03-29T09:18:18-0400",
                "isbn": "978-1-302-91471-4",
                "upc": "",
                "diamondCode": "JAN191098",
                "ean": "9781302 914714 51599",
                "issn": "",
                "format": "Trade Paperback",
                "pageCount": 112,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "Collects Asgardians Of The Galaxy #1-5.\n\nSpinning out of INFINITY WARS comes an epic space opera! Angela, Thor’s half-sister. The hotheaded Valkyrie — and Annabelle Riggs, the human whoshares her form. Skurge the Executioner, freshly returned from Hel. Throg, the mighty frog of thunder. Kevin Masterson, the boy who took his father’s mace to become the hero Thunderstrike. And the Destroyer, the Asgardian armor built to take down Celestials — its current occupant unknown. A team of murderers, assassins, heroes — and frogs — assembles to save the universe from a weapon even Thor himself would fear to fight! Thanos’ deadly granddaughter, Nebula, is out to rule the galaxy — and not even the dead will stand in her way! Allied uneasily with Loki and targeted by the Nova Corps, can the Asgardians possibly triumph over Nebula’s armada?"
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/71309",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/collection/71309/asgardians_of_the_galaxy_vol_1_the_infinity_armada_trade_paperback?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/ASGARDIANS-OF-THE-GALAXY-VOL-1-THE-INFINITY-ARMADA-TPB-0/digital-comic/50980?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/25997",
                    "name": "Asgardians Of The Galaxy Vol. 1: The Infinity Armada (2019)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2019-03-27T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2019-02-04T00:00:00-0500"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 15.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/9/90/5c93d434a72ef",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/9/90/5c93d434a72ef",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 3,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71309/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10023",
                            "name": "Cullen Bunn",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/241",
                            "name": "Dale Keown",
                            "role": "penciller (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/4430",
                            "name": "Jeff Youngquist",
                            "role": "editor"
                        }
                    ],
                    "returned": 3
                },
                "characters": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71309/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1012378",
                            "name": "Executioner (Skurge)"
                        }
                    ],
                    "returned": 2
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71309/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/158594",
                            "name": "cover from ASGARDIANS OF THE GALAXY TPB (2019) #1",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/158595",
                            "name": "story from ASGARDIANS OF THE GALAXY TPB (2019) #1",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71309/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 73995,
                "digitalId": 50916,
                "title": "Asgardians of the Galaxy (2018) #7",
                "issueNumber": 7,
                "variantDescription": "",
                "description": null,
                "modified": "2019-01-04T09:04:21-0500",
                "isbn": "",
                "upc": "75960609118800711",
                "diamondCode": "JAN190892",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/73995",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/73995/asgardians_of_the_galaxy_2018_7?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Asgardians-of-the-Galaxy-7/digital-comic/50916?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=50916&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/50916?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/25996",
                    "name": "Asgardians of the Galaxy (2018 - Present)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2019-03-13T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2019-02-18T00:00:00-0500"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2019-09-16T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2019-03-13T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/5/e0/5c802d4d1317c",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/5/e0/5c802d4d1317c",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/9/a0/5c23d57797aca",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 7,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/73995/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13180",
                            "name": "Federico Blee",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13200",
                            "name": "Sarah Brunstad",
                            "role": "editor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11798",
                            "name": "Matteo Buffagni",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/9457",
                            "name": "Stefano Landini",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10023",
                            "name": "Cullen Bunn",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12472",
                            "name": "Jamal Campbell",
                            "role": "penciler (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12980",
                            "name": "Vc Cory Petit",
                            "role": "letterer"
                        }
                    ],
                    "returned": 7
                },
                "characters": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/73995/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011389",
                            "name": "Frog Thor"
                        }
                    ],
                    "returned": 2
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/73995/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/164804",
                            "name": "cover from Asgardians of the Galaxy (2018) #7",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/164805",
                            "name": "story from Asgardians of the Galaxy (2018) #7",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/73995/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 73994,
                "digitalId": 50567,
                "title": "Asgardians of the Galaxy (2018) #6",
                "issueNumber": 6,
                "variantDescription": "",
                "description": null,
                "modified": "2018-12-14T09:03:46-0500",
                "isbn": "",
                "upc": "75960609118800611",
                "diamondCode": "DEC180988",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/73994",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/73994/asgardians_of_the_galaxy_2018_6?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Asgardians-of-the-Galaxy-6/digital-comic/50567?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=50567&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/50567?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/25996",
                    "name": "Asgardians of the Galaxy (2018 - Present)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2019-02-06T00:00:00-0500"
                    },
                    {
                        "type": "focDate",
                        "date": "2019-01-14T00:00:00-0500"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2019-08-12T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2019-02-06T00:00:00-0500"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/5/03/5c523c1673581",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/5/03/5c523c1673581",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/f/20/5bfeceaf46204",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 6,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/73994/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13180",
                            "name": "Federico Blee",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13200",
                            "name": "Sarah Brunstad",
                            "role": "editor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11798",
                            "name": "Matteo Buffagni",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10023",
                            "name": "Cullen Bunn",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12472",
                            "name": "Jamal Campbell",
                            "role": "penciler (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12980",
                            "name": "Vc Cory Petit",
                            "role": "letterer"
                        }
                    ],
                    "returned": 6
                },
                "characters": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/73994/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011389",
                            "name": "Frog Thor"
                        }
                    ],
                    "returned": 2
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/73994/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/164802",
                            "name": "cover from Asgardians of the Galaxy (2018) #6",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/164803",
                            "name": "story from Asgardians of the Galaxy (2018) #6",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/73994/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 71313,
                "digitalId": 50396,
                "title": "Asgardians of the Galaxy (2018) #5",
                "issueNumber": 5,
                "variantDescription": "",
                "description": null,
                "modified": "2018-10-26T09:03:22-0400",
                "isbn": "",
                "upc": "75960609118800511",
                "diamondCode": "NOV180947",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/71313",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/71313/asgardians_of_the_galaxy_2018_5?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Asgardians-of-the-Galaxy-5/digital-comic/50396?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=50396&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/50396?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/25996",
                    "name": "Asgardians of the Galaxy (2018 - Present)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2019-01-16T00:00:00-0500"
                    },
                    {
                        "type": "focDate",
                        "date": "2018-12-17T00:00:00-0500"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2019-07-22T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2019-01-16T00:00:00-0500"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/f/03/5c37950a92459",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/f/03/5c37950a92459",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 9,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71313/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13180",
                            "name": "Federico Blee",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13200",
                            "name": "Sarah Brunstad",
                            "role": "editor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10023",
                            "name": "Cullen Bunn",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10785",
                            "name": "Stephanie Hans",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/9081",
                            "name": "Matteo Lolli",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/426",
                            "name": "Jason Keith",
                            "role": "colorist (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/241",
                            "name": "Dale Keown",
                            "role": "penciler (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13617",
                            "name": "Luca Maresca",
                            "role": "penciler"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12980",
                            "name": "Vc Cory Petit",
                            "role": "letterer"
                        }
                    ],
                    "returned": 9
                },
                "characters": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71313/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011389",
                            "name": "Frog Thor"
                        }
                    ],
                    "returned": 2
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71313/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/158602",
                            "name": "cover from Asgardians of the Galaxy (2018) #5",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/158603",
                            "name": "story from Asgardians of the Galaxy (2018) #5",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71313/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 69930,
                "digitalId": 50093,
                "title": "Thor (2018) #8",
                "issueNumber": 8,
                "variantDescription": "",
                "description": "THE PRISON OF ANGELS! After waging war in Hel, Thor finds himself a prisoner of the fearsome warriors of Heven. Can even the intervention of Valkyrie and Thor’s deadly sister Angela help him escape the unescapable prison of angels?",
                "modified": "2018-12-13T16:58:51-0500",
                "isbn": "",
                "upc": "75960608976500811",
                "diamondCode": "",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "THE PRISON OF ANGELS! After waging war in Hel, Thor finds himself a prisoner of the fearsome warriors of Heven. Can even the intervention of Valkyrie and Thor’s deadly sister Angela help him escape the unescapable prison of angels?"
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/69930",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/69930/thor_2018_8?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Thor-8/digital-comic/50093?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=50093&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/50093?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/24308",
                    "name": "Thor (2018 - 2019)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2018-12-19T00:00:00-0500"
                    },
                    {
                        "type": "focDate",
                        "date": "2018-11-19T00:00:00-0500"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2019-06-24T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2018-12-19T00:00:00-0500"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/6/50/5c12b4e9393c3",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/6/50/5c12b4e9393c3",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/5/90/5bb3d7411d700",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 4,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/69930/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11463",
                            "name": "Jason Aaron",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12376",
                            "name": "Wilson Moss",
                            "role": "editor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11309",
                            "name": "Mike Del Mundo",
                            "role": "penciler (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12974",
                            "name": "Vc Joe Sabino",
                            "role": "letterer"
                        }
                    ],
                    "returned": 4
                },
                "characters": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/69930/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009664",
                            "name": "Thor"
                        }
                    ],
                    "returned": 2
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/69930/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/154813",
                            "name": "cover from Thor (2018) #8",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/154814",
                            "name": "story from Thor (2018) #8",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/69930/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 71312,
                "digitalId": 50029,
                "title": "Asgardians of the Galaxy (2018) #4",
                "issueNumber": 4,
                "variantDescription": "",
                "description": null,
                "modified": "2018-12-20T09:03:57-0500",
                "isbn": "",
                "upc": "75960609118800411",
                "diamondCode": "OCT180955",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/71312",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/71312/asgardians_of_the_galaxy_2018_4?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Asgardians-of-the-Galaxy-4/digital-comic/50029?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=50029&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/50029?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/25996",
                    "name": "Asgardians of the Galaxy (2018 - Present)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2018-12-12T00:00:00-0500"
                    },
                    {
                        "type": "focDate",
                        "date": "2018-11-12T00:00:00-0500"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2019-06-17T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2018-12-12T00:00:00-0500"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/6/50/5c083c9d950b1",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/6/50/5c083c9d950b1",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/e/50/5bb3cbba3803b",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 9,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71312/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13180",
                            "name": "Federico Blee",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13200",
                            "name": "Sarah Brunstad",
                            "role": "editor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10023",
                            "name": "Cullen Bunn",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12765",
                            "name": "Natacha Bustos",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/9081",
                            "name": "Matteo Lolli",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13617",
                            "name": "Luca Maresca",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/426",
                            "name": "Jason Keith",
                            "role": "colorist (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/241",
                            "name": "Dale Keown",
                            "role": "penciler (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12980",
                            "name": "Vc Cory Petit",
                            "role": "letterer"
                        }
                    ],
                    "returned": 9
                },
                "characters": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71312/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011389",
                            "name": "Frog Thor"
                        }
                    ],
                    "returned": 2
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71312/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/158600",
                            "name": "cover from Asgardians of the Galaxy (2018) #4",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/158601",
                            "name": "story from Asgardians of the Galaxy (2018) #4",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71312/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 71311,
                "digitalId": 49716,
                "title": "Asgardians of the Galaxy (2018) #3",
                "issueNumber": 3,
                "variantDescription": "",
                "description": "Nebula unleashes a Thor of nightmares! Hordes of Asgardian dead ravage the Shi’ar Empire! The galaxy is falling to Nebula and her Naglfar Armada — and so far Angela’s ragtag team is powerless to stop her. But there is a debt to be paid and lives to be saved. The Asgardians of the Galaxy grow desperate as Nebula carves a bloody path to her revenge!",
                "modified": "2019-05-15T13:45:47-0400",
                "isbn": "",
                "upc": "75960609118800311",
                "diamondCode": "SEP180950",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "Nebula unleashes a Thor of nightmares! Hordes of Asgardian dead ravage the Shi’ar Empire! The galaxy is falling to Nebula and her Naglfar Armada — and so far Angela’s ragtag team is powerless to stop her. But there is a debt to be paid and lives to be saved. The Asgardians of the Galaxy grow desperate as Nebula carves a bloody path to her revenge!"
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/71311",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/71311/asgardians_of_the_galaxy_2018_3?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Asgardians-of-the-Galaxy-3/digital-comic/49716?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=49716&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/49716?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/25996",
                    "name": "Asgardians of the Galaxy (2018 - Present)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2018-11-07T00:00:00-0500"
                    },
                    {
                        "type": "focDate",
                        "date": "2018-10-15T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2019-05-13T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2018-11-07T00:00:00-0500"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/c/a0/5bdb65bd99a26",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/c/a0/5bdb65bd99a26",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/a/50/5b86f6c187ef5",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 11,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71311/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12297",
                            "name": "Andre Lima Araujo",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/9081",
                            "name": "Matteo Lolli",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13162",
                            "name": "Erick Arciniega",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13180",
                            "name": "Federico Blee",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13200",
                            "name": "Sarah Brunstad",
                            "role": "editor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10023",
                            "name": "Cullen Bunn",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/426",
                            "name": "Jason Keith",
                            "role": "colorist (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/241",
                            "name": "Dale Keown",
                            "role": "penciler (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11309",
                            "name": "Mike Del Mundo",
                            "role": "painter"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/8748",
                            "name": "Jill Thompson",
                            "role": "painter"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12980",
                            "name": "Vc Cory Petit",
                            "role": "letterer"
                        }
                    ],
                    "returned": 11
                },
                "characters": {
                    "available": 3,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71311/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011389",
                            "name": "Frog Thor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010365",
                            "name": "Nebula"
                        }
                    ],
                    "returned": 3
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71311/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/158598",
                            "name": "cover from Asgardians of the Galaxy (2018) #3",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/158599",
                            "name": "story from Asgardians of the Galaxy (2018) #3",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71311/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 71310,
                "digitalId": 49455,
                "title": "Asgardians of the Galaxy (2018) #2",
                "issueNumber": 2,
                "variantDescription": "",
                "description": " ALL DEAD GODS GO TO WAR! Angela’s ragtag team of Asgardians are hot on Nebula’s trail — but she’s left a grisly gift behind. With the power of the Naglfar Armada at her cybernetic fingertips, Nebula is unleashing hordes of undead gods to ravage the galaxy. And its only defenders are a slightly traitorous Executioner, a half-mortal Valkyrie, a lost Asgardian huntress, a hammer-wielding teenager, a suit of ancient armor and a frog. And if the rest of the team finds out who’s behind the Destroyer’s faceplate, things will go from bad to Ragnarok. Guest-starring Gladiator and the Imperial Guard! ",
                "modified": "2021-04-22T13:14:35-0400",
                "isbn": "",
                "upc": "75960609118800211",
                "diamondCode": "AUG181005",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": " ALL DEAD GODS GO TO WAR! Angela’s ragtag team of Asgardians are hot on Nebula’s trail — but she’s left a grisly gift behind. With the power of the Naglfar Armada at her cybernetic fingertips, Nebula is unleashing hordes of undead gods to ravage the galaxy. And its only defenders are a slightly traitorous Executioner, a half-mortal Valkyrie, a lost Asgardian huntress, a hammer-wielding teenager, a suit of ancient armor and a frog. And if the rest of the team finds out who’s behind the Destroyer’s faceplate, things will go from bad to Ragnarok. Guest-starring Gladiator and the Imperial Guard! "
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/71310",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/71310/asgardians_of_the_galaxy_2018_2?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Asgardians-of-the-Galaxy-2/digital-comic/49455?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=49455&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/49455?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/25996",
                    "name": "Asgardians of the Galaxy (2018 - Present)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2018-10-03T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2018-09-10T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2019-04-08T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2018-10-03T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/c/10/5b9bb3ac39e22",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/c/a0/5bdb65bd99a26",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/c/10/5b9bb3ac39e22",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/5/e0/5b62024c1fe63",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 7,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71310/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13180",
                            "name": "Federico Blee",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13200",
                            "name": "Sarah Brunstad",
                            "role": "editor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10023",
                            "name": "Cullen Bunn",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/426",
                            "name": "Jason Keith",
                            "role": "colorist (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/241",
                            "name": "Dale Keown",
                            "role": "penciler (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/9081",
                            "name": "Matteo Lolli",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12980",
                            "name": "Vc Cory Petit",
                            "role": "letterer"
                        }
                    ],
                    "returned": 7
                },
                "characters": {
                    "available": 3,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71310/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011389",
                            "name": "Frog Thor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010365",
                            "name": "Nebula"
                        }
                    ],
                    "returned": 3
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71310/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/158596",
                            "name": "cover from Asgardians of the Galaxy (2018) #2",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/158597",
                            "name": "story from Asgardians of the Galaxy (2018) #2",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71310/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 71308,
                "digitalId": 49104,
                "title": "Asgardians of the Galaxy (2018) #1",
                "issueNumber": 1,
                "variantDescription": "",
                "description": "Spinning out of the events of INFINITY WARS comes an epic space opera from DEADPOOL veterans Cullen Bunn and Matteo Lolli! Angela, the not-so-beloved half-sister of Thor. The hotheaded Valkyrie – and the human who shares her form, Annabelle Riggs. Skurge the Executioner, freshly returned from Hel. Throg, the mightiest frog of thunder. Kevin Masterson, the boy who took his father’s mace to become the hero Thunderstrike. And the Destroyer, the Asgardian armor built to take down Celestials – its wielder unknown. The events of INFINITY WARS set NEBULA off on a quest to rule the galaxy – wielding an Asgardian weapon even Thor would fear – and it’s up to this team of gods, assassins, frogs and heroes to stop her.",
                "modified": "2018-08-30T14:30:14-0400",
                "isbn": "",
                "upc": "75960609118800111",
                "diamondCode": "JUL180980",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "Spinning out of the events of INFINITY WARS comes an epic space opera from DEADPOOL veterans Cullen Bunn and Matteo Lolli! Angela, the not-so-beloved half-sister of Thor. The hotheaded Valkyrie – and the human who shares her form, Annabelle Riggs. Skurge the Executioner, freshly returned from Hel. Throg, the mightiest frog of thunder. Kevin Masterson, the boy who took his father’s mace to become the hero Thunderstrike. And the Destroyer, the Asgardian armor built to take down Celestials – its wielder unknown. The events of INFINITY WARS set NEBULA off on a quest to rule the galaxy – wielding an Asgardian weapon even Thor would fear – and it’s up to this team of gods, assassins, frogs and heroes to stop her."
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/71308",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/71308/asgardians_of_the_galaxy_2018_1?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Asgardians-of-the-Galaxy-1/digital-comic/49104?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=49104&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/49104?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/25996",
                    "name": "Asgardians of the Galaxy (2018 - Present)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2018-09-05T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2018-08-13T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2019-03-11T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2018-09-05T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/f/80/5b882a7cc8afa",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/f/80/5b882a7cc8afa",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/3/a0/5b33da8509674",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 7,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71308/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13180",
                            "name": "Federico Blee",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13200",
                            "name": "Sarah Brunstad",
                            "role": "editor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10023",
                            "name": "Cullen Bunn",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/426",
                            "name": "Jason Keith",
                            "role": "colorist (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/241",
                            "name": "Dale Keown",
                            "role": "penciler (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/9081",
                            "name": "Matteo Lolli",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12980",
                            "name": "Vc Cory Petit",
                            "role": "letterer"
                        }
                    ],
                    "returned": 7
                },
                "characters": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71308/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011389",
                            "name": "Frog Thor"
                        }
                    ],
                    "returned": 2
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71308/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/158592",
                            "name": "cover from Asgardians of the Galaxy (2018) #1",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/158593",
                            "name": "story from Asgardians of the Galaxy (2018) #1",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/71308/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 60172,
                "digitalId": 0,
                "title": "Mighty Thor Vol. 3: The Asgard/Shi'ar War (Trade Paperback)",
                "issueNumber": 0,
                "variantDescription": "",
                "description": "Two of the Marvel Universe’s mightiest races are on a collision course — but first Thor must deal with the escalating War of the Realms! To face Malekith, Loki and an all-new Kurse, she’ll need a team of her own. Prepare for the triumphant return of the League of Realms! Far across the galaxy, though, another conflict is brewing as the most powerful super-army in the cosmos prepares a surprise attack on the city of the gods! The Shi’ar Empire will lay siege to Asgardia — and its target is the Goddess of Thunder! But why? And what does the fate of Midgard have to do with it? And where the Shi’ar go, the Phoenix Force tends to follow — which is bad news for Thor! Maybe the returning Odinson could lend a hand — or perhaps, Quentin Quire?! Collecting MIGHTY THOR (2015) #13-19.",
                "modified": "2018-03-23T17:39:48-0400",
                "isbn": "978-1-302-90309-1",
                "upc": "",
                "diamondCode": "JAN181043",
                "ean": "9781302 903091 51999",
                "issn": "",
                "format": "Trade Paperback",
                "pageCount": 160,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "Two of the Marvel Universe’s mightiest races are on a collision course — but first Thor must deal with the escalating War of the Realms! To face Malekith, Loki and an all-new Kurse, she’ll need a team of her own. Prepare for the triumphant return of the League of Realms! Far across the galaxy, though, another conflict is brewing as the most powerful super-army in the cosmos prepares a surprise attack on the city of the gods! The Shi’ar Empire will lay siege to Asgardia — and its target is the Goddess of Thunder! But why? And what does the fate of Midgard have to do with it? And where the Shi’ar go, the Phoenix Force tends to follow — which is bad news for Thor! Maybe the returning Odinson could lend a hand — or perhaps, Quentin Quire?! Collecting MIGHTY THOR (2015) #13-19."
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/60172",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/collection/60172/mighty_thor_vol_3_the_asgardshiar_war_trade_paperback?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/22121",
                    "name": "Mighty Thor Vol. 3: The Asgard/Shi'ar War (2018)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2018-03-28T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2018-02-05T00:00:00-0500"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 19.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/7/00/5ab57f7697b51",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/7/00/5ab57f7697b51",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 4,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60172/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11463",
                            "name": "Jason Aaron",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12449",
                            "name": "Russell Dauterman",
                            "role": "penciller (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/374",
                            "name": "Steve Epting",
                            "role": "artist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/4430",
                            "name": "Jeff Youngquist",
                            "role": "editor"
                        }
                    ],
                    "returned": 4
                },
                "characters": {
                    "available": 5,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60172/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1013479",
                            "name": "Malekith"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009588",
                            "name": "Sif"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009664",
                            "name": "Thor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017576",
                            "name": "Thor (Goddess of Thunder)"
                        }
                    ],
                    "returned": 5
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60172/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/130841",
                            "name": "cover from Mighty Thor (2017)",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/130842",
                            "name": "story from Mighty Thor (2017)",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60172/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 60676,
                "digitalId": 0,
                "title": "GUARDIANS OF THE GALAXY VOL. 4 HC (Hardcover)",
                "issueNumber": 4,
                "variantDescription": "",
                "description": "When Peter Quill abandons the Guardians to become Emperor of Spartax, Rocket grabs the reins as team leader - backed up by Drax, Venom, Groot, Kitty Pryde and brand-new Guardian Ben Grimm, the Ever-Lovin' Blue-Eyed Thing! But what could put the team in Emperor Quill's crosshairs? Meanwhile, Gamora makes her return - but will it be a welcome one after eight months away? Plus: Yotat the Destroyer is here - and he will have blood. Venom and Groot face Skrulls! Drax and Gamora take the fight to the Badoon! Angela makes her deadly return! And are you ready for Ben Grimm: Space Barbarian? But with Kitty taking on a certain \"legendary\" mantle, is the galaxy big enough for two Star-Lords? They're the galaxy's most wanted, but they'll still guard it all the same! Collecting GUARDIANS OF THE GALAXY (2015) #1-10.",
                "modified": "2019-06-19T09:23:09-0400",
                "isbn": "978-1-302-90437-1",
                "upc": "",
                "diamondCode": "JUN171049",
                "ean": "9781302 904371 53499",
                "issn": "2330-6777",
                "format": "Hardcover",
                "pageCount": 264,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "When Peter Quill abandons the Guardians to become Emperor of Spartax, Rocket grabs the reins as team leader - backed up by Drax, Venom, Groot, Kitty Pryde and brand-new Guardian Ben Grimm, the Ever-Lovin' Blue-Eyed Thing! But what could put the team in Emperor Quill's crosshairs? Meanwhile, Gamora makes her return - but will it be a welcome one after eight months away? Plus: Yotat the Destroyer is here - and he will have blood. Venom and Groot face Skrulls! Drax and Gamora take the fight to the Badoon! Angela makes her deadly return! And are you ready for Ben Grimm: Space Barbarian? But with Kitty taking on a certain \"legendary\" mantle, is the galaxy big enough for two Star-Lords? They're the galaxy's most wanted, but they'll still guard it all the same! Collecting GUARDIANS OF THE GALAXY (2015) #1-10."
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/60676",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/collection/60676/guardians_of_the_galaxy_vol_4_hc_hardcover?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/22420",
                    "name": "GUARDIANS OF THE GALAXY VOL. 4 HC (2017)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2017-12-13T00:00:00-0500"
                    },
                    {
                        "type": "focDate",
                        "date": "2017-08-14T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 34.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/9/00/5a287ea20d7b3",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/9/00/5a287ea20d7b3",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 5,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60676/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/24",
                            "name": "Brian Michael Bendis",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13055",
                            "name": "Richard Isanove",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12980",
                            "name": "Vc Cory Petit",
                            "role": "letterer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11912",
                            "name": "Valerio Schiti",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/4430",
                            "name": "Jeff Youngquist",
                            "role": "editor"
                        }
                    ],
                    "returned": 5
                },
                "characters": {
                    "available": 5,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60676/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011299",
                            "name": "Guardians of the Galaxy"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009508",
                            "name": "Kitty Pryde"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009662",
                            "name": "Thing"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009663",
                            "name": "Venom (Flash Thompson)"
                        }
                    ],
                    "returned": 5
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60676/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/131821",
                            "name": "cover from Guardians of the Galaxy: New Guard (2017)",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/131822",
                            "name": "story from Guardians of the Galaxy: New Guard (2017)",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60676/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 60169,
                "digitalId": 0,
                "title": "Guardians of the Galaxy: New Guard Vol. 3 - Civil War II (Trade Paperback)",
                "issueNumber": 0,
                "variantDescription": "",
                "description": "Think the events of Civil War II only affect Marvel's Earth-bound heroes? Guess again! Because when things get rough for Captain Marvel, she calls in a little help from some friends from out of town - way out of town! The Guardians' other former pal, Iron Man, doesn't stand a chance! Collects Guardians of the Galaxy #11-14, material from Free Comic Book Day 2016 (Civil War II) #1.",
                "modified": "2017-09-06T18:18:40-0400",
                "isbn": "978-1-302-90302-2",
                "upc": "",
                "diamondCode": "JUN171054",
                "ean": "9781302 903022 51999",
                "issn": "",
                "format": "Trade Paperback",
                "pageCount": 136,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "Think the events of Civil War II only affect Marvel's Earth-bound heroes? Guess again! Because when things get rough for Captain Marvel, she calls in a little help from some friends from out of town - way out of town! The Guardians' other former pal, Iron Man, doesn't stand a chance! Collects Guardians of the Galaxy #11-14, material from Free Comic Book Day 2016 (Civil War II) #1."
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/60169",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/collection/60169/guardians_of_the_galaxy_new_guard_vol_3_-_civil_war_ii_trade_paperback?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/22118",
                    "name": "Guardians of the Galaxy: New Guard Vol. 3 - Civil War II (2017)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2017-09-13T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2017-07-24T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 19.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/a/20/59b07ad5d89b9",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/a/20/59b07ad5d89b9",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 4,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60169/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12208",
                            "name": "Arthur Adams",
                            "role": "penciller (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/24",
                            "name": "Brian Michael Bendis",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11912",
                            "name": "Valerio Schiti",
                            "role": "penciller"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/4430",
                            "name": "Jeff Youngquist",
                            "role": "editor"
                        }
                    ],
                    "returned": 4
                },
                "characters": {
                    "available": 5,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60169/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010338",
                            "name": "Captain Marvel (Carol Danvers)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011299",
                            "name": "Guardians of the Galaxy"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009368",
                            "name": "Iron Man"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009662",
                            "name": "Thing"
                        }
                    ],
                    "returned": 5
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60169/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/130835",
                            "name": "cover from Guardians of the Galaxy: New Guard (2017)",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/130836",
                            "name": "story from Guardians of the Galaxy: New Guard (2017)",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60169/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 60171,
                "digitalId": 0,
                "title": "Mighty Thor Vol. 3: The Asgard/Shi'ar War (Hardcover)",
                "issueNumber": 0,
                "variantDescription": "",
                "description": "As the War of the Realms rages on, the only way to defeat Malekith is with a united front - and it's up to Thor to bring the many races together! Now heroes from across the ten worlds - including Lady Sif and Angela - unite under Thor's command to form a new League of Realms, with the sole mission of bringing this conflict to an end! And their first mission is to infiltrate Dark- Elf-occupied territory! But when the war spreads to every branch of the World Tree, the League's road to peace is fraught with challenges they hadn't anticipated. To stand against the heroic allies, Malekith forms a wicked union of his own, calling on Loki and the all-new Kurse to take down Thor and her band of heroes! Collects Mighty Thor #13-19.",
                "modified": "2017-07-14T14:43:43-0400",
                "isbn": "978-1-302-90308-4",
                "upc": "",
                "diamondCode": "APR171141",
                "ean": "9781302 903084 52499",
                "issn": "",
                "format": "Hardcover",
                "pageCount": 160,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "As the War of the Realms rages on, the only way to defeat Malekith is with a united front - and it's up to Thor to bring the many races together! Now heroes from across the ten worlds - including Lady Sif and Angela - unite under Thor's command to form a new League of Realms, with the sole mission of bringing this conflict to an end! And their first mission is to infiltrate Dark- Elf-occupied territory! But when the war spreads to every branch of the World Tree, the League's road to peace is fraught with challenges they hadn't anticipated. To stand against the heroic allies, Malekith forms a wicked union of his own, calling on Loki and the all-new Kurse to take down Thor and her band of heroes! Collects Mighty Thor #13-19."
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/60171",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/collection/60171/mighty_thor_vol_3_the_asgardshiar_war_hardcover?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/22120",
                    "name": "Mighty Thor Vol. 3: The Asgard/Shi'ar War (2017)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2017-07-19T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2017-05-29T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 24.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/7/a0/5969183f8d3fe",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/7/a0/5969183f8d3fe",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 4,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60171/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11463",
                            "name": "Jason Aaron",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12449",
                            "name": "Russell Dauterman",
                            "role": "penciller (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/374",
                            "name": "Steve Epting",
                            "role": "penciller"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/4430",
                            "name": "Jeff Youngquist",
                            "role": "editor"
                        }
                    ],
                    "returned": 4
                },
                "characters": {
                    "available": 6,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60171/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010329",
                            "name": "Jane Foster"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009407",
                            "name": "Loki"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1013479",
                            "name": "Malekith"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009588",
                            "name": "Sif"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009664",
                            "name": "Thor"
                        }
                    ],
                    "returned": 6
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60171/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/130839",
                            "name": "cover from Mighty Thor (2017)",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/130840",
                            "name": "story from Mighty Thor (2017)",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60171/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 60980,
                "digitalId": 44286,
                "title": "Guardians of the Galaxy (2015) #18",
                "issueNumber": 18,
                "variantDescription": "",
                "description": "Gamora is said to be the most dangerous woman in the galaxy...which makes her the most dangerous target S.H.I.E.L.D.'s ever gone after! But she won't be stopped until she gets to Thanos!",
                "modified": "2017-03-10T14:05:05-0500",
                "isbn": "",
                "upc": "75960608303901811",
                "diamondCode": "JAN171047",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "Gamora is said to be the most dangerous woman in the galaxy...which makes her the most dangerous target S.H.I.E.L.D.'s ever gone after! But she won't be stopped until she gets to Thanos!"
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/60980",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/60980/guardians_of_the_galaxy_2015_18?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Guardians-of-the-Galaxy-18/digital-comic/44286?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=44286&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/44286?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/20465",
                    "name": "Guardians of the Galaxy (2015 - 2017)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2017-03-15T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2017-02-20T00:00:00-0500"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2017-09-18T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2017-03-15T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/c/70/58b71cad923cf",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/c/70/58b71cad923cf",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 7,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60980/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12208",
                            "name": "Arthur Adams",
                            "role": "inker (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/24",
                            "name": "Brian Michael Bendis",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/13055",
                            "name": "Richard Isanove",
                            "role": "colorist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/426",
                            "name": "Jason Keith",
                            "role": "colorist (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12980",
                            "name": "Vc Cory Petit",
                            "role": "letterer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11912",
                            "name": "Valerio Schiti",
                            "role": "inker"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/8822",
                            "name": "Jordan D. White",
                            "role": "editor"
                        }
                    ],
                    "returned": 7
                },
                "characters": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60980/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011299",
                            "name": "Guardians of the Galaxy"
                        }
                    ],
                    "returned": 2
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60980/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/132413",
                            "name": "cover from Guardians of the Galaxy (2015) #18",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/132414",
                            "name": "story from Guardians of the Galaxy (2015) #18",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60980/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 60168,
                "digitalId": 0,
                "title": "Guardians of The Galaxy: New Guard Vol. 3 - Civil War II (Hardcover)",
                "issueNumber": 0,
                "variantDescription": "",
                "description": "Think the events of Civil War II only affect Marvel's Earth-bound heroes? Guess again! Because when things get rough for Captain Marvel, she calls in a little help from some friends from out of town - way out of town! The Guardians' other former pal, Iron Man, doesn't stand a chance! Collects Guardians of the Galaxy #11-14, material from Free Comic Book Day 2016 (Civil War II) #1.",
                "modified": "2017-02-23T12:12:15-0500",
                "isbn": "978-1-302-90301-5",
                "upc": "",
                "diamondCode": "",
                "ean": "9781302 903015 52499",
                "issn": "",
                "format": "Hardcover",
                "pageCount": 112,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "Think the events of Civil War II only affect Marvel's Earth-bound heroes? Guess again! Because when things get rough for Captain Marvel, she calls in a little help from some friends from out of town - way out of town! The Guardians' other former pal, Iron Man, doesn't stand a chance! Collects Guardians of the Galaxy #11-14, material from Free Comic Book Day 2016 (Civil War II) #1."
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/60168",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/collection/60168/guardians_of_the_galaxy_new_guard_vol_3_-_civil_war_ii_hardcover?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Guardians-of-the-Galaxy-New-Guard-0/digital-comic/44104?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/22117",
                    "name": "Guardians of The Galaxy: New Guard Vol. 3 - Civil War II (2017)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2017-02-15T00:00:00-0500"
                    },
                    {
                        "type": "focDate",
                        "date": "2017-01-24T00:00:00-0500"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 24.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/7/40/589e1c5ce3758",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/7/40/589e1c5ce3758",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 4,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60168/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12208",
                            "name": "Arthur Adams",
                            "role": "penciller (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/24",
                            "name": "Brian Michael Bendis",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11912",
                            "name": "Valerio Schiti",
                            "role": "penciller"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/4430",
                            "name": "Jeff Youngquist",
                            "role": "editor"
                        }
                    ],
                    "returned": 4
                },
                "characters": {
                    "available": 5,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60168/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010338",
                            "name": "Captain Marvel (Carol Danvers)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011299",
                            "name": "Guardians of the Galaxy"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009368",
                            "name": "Iron Man"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009508",
                            "name": "Kitty Pryde"
                        }
                    ],
                    "returned": 5
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60168/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/130833",
                            "name": "cover from Guardians of the Galaxy: New Guard (2017)",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/130834",
                            "name": "story from Guardians of the Galaxy: New Guard (2017)",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/60168/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 56505,
                "digitalId": 41215,
                "title": "Angela: Queen of Hel (2015) #5",
                "issueNumber": 5,
                "variantDescription": "",
                "description": "",
                "modified": "2016-01-21T09:03:32-0500",
                "isbn": "",
                "upc": "75960608404300511",
                "diamondCode": "DEC150843",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "The ferocious finale of the conquest of Hel as Angela and Sera clash at last with the tyrannical Queen Hela in all her glory! Holy crow, are we glad comics don’t have special effects budgets. (Marguerite owes Kim, Stephanie and Israel so many drinks.) And the splash page you’ve all been waiting for..."
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/56505",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/56505/angela_queen_of_hel_2015_5?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Angela-Queen-of-Hel-5/digital-comic/41215?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=41215&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/20696",
                    "name": "Angela: Queen of Hel (2015 - 2016)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2016-02-24T00:00:00-0500"
                    },
                    {
                        "type": "focDate",
                        "date": "2016-02-09T00:00:00-0500"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2016-08-29T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2016-02-16T11:27:00-0500"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/3/80/56c748324c3c4",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/3/80/56c748324c3c4",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/9/00/56900cfada534",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 5,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/56505/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12441",
                            "name": "Marguerite Bennett",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10172",
                            "name": "Vc Clayton Cowles",
                            "role": "letterer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10785",
                            "name": "Stephanie Hans",
                            "role": "penciller"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12319",
                            "name": "Aaron Kim Jacinto",
                            "role": "penciller"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12376",
                            "name": "Wilson Moss",
                            "role": "editor"
                        }
                    ],
                    "returned": 5
                },
                "characters": {
                    "available": 1,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/56505/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        }
                    ],
                    "returned": 1
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/56505/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/123865",
                            "name": "cover from Angela: Queen of Hel (2015) #5",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/123866",
                            "name": "story from Angela: Queen of Hel (2015) #5",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/56505/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 51201,
                "digitalId": 40141,
                "title": "1602 Witch Hunter Angela (2015) #4",
                "issueNumber": 4,
                "variantDescription": "",
                "description": "• Spurred by revenge, Angela races to meet Enchantress's endgame as the gates of Faerie are wrenched open!\n• The dead walk and speak (and tell terrible jokes), and Kieron and Kody Chamberlain lead the revels, as Angela embarks on the Wild Hunt for Serah's soul!",
                "modified": "2015-09-21T13:40:27-0400",
                "isbn": "",
                "upc": "75960608200100411",
                "diamondCode": "AUG150681",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "• Spurred by revenge, Angela races to meet Enchantress's endgame as the gates of Faerie are wrenched open!\n• The dead walk and speak (and tell terrible jokes), and Kieron and Kody Chamberlain lead the revels, as Angela embarks on the Wild Hunt for Serah's soul!"
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/51201",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/51201/1602_witch_hunter_angela_2015_4?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/1602-Witch-Hunter-Angela-4/digital-comic/40141?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=40141&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/40141?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/19244",
                    "name": "1602 Witch Hunter Angela (2015)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2015-10-07T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2015-09-23T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2016-04-04T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2015-10-07T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/3/03/5601855c253f1",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/3/03/5601855c253f1",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 3,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/51201/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12441",
                            "name": "Marguerite Bennett",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/8901",
                            "name": "Kieron Gillen",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10785",
                            "name": "Stephanie Hans",
                            "role": "penciller (cover)"
                        }
                    ],
                    "returned": 3
                },
                "characters": {
                    "available": 1,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/51201/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        }
                    ],
                    "returned": 1
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/51201/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/113979",
                            "name": "cover from 1602 Witch Hunter Angela (2015) #4",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/113980",
                            "name": "story from 1602 Witch Hunter Angela (2015) #4",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/51201/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 50928,
                "digitalId": 34655,
                "title": "Original Sin (2014) #5.5",
                "issueNumber": 5.5,
                "variantDescription": "",
                "description": "THOR: THE TENTH REALM\n- Thanks to the events of ORIGINAL SIN, the deepest secret of the Nine Realms is revealed... a Tenth Realm!\n- Thor and Loki embark on a quest to discover this strange new world -- and the sister Thor never knew he had... Angela!\n- But can Loki be trusted? And will brother and sister murder each other before the truth comes out?",
                "modified": "2014-09-11T16:06:05-0400",
                "isbn": "",
                "upc": "75960608034200311",
                "diamondCode": "",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "THOR: THE TENTH REALM\n- Thanks to the events of ORIGINAL SIN, the deepest secret of the Nine Realms is revealed... a Tenth Realm!\n- Thor and Loki embark on a quest to discover this strange new world -- and the sister Thor never knew he had... Angela!\n- But can Loki be trusted? And will brother and sister murder each other before the truth comes out?"
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/50928",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/50928/original_sin_2014_5.5?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Original-Sin-5-5/digital-comic/34655?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=34655&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/34655?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/18681",
                    "name": "Original Sin (2014)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2014-09-17T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2014-08-25T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2015-03-23T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2014-09-17T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/8/70/5411fe3a07b1b",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/8/70/5411fe3a07b1b",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 4,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50928/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11463",
                            "name": "Jason Aaron",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12174",
                            "name": "Al Ewing",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/648",
                            "name": "Simone Bianchi",
                            "role": "penciller (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/8933",
                            "name": "Lee Garbett",
                            "role": "artist"
                        }
                    ],
                    "returned": 4
                },
                "characters": {
                    "available": 4,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50928/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009407",
                            "name": "Loki"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009480",
                            "name": "Odin"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009664",
                            "name": "Thor"
                        }
                    ],
                    "returned": 4
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50928/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/113810",
                            "name": "ORIGINAL SIN 5.5 (SIN, WITH DIGITAL CODE)",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/113811",
                            "name": "ORIGINAL SIN 5.5 (SIN, WITH DIGITAL CODE)",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 1,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50928/events",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/events/319",
                            "name": "Original Sin"
                        }
                    ],
                    "returned": 1
                }
            },
            {
                "id": 49530,
                "digitalId": 34719,
                "title": "Original Sin (2014) #8",
                "issueNumber": 8,
                "variantDescription": "",
                "description": null,
                "modified": "2017-08-16T15:40:32-0400",
                "isbn": "",
                "upc": "75960608034200811",
                "diamondCode": "",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 40,
                "textObjects": [],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/49530",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/49530/original_sin_2014_8?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Original-Sin-8/digital-comic/34719?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=34719&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/34719?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/18681",
                    "name": "Original Sin (2014)"
                },
                "variants": [
                    {
                        "resourceURI": "http://gateway.marvel.com/v1/public/comics/50771",
                        "name": "Original Sin (2014) #8 (Dell'otto Variant)"
                    }
                ],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2014-09-03T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2014-08-06T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2015-03-02T00:00:00-0500"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2014-09-03T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 4.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/6/90/55142ce66d72f",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/6/90/55142ce66d72f",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/c/80/54f8b05e8e0cd",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/49530/creators",
                    "items": [],
                    "returned": 0
                },
                "characters": {
                    "available": 19,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/49530/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009165",
                            "name": "Avengers"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009189",
                            "name": "Black Widow"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009220",
                            "name": "Captain America"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009282",
                            "name": "Doctor Strange"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010763",
                            "name": "Gamora"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009351",
                            "name": "Hulk"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009368",
                            "name": "Iron Man"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009407",
                            "name": "Loki"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009471",
                            "name": "Nick Fury"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009480",
                            "name": "Odin"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009535",
                            "name": "Red Skull"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009379",
                            "name": "Rick Jones"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009610",
                            "name": "Spider-Man (Peter Parker)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009661",
                            "name": "The Watchers"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009664",
                            "name": "Thor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009683",
                            "name": "Uatu The Watcher"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010740",
                            "name": "Winter Soldier"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009718",
                            "name": "Wolverine"
                        }
                    ],
                    "returned": 19
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/49530/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/111139",
                            "name": "story from new series (2015) #8",
                            "type": "interiorStory"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/121290",
                            "name": "Original Sin (2014) #8 Cover",
                            "type": "cover"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 1,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/49530/events",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/events/319",
                            "name": "Original Sin"
                        }
                    ],
                    "returned": 1
                }
            },
            {
                "id": 50927,
                "digitalId": 34653,
                "title": "Original Sin (2014) #5.4",
                "issueNumber": 5.4,
                "variantDescription": "",
                "description": "THOR: THE TENTH REALM\n- Thanks to the events of ORIGINAL SIN, the deepest secret of the Nine Realms is revealed... a Tenth Realm!\n- Thor and Loki embark on a quest to discover this strange new world -- and the sister Thor never knew he had... Angela!\n- But can Loki be trusted? And will brother and sister murder each other before the truth comes out?",
                "modified": "2014-08-22T16:58:30-0400",
                "isbn": "",
                "upc": "75960608034200311",
                "diamondCode": "",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "THOR: THE TENTH REALM\n- Thanks to the events of ORIGINAL SIN, the deepest secret of the Nine Realms is revealed... a Tenth Realm!\n- Thor and Loki embark on a quest to discover this strange new world -- and the sister Thor never knew he had... Angela!\n- But can Loki be trusted? And will brother and sister murder each other before the truth comes out?"
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/50927",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/50927/original_sin_2014_5.4?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Original-Sin-5-4/digital-comic/34653?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=34653&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/34653?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/18681",
                    "name": "Original Sin (2014)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2014-08-27T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2014-08-04T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2015-02-23T00:00:00-0500"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2014-08-27T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/f/e0/53f7acaf77dd7",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/f/e0/53f7acaf77dd7",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 4,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50927/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11463",
                            "name": "Jason Aaron",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12174",
                            "name": "Al Ewing",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/648",
                            "name": "Simone Bianchi",
                            "role": "penciller (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/8933",
                            "name": "Lee Garbett",
                            "role": "artist"
                        }
                    ],
                    "returned": 4
                },
                "characters": {
                    "available": 4,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50927/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009407",
                            "name": "Loki"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009480",
                            "name": "Odin"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009664",
                            "name": "Thor"
                        }
                    ],
                    "returned": 4
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50927/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/113773",
                            "name": "ORIGINAL SIN 5.4 (SIN, WITH DIGITAL CODE)",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/113774",
                            "name": "ORIGINAL SIN 5.4 (SIN, WITH DIGITAL CODE)",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 1,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50927/events",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/events/319",
                            "name": "Original Sin"
                        }
                    ],
                    "returned": 1
                }
            },
            {
                "id": 50926,
                "digitalId": 34652,
                "title": "Original Sin (2014) #5.3",
                "issueNumber": 5.3,
                "variantDescription": "",
                "description": "THOR: THE TENTH REALM\n- Thanks to the events of ORIGINAL SIN, the deepest secret of the Nine Realms is revealed... a Tenth Realm!\n- Thor and Loki embark on a quest to discover this strange new world -- and the sister Thor never knew he had... Angela!\n- But can Loki be trusted? And will brother and sister murder each other before the truth comes out?",
                "modified": "2017-08-16T15:40:33-0400",
                "isbn": "",
                "upc": "75960608034200311",
                "diamondCode": "",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "THOR: THE TENTH REALM\n- Thanks to the events of ORIGINAL SIN, the deepest secret of the Nine Realms is revealed... a Tenth Realm!\n- Thor and Loki embark on a quest to discover this strange new world -- and the sister Thor never knew he had... Angela!\n- But can Loki be trusted? And will brother and sister murder each other before the truth comes out?"
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/50926",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/50926/original_sin_2014_5.3?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Original-Sin-5-3/digital-comic/34652?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=34652&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/34652?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/18681",
                    "name": "Original Sin (2014)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2014-08-06T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2014-07-14T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2015-02-02T00:00:00-0500"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2014-08-06T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/6/70/53d7ed270a097",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/6/70/53d7ed270a097",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 4,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50926/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11463",
                            "name": "Jason Aaron",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12174",
                            "name": "Al Ewing",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/648",
                            "name": "Simone Bianchi",
                            "role": "penciller (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/8933",
                            "name": "Lee Garbett",
                            "role": "artist"
                        }
                    ],
                    "returned": 4
                },
                "characters": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50926/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009664",
                            "name": "Thor"
                        }
                    ],
                    "returned": 2
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50926/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/113729",
                            "name": "ORIGINAL SIN 5.3 (SIN, WITH DIGITAL CODE)",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/113730",
                            "name": "ORIGINAL SIN 5.3 (SIN, WITH DIGITAL CODE)",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 1,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50926/events",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/events/319",
                            "name": "Original Sin"
                        }
                    ],
                    "returned": 1
                }
            },
            {
                "id": 50892,
                "digitalId": 34271,
                "title": "Original Sin (2014) #5.2",
                "issueNumber": 5.2,
                "variantDescription": "",
                "description": "THOR: THE TENTH REALM\n- Thanks to the events of ORIGINAL SIN, the deepest secret of the Nine Realms is revealed... a Tenth Realm!\n- Thor and Loki embark on a quest to discover this strange new world -- and the sister Thor never knew he had... Angela!\n- But can Loki be trusted? And will brother and sister murder each other before the truth comes out?",
                "modified": "2014-07-14T16:16:09-0400",
                "isbn": "",
                "upc": "75960608034200311",
                "diamondCode": "",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "THOR: THE TENTH REALM\n- Thanks to the events of ORIGINAL SIN, the deepest secret of the Nine Realms is revealed... a Tenth Realm!\n- Thor and Loki embark on a quest to discover this strange new world -- and the sister Thor never knew he had... Angela!\n- But can Loki be trusted? And will brother and sister murder each other before the truth comes out?"
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/50892",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/50892/original_sin_2014_5.2?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Original-Sin-5-2/digital-comic/34271?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=34271&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/34271?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/18681",
                    "name": "Original Sin (2014)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2014-07-23T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2014-06-30T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2015-01-26T00:00:00-0500"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2014-07-23T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/5/f0/53c433b501e9c",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/5/f0/53c433b501e9c",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 5,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50892/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11463",
                            "name": "Jason Aaron",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12174",
                            "name": "Al Ewing",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/648",
                            "name": "Simone Bianchi",
                            "role": "artist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/8933",
                            "name": "Lee Garbett",
                            "role": "artist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/241",
                            "name": "Dale Keown",
                            "role": "penciller (cover)"
                        }
                    ],
                    "returned": 5
                },
                "characters": {
                    "available": 4,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50892/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009407",
                            "name": "Loki"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009480",
                            "name": "Odin"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009664",
                            "name": "Thor"
                        }
                    ],
                    "returned": 4
                },
                "stories": {
                    "available": 3,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50892/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/113708",
                            "name": "ORIGINAL SIN 5.2 (SIN, WITH DIGITAL CODE)",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/113709",
                            "name": "ORIGINAL SIN 5.2 (SIN, WITH DIGITAL CODE)",
                            "type": "interiorStory"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/113710",
                            "name": "ORIGINAL SIN 5.2 (SIN, WITH DIGITAL CODE)",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 3
                },
                "events": {
                    "available": 1,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50892/events",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/events/319",
                            "name": "Original Sin"
                        }
                    ],
                    "returned": 1
                }
            },
            {
                "id": 49522,
                "digitalId": 34265,
                "title": "Original Sin (2014) #6",
                "issueNumber": 6,
                "variantDescription": "",
                "description": "EVERYBODY HAS ONE...",
                "modified": "2019-09-24T18:32:07-0400",
                "isbn": "",
                "upc": "75960608034200611",
                "diamondCode": "",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "EVERYBODY HAS ONE..."
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/49522",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/49522/original_sin_2014_6?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Original-Sin-6/digital-comic/34265?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=34265&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/34265?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/18681",
                    "name": "Original Sin (2014)"
                },
                "variants": [
                    {
                        "resourceURI": "http://gateway.marvel.com/v1/public/comics/50769",
                        "name": "Original Sin (2014) #6 (Dell'otto Variant)"
                    }
                ],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2014-07-16T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2014-07-02T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2015-01-19T00:00:00-0500"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2014-07-16T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/e/70/53bc0f07d3bba",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/e/70/53bc0f07d3bba",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 3,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/49522/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11463",
                            "name": "Jason Aaron",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/312",
                            "name": "Mike Deodato",
                            "role": "artist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11488",
                            "name": "Julian Totino Tedesco",
                            "role": "penciller (cover)"
                        }
                    ],
                    "returned": 3
                },
                "characters": {
                    "available": 7,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/49522/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009189",
                            "name": "Black Widow"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009220",
                            "name": "Captain America"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009282",
                            "name": "Doctor Strange"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009351",
                            "name": "Hulk"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009368",
                            "name": "Iron Man"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009471",
                            "name": "Nick Fury"
                        }
                    ],
                    "returned": 7
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/49522/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/111122",
                            "name": "cover from new series (2015) #6",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/111123",
                            "name": "story from new series (2015) #6",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 1,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/49522/events",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/events/319",
                            "name": "Original Sin"
                        }
                    ],
                    "returned": 1
                }
            },
            {
                "id": 50888,
                "digitalId": 34259,
                "title": "Original Sin (2014) #5.1",
                "issueNumber": 5.1,
                "variantDescription": "",
                "description": "THOR: THE TENTH REALM\n- Thanks to the events of ORIGINAL SIN, the deepest secret of the Nine Realms is revealed... a Tenth Realm!\n- Thor and Loki embark on a quest to discover this strange new world -- and the sister Thor never knew he had... Angela!\n- But can Loki be trusted? And will brother and sister murder each other before the truth comes out?",
                "modified": "2019-04-03T10:46:34-0400",
                "isbn": "",
                "upc": "75960608034200311",
                "diamondCode": "",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "THOR: THE TENTH REALM\n- Thanks to the events of ORIGINAL SIN, the deepest secret of the Nine Realms is revealed... a Tenth Realm!\n- Thor and Loki embark on a quest to discover this strange new world -- and the sister Thor never knew he had... Angela!\n- But can Loki be trusted? And will brother and sister murder each other before the truth comes out?"
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/50888",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/50888/original_sin_2014_5.1?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Original-Sin-5-1/digital-comic/34259?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=34259&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/34259?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/18681",
                    "name": "Original Sin (2014)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2014-07-09T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2014-06-16T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2015-01-12T00:00:00-0500"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2014-07-09T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/8/b0/53b2dcc52316c",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/8/b0/53b2dcc52316c",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 5,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50888/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/11463",
                            "name": "Jason Aaron",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/12174",
                            "name": "Al Ewing",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/648",
                            "name": "Simone Bianchi",
                            "role": "artist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/8933",
                            "name": "Lee Garbett",
                            "role": "artist"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/241",
                            "name": "Dale Keown",
                            "role": "penciller (cover)"
                        }
                    ],
                    "returned": 5
                },
                "characters": {
                    "available": 3,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50888/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009407",
                            "name": "Loki"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009664",
                            "name": "Thor"
                        }
                    ],
                    "returned": 3
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50888/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/113693",
                            "name": "ORIGINAL SIN 5.1 ",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/113694",
                            "name": "ORIGINAL SIN 5.1 (SIN, WITH DIGITAL CODE)",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 1,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/50888/events",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/events/319",
                            "name": "Original Sin"
                        }
                    ],
                    "returned": 1
                }
            },
            {
                "id": 43295,
                "digitalId": 32816,
                "title": "Guardians of the Galaxy (2013) #11",
                "issueNumber": 11,
                "variantDescription": "",
                "description": "\"The Trial of Jean Grey.\" The Guardians of the Galaxy get a reminder of Earth when they cross paths with the All-New X-Men during the TRIAL OF JEAN GREY! When an alien race discovers that the original Jean Grey is back on Earth, they decide to hold her accountable for the acts of the Dark Phoenix, and it's up to the Guardians to help the X-Men save her. You won't want to miss the first encounter between two of the biggest franchises in the Marvel U!",
                "modified": "2014-07-17T11:35:41-0400",
                "isbn": "",
                "upc": "75960607830101111",
                "diamondCode": "NOV130563",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "The Guardians of the Galaxy get a reminder of Earth when they cross paths with the All-New X-Men during the TRIAL OF JEAN GREY! When an alien race discovers that the original Jean Grey is back on Earth, they decide to hold her accountable for the acts of the Dark Phoenix, and it&#39;s up to the Guardians to help the X-Men save her. You won&#39;t want to miss the first encounter between two of the biggest franchises in the Marvel U!"
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/43295",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/43295/guardians_of_the_galaxy_2013_11?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Guardians-of-the-Galaxy-11/digital-comic/32816?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=32816&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/32816?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/16410",
                    "name": "Guardians of the Galaxy (2013 - 2015)"
                },
                "variants": [
                    {
                        "resourceURI": "http://gateway.marvel.com/v1/public/comics/49565",
                        "name": "Guardians of the Galaxy (2013) #11 (Blank Cover Variant)"
                    },
                    {
                        "resourceURI": "http://gateway.marvel.com/v1/public/comics/49566",
                        "name": "Guardians of the Galaxy (2013) #11 (Samnee Animal Variant)"
                    },
                    {
                        "resourceURI": "http://gateway.marvel.com/v1/public/comics/49567",
                        "name": "Guardians of the Galaxy (2013) #11 (Keown Sketch Variant)"
                    },
                    {
                        "resourceURI": "http://gateway.marvel.com/v1/public/comics/49568",
                        "name": "Guardians of the Galaxy (2013) #11 (Keown Variant)"
                    }
                ],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2014-01-29T00:00:00-0500"
                    },
                    {
                        "type": "focDate",
                        "date": "2014-01-15T00:00:00-0500"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2014-07-28T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2014-01-29T00:00:00-0500"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 3.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/6/e0/52d98d90d5a55",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/6/e0/52d98d90d5a55",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/3/10/52615b153d94a",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/c/b0/5256b7a77ecfb",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/43295/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/24",
                            "name": "Brian Michael Bendis",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/9408",
                            "name": "Sara Pichelli",
                            "role": "penciller (cover)"
                        }
                    ],
                    "returned": 2
                },
                "characters": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/43295/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011299",
                            "name": "Guardians of the Galaxy"
                        }
                    ],
                    "returned": 2
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/43295/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/96952",
                            "name": "Cover #96952",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/96953",
                            "name": "Interior #96953",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/43295/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 43296,
                "digitalId": 32470,
                "title": "Guardians of the Galaxy (2013) #10",
                "issueNumber": 10,
                "variantDescription": "",
                "description": "<ul><li>Angela and Gamora go hunting.</li><li>Special guest artist Kevin Maguire (Justice League, Batman Confidential, X-Men)</li></ul>",
                "modified": "2014-06-08T14:41:59-0400",
                "isbn": "",
                "upc": "75960607830101011",
                "diamondCode": "OCT130699",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "<ul><li>Angela and Gamora go hunting.</li><li>Special guest artist Kevin Maguire (Justice League, Batman Confidential, X-Men)</li></ul>"
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/43296",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/43296/guardians_of_the_galaxy_2013_10?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Guardians-of-the-Galaxy-10/digital-comic/32470?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=32470&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/32470?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/16410",
                    "name": "Guardians of the Galaxy (2013 - 2015)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2013-12-31T00:00:00-0500"
                    },
                    {
                        "type": "focDate",
                        "date": "2013-12-10T00:00:00-0500"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2014-06-23T09:00:50-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2013-12-31T00:00:00-0500"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 1.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/9/00/52b49a5acb634",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/9/00/52b49a5acb634",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/f/50/52332211b43d4",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/43296/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/24",
                            "name": "Brian Michael Bendis",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/780",
                            "name": "Kevin Maguire",
                            "role": "penciller (cover)"
                        }
                    ],
                    "returned": 2
                },
                "characters": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/43296/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011299",
                            "name": "Guardians of the Galaxy"
                        }
                    ],
                    "returned": 2
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/43296/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/96954",
                            "name": "Guardians of the Galaxy #10",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/96955",
                            "name": "Interior #96955",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/43296/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 43300,
                "digitalId": 31568,
                "title": "Guardians of the Galaxy (2013) #6",
                "issueNumber": 6,
                "variantDescription": "",
                "description": "- The blockbuster new series hits hard as Marvel's newest superstar Angela comes right for the Guardians!\n- Round one is Gamora versus Angela...with an entire universe at stake!\n- All that and comics legend Neil Gaiman joins the award-winning Ultimate Spider-Man team of Bendis and Pichelli in this one-of-a-kind comic book event!",
                "modified": "2014-05-30T16:44:14-0400",
                "isbn": "",
                "upc": "75960607830100611",
                "diamondCode": "JUN130619",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "- The blockbuster new series hits hard as Marvel's newest superstar Angela comes right for the Guardians!\n- Round one is Gamora versus Angela...with an entire universe at stake!\n- All that and comics legend Neil Gaiman joins the award-winning Ultimate Spider-Man team of Bendis and Pichelli in this one-of-a-kind comic book event!"
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/43300",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/43300/guardians_of_the_galaxy_2013_6?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Guardians-of-the-Galaxy-6/digital-comic/31568?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=31568&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/31568?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/16410",
                    "name": "Guardians of the Galaxy (2013 - 2015)"
                },
                "variants": [
                    {
                        "resourceURI": "http://gateway.marvel.com/v1/public/comics/47926",
                        "name": "Guardians of the Galaxy (2013) #6 (Rivera Variant)"
                    }
                ],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2013-09-25T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2013-09-11T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2014-03-31T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2013-09-25T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 1.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/2/d0/523227b24d05f",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/2/d0/523227b24d05f",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/8/50/51ad014ab771b",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 3,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/43300/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/24",
                            "name": "Brian Michael Bendis",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/567",
                            "name": "Neil Gaiman",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/9408",
                            "name": "Sara Pichelli",
                            "role": "penciler (cover)"
                        }
                    ],
                    "returned": 3
                },
                "characters": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/43300/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011299",
                            "name": "Guardians of the Galaxy"
                        }
                    ],
                    "returned": 2
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/43300/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/96962",
                            "name": "Cover #96962",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/96963",
                            "name": "Interior #96963",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/43300/events",
                    "items": [],
                    "returned": 0
                }
            },
            {
                "id": 43301,
                "digitalId": 30886,
                "title": "Guardians of the Galaxy (2013) #5",
                "issueNumber": 5,
                "variantDescription": "",
                "description": "<ul><li>Spinning out of the dramatic conclusion of Age of Ultron, dimensions collide and Heaven&#39;s most fearsome Angel pushes the Guardians back on their heels.</li></ul>",
                "modified": "2015-01-13T14:09:10-0500",
                "isbn": "",
                "upc": "75960607830100511",
                "diamondCode": "MAY130589",
                "ean": "",
                "issn": "",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "<ul><li>Spinning out of the dramatic conclusion of Age of Ultron, dimensions collide and Heaven&#39;s most fearsome Angel pushes the Guardians back on their heels.</li></ul>"
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/43301",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/43301/guardians_of_the_galaxy_2013_5?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Guardians-of-the-Galaxy-5/digital-comic/30886?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=30886&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/30886?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/16410",
                    "name": "Guardians of the Galaxy (2013 - 2015)"
                },
                "variants": [
                    {
                        "resourceURI": "http://gateway.marvel.com/v1/public/comics/47801",
                        "name": "Guardians of the Galaxy (2013) #5 (Manara Angela Variant)"
                    },
                    {
                        "resourceURI": "http://gateway.marvel.com/v1/public/comics/46149",
                        "name": "Guardians of the Galaxy (2013) #5 (Rivera Variant)"
                    },
                    {
                        "resourceURI": "http://gateway.marvel.com/v1/public/comics/47518",
                        "name": "Guardians of the Galaxy (2013) #5 (Young Variant)"
                    }
                ],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2013-07-31T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2013-07-17T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2014-01-27T00:00:00-0500"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2013-07-31T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 3.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 1.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/5/d0/51e5a5ea35800",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/5/d0/51e5a5ea35800",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/b/30/51e40ccba0d15",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/3/e0/51e40c98684a7",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/5/03/519643504f6a2",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 3,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/43301/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/24",
                            "name": "Brian Michael Bendis",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/567",
                            "name": "Neil Gaiman",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/9408",
                            "name": "Sara Pichelli",
                            "role": "penciler (cover)"
                        }
                    ],
                    "returned": 3
                },
                "characters": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/43301/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017574",
                            "name": "Angela (Aldrif Odinsdottir)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011299",
                            "name": "Guardians of the Galaxy"
                        }
                    ],
                    "returned": 2
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/43301/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/96964",
                            "name": "Cover #96964",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/96965",
                            "name": "Interior #96965",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/43301/events",
                    "items": [],
                    "returned": 0
                }
            }
        ]
    }
}
    """.trimIndent()


    val singleComicSampleResponse = """
{
    "code": 200,
    "status": "Ok",
    "copyright": "© 2022 MARVEL",
    "attributionText": "Data provided by Marvel. © 2022 MARVEL",
    "attributionHTML": "<a href=\"http://marvel.com\">Data provided by Marvel. © 2022 MARVEL</a>",
    "etag": "0e86fbbc30229cc8e390eb70e3275030b04edc5b",
    "data": {
        "offset": 0,
        "limit": 20,
        "total": 1,
        "count": 1,
        "results": [
            {
                "id": 40628,
                "digitalId": 27099,
                "title": "Hulk (2008) #55",
                "issueNumber": 55,
                "variantDescription": "",
                "description": "The hands of the doomsday clock race towards MAYAN RULE! Former Avengers arrive to help stop the end of the world as more Mayan gods return. Rick \"A-Bomb\" Jones falls in battle!",
                "modified": "2012-06-19T11:48:47-0400",
                "isbn": "",
                "upc": "5960605992-05511",
                "diamondCode": "MAY120687",
                "ean": "",
                "issn": "1941-2142",
                "format": "Comic",
                "pageCount": 32,
                "textObjects": [
                    {
                        "type": "issue_solicit_text",
                        "language": "en-us",
                        "text": "<ul><li> The hands of the doomsday clock race towards MAYAN RULE!!!\n</li><li> Former Avengers arrive to help stop the end of the world as more Mayan gods return.\n</li><li> Rick &quot;A-Bomb&quot; Jones falls in battle!</li></ul>"
                    },
                    {
                        "type": "issue_preview_text",
                        "language": "en-us",
                        "text": "The hands of the doomsday clock race towards MAYAN RULE! Former Avengers arrive to help stop the end of the world as more Mayan gods return. Rick \"A-Bomb\" Jones falls in battle!"
                    }
                ],
                "resourceURI": "http://gateway.marvel.com/v1/public/comics/40628",
                "urls": [
                    {
                        "type": "detail",
                        "url": "http://marvel.com/comics/issue/40628/hulk_2008_55?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "purchase",
                        "url": "http://comicstore.marvel.com/Hulk-55/digital-comic/27099?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "reader",
                        "url": "http://marvel.com/digitalcomics/view.htm?iid=27099&utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    },
                    {
                        "type": "inAppLink",
                        "url": "https://applink.marvel.com/issue/27099?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                    }
                ],
                "series": {
                    "resourceURI": "http://gateway.marvel.com/v1/public/series/3374",
                    "name": "Hulk (2008 - 2012)"
                },
                "variants": [],
                "collections": [],
                "collectedIssues": [],
                "dates": [
                    {
                        "type": "onsaleDate",
                        "date": "2012-07-04T00:00:00-0400"
                    },
                    {
                        "type": "focDate",
                        "date": "2012-06-20T00:00:00-0400"
                    },
                    {
                        "type": "unlimitedDate",
                        "date": "2013-04-08T00:00:00-0400"
                    },
                    {
                        "type": "digitalPurchaseDate",
                        "date": "2012-07-04T00:00:00-0400"
                    }
                ],
                "prices": [
                    {
                        "type": "printPrice",
                        "price": 2.99
                    },
                    {
                        "type": "digitalPurchasePrice",
                        "price": 1.99
                    }
                ],
                "thumbnail": {
                    "path": "http://i.annihil.us/u/prod/marvel/i/mg/6/60/5ba3d0869c543",
                    "extension": "jpg"
                },
                "images": [
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/6/60/5ba3d0869c543",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/c/a0/4fda5398edc41",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/9/b0/4fda539915bf3",
                        "extension": "jpg"
                    },
                    {
                        "path": "http://i.annihil.us/u/prod/marvel/i/mg/6/d0/4fda5398a0685",
                        "extension": "jpg"
                    }
                ],
                "creators": {
                    "available": 5,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/40628/creators",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/10172",
                            "name": "Vc Clayton Cowles",
                            "role": "letterer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/3646",
                            "name": "Dale Eaglesham",
                            "role": "penciller (cover)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/4600",
                            "name": "Mark Paniccia",
                            "role": "editor"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/824",
                            "name": "Jeff Parker",
                            "role": "writer"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/creators/832",
                            "name": "Val Staples",
                            "role": "colorist"
                        }
                    ],
                    "returned": 5
                },
                "characters": {
                    "available": 9,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/40628/characters",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1017100",
                            "name": "A-Bomb (HAS)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010370",
                            "name": "Alpha Flight"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009220",
                            "name": "Captain America"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010854",
                            "name": "Living Lightning"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010805",
                            "name": "Machine Man"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011360",
                            "name": "Red Hulk"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1009583",
                            "name": "She-Hulk (Jennifer Walters)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1011392",
                            "name": "She-Hulk (Lyra)"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/characters/1010864",
                            "name": "Silverclaw"
                        }
                    ],
                    "returned": 9
                },
                "stories": {
                    "available": 2,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/40628/stories",
                    "items": [
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/92078",
                            "name": "Hulk (2008) #55",
                            "type": "cover"
                        },
                        {
                            "resourceURI": "http://gateway.marvel.com/v1/public/stories/92079",
                            "name": "Interior #92079",
                            "type": "interiorStory"
                        }
                    ],
                    "returned": 2
                },
                "events": {
                    "available": 0,
                    "collectionURI": "http://gateway.marvel.com/v1/public/comics/40628/events",
                    "items": [],
                    "returned": 0
                }
            }
        ]
    }
}
        """.trimIndent()
}