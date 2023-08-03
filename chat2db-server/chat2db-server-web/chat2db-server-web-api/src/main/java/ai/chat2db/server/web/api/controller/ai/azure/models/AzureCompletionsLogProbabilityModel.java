// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package ai.chat2db.server.web.api.controller.ai.azure.models;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/** Representation of a log probabilities model for a completions generation. */
@Data
public final class AzureCompletionsLogProbabilityModel {

    /*
     * The textual forms of tokens evaluated in this probability model.
     */
    @JsonProperty(value = "tokens")
    private List<String> tokens;

    /*
     * A collection of log probability values for the tokens in this completions data.
     */
    @JsonProperty(value = "token_logprobs")
    private List<Double> tokenLogprobs;

    /*
     * A mapping of tokens to maximum log probability values in this completions data.
     */
    @JsonProperty(value = "top_logprobs")
    private List<Map<String, Double>> topLogprobs;

    /*
     * The text offsets associated with tokens in this completions data.
     */
    @JsonProperty(value = "text_offset")
    private List<Integer> textOffset;

    /**
     * Creates an instance of CompletionsLogProbabilityModel class.
     *
     * @param tokens the tokens value to set.
     * @param tokenLogprobs the tokenLogprobs value to set.
     * @param topLogprobs the topLogprobs value to set.
     * @param textOffset the textOffset value to set.
     */
    @JsonCreator
    private AzureCompletionsLogProbabilityModel(
            @JsonProperty(value = "tokens") List<String> tokens,
            @JsonProperty(value = "token_logprobs") List<Double> tokenLogprobs,
            @JsonProperty(value = "top_logprobs") List<Map<String, Double>> topLogprobs,
            @JsonProperty(value = "text_offset") List<Integer> textOffset) {
        this.tokens = tokens;
        this.tokenLogprobs = tokenLogprobs;
        this.topLogprobs = topLogprobs;
        this.textOffset = textOffset;
    }

    /**
     * Get the tokens property: The textual forms of tokens evaluated in this probability model.
     *
     * @return the tokens value.
     */
    public List<String> getTokens() {
        return this.tokens;
    }

    /**
     * Get the tokenLogprobs property: A collection of log probability values for the tokens in this completions data.
     *
     * @return the tokenLogprobs value.
     */
    public List<Double> getTokenLogprobs() {
        return this.tokenLogprobs;
    }

    /**
     * Get the topLogprobs property: A mapping of tokens to maximum log probability values in this completions data.
     *
     * @return the topLogprobs value.
     */
    public List<Map<String, Double>> getTopLogprobs() {
        return this.topLogprobs;
    }

    /**
     * Get the textOffset property: The text offsets associated with tokens in this completions data.
     *
     * @return the textOffset value.
     */
    public List<Integer> getTextOffset() {
        return this.textOffset;
    }
}