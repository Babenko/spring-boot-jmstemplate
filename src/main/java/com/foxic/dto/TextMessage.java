package com.foxic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sem Babenko
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TextMessage implements Message<CharSequence> {

    private CharSequence payload;

    @Override
    public CharSequence getPayload() {
        return payload;
    }
}
