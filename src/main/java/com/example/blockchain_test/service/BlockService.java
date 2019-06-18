package com.example.blockchain_test.service;

import com.example.blockchain_test.dto.BlockListDTO;

import java.util.List;

public interface BlockService {
    List<BlockListDTO> getRecentBlocks();

    // List<BlockListDTO> getRecentBlocks();
}
