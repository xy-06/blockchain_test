method：GET  
url: /block/getRecentBlocks

response:
```json
[
    {
        "blockhash": "00000000000000000024b3d4793dcbba032d3fc28a0d77a37d466b956fb68aa5",
        "height": 580644,
        "time": "2019-06-14T08:28:23.750+0000",
        "txsize": 2390,
        "size": 1257767,
        "prevBlcok": "00000000000000000005ac7036789bfec28d230dff491f3382f6daf6523f5c44",
        "nextBlock": "00000000000000000024b3d4793dcbba032d3fc28a0d77a37d466b956fb68aa5"
    }
]
```

| ResponseField     |     Type |   Description   | 
| :--------------: | :--------:| :------: |
|    blockhash|   String |  区块hash |
|    height|   Integer |  区块高度 |
|    time|   Date |  出块时间 |
|    txsize|   Short |  交易数量 |
|    size|   Integer |  区块大小 |
|    prevBlcok|   String | 前一个区块 |
|    nextBlock|   String |  后一个区块 |



## 2 根据区块hash获取区块详情

method：GET  
url: /block/getByBlockhash?blockhash={blockhash}

response:
```json
{
    "blockhash": "00000000000000000001ce5f88601a311f1c73c0073a15fe4e5956da7fbcd78b",
    "height": 580643,
    "prevBlcok": "00000000000000000005ac7036789bfec28d230dff491f3382f6daf6523f5c44",
    "nextBlock": "00000000000000000024b3d4793dcbba032d3fc28a0d77a37d466b956fb68aa5",
    "merkleRoot": "07ac3d1c827b5c3ef69a7341bbdb2bf72339139b5f9e7e782d1bc82265b17798",
    "txSize": 2702,
    "outputTotal": null,
    "fees": 8766.38,
    "time": 1560502355355,
    "difficulty": 7409399249090.25,
    "size": 1322496
}
```

| ResponseField     |     Type |   Description   | 
| :--------------: | :--------:| :------: |
|    blockhash|   String |  区块hash |
|    height|   Integer |  区块高度 |
|    prevBlcok|   String | 前一个区块 |
|    nextBlock|   String |  后一个区块 |
|    merkleRoot|   String |  梅尔克树 |
|    txSize|   Short |  交易数量 |
|    outputTotal|   Double |  总输出 |
|    fees|   Double |  交易费用 |
|    time|   Long |  出块时间 |
|    difficulty|   Double |  难度系数 |
|    size|   Integer |  区块大小 |






## 3 根据区块hash获取区块交易详情

method：GET  
url: /block/getByBlockhash?blockhashTedall={blockhashTedall}

response:
```json
{
    "blockhash": "00000000000000000001ce5f88601a311f1c73c0073a15fe4e5956da7fbcd78b",
    "address": "00000000000000000005ac7036789bfec28d230dff491f3382f6daf6523f5c44",
    "fees":8766.38,
   "outputTotal":	6098.51829156,
    "size": 1322496
}

```

| ResponseField     |     Type |   Description   | 
| :--------------: | :--------:| :------: |
|    blockhash|   String |  区块hash |
|    address|   string |  区块地址 |
|    outputTotal|   Double | 总输出 |
|    fees|   Double |  交易费用|
|    size|   Integer |  区块大小 |

