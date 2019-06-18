package com.example.blockchain_test.service.impl;

import com.example.blockchain_test.dao.BlockMapper;
import com.example.blockchain_test.dto.BlockListDTO;
import com.example.blockchain_test.po.Block;
import com.example.blockchain_test.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class BlockServiceImpl implements BlockService{

    @Autowired
    private BlockMapper blockMapper;

    @Override
    public List<BlockListDTO> getRecentBlocks() {
        List<Block> blocks = blockMapper.selectRecentBlocks();
        List<BlockListDTO> blockListDTOS = new ArrayList<>();
        for (Block block : blocks) {
            BlockListDTO blockListDTO = new BlockListDTO();
            blockListDTO.setBlockhash(block.getBlockhash());
            blockListDTO.setHeight(block.getHeight());
            blockListDTO.setTime(block.getTime());
            blockListDTOS.add(blockListDTO);
        }
        return blockListDTOS;
    }
}
