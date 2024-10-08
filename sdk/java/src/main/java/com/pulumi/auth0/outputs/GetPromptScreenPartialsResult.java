// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetPromptScreenPartialsScreenPartial;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPromptScreenPartialsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The type of prompt to customize.
     * 
     */
    private String promptType;
    /**
     * @return The screen partials associated with the prompt type.
     * 
     */
    private List<GetPromptScreenPartialsScreenPartial> screenPartials;

    private GetPromptScreenPartialsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The type of prompt to customize.
     * 
     */
    public String promptType() {
        return this.promptType;
    }
    /**
     * @return The screen partials associated with the prompt type.
     * 
     */
    public List<GetPromptScreenPartialsScreenPartial> screenPartials() {
        return this.screenPartials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPromptScreenPartialsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String promptType;
        private List<GetPromptScreenPartialsScreenPartial> screenPartials;
        public Builder() {}
        public Builder(GetPromptScreenPartialsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.promptType = defaults.promptType;
    	      this.screenPartials = defaults.screenPartials;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPromptScreenPartialsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder promptType(String promptType) {
            if (promptType == null) {
              throw new MissingRequiredPropertyException("GetPromptScreenPartialsResult", "promptType");
            }
            this.promptType = promptType;
            return this;
        }
        @CustomType.Setter
        public Builder screenPartials(List<GetPromptScreenPartialsScreenPartial> screenPartials) {
            if (screenPartials == null) {
              throw new MissingRequiredPropertyException("GetPromptScreenPartialsResult", "screenPartials");
            }
            this.screenPartials = screenPartials;
            return this;
        }
        public Builder screenPartials(GetPromptScreenPartialsScreenPartial... screenPartials) {
            return screenPartials(List.of(screenPartials));
        }
        public GetPromptScreenPartialsResult build() {
            final var _resultValue = new GetPromptScreenPartialsResult();
            _resultValue.id = id;
            _resultValue.promptType = promptType;
            _resultValue.screenPartials = screenPartials;
            return _resultValue;
        }
    }
}
