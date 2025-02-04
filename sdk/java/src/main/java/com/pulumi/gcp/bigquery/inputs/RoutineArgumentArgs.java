// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoutineArgumentArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoutineArgumentArgs Empty = new RoutineArgumentArgs();

    /**
     * Defaults to FIXED_TYPE.
     * Default value is `FIXED_TYPE`.
     * Possible values are `FIXED_TYPE` and `ANY_TYPE`.
     * 
     */
    @Import(name="argumentKind")
    private @Nullable Output<String> argumentKind;

    /**
     * @return Defaults to FIXED_TYPE.
     * Default value is `FIXED_TYPE`.
     * Possible values are `FIXED_TYPE` and `ANY_TYPE`.
     * 
     */
    public Optional<Output<String>> argumentKind() {
        return Optional.ofNullable(this.argumentKind);
    }

    /**
     * A JSON schema for the data type. Required unless argumentKind = ANY_TYPE.
     * ~&gt;**NOTE**: Because this field expects a JSON string, any changes to the string
     * will create a diff, even if the JSON itself hasn&#39;t changed. If the API returns
     * a different value for the same schema, e.g. it switched the order of values
     * or replaced STRUCT field type with RECORD field type, we currently cannot
     * suppress the recurring diff this causes. As a workaround, we recommend using
     * the schema as returned by the API.
     * 
     */
    @Import(name="dataType")
    private @Nullable Output<String> dataType;

    /**
     * @return A JSON schema for the data type. Required unless argumentKind = ANY_TYPE.
     * ~&gt;**NOTE**: Because this field expects a JSON string, any changes to the string
     * will create a diff, even if the JSON itself hasn&#39;t changed. If the API returns
     * a different value for the same schema, e.g. it switched the order of values
     * or replaced STRUCT field type with RECORD field type, we currently cannot
     * suppress the recurring diff this causes. As a workaround, we recommend using
     * the schema as returned by the API.
     * 
     */
    public Optional<Output<String>> dataType() {
        return Optional.ofNullable(this.dataType);
    }

    /**
     * Specifies whether the argument is input or output. Can be set for procedures only.
     * Possible values are `IN`, `OUT`, and `INOUT`.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return Specifies whether the argument is input or output. Can be set for procedures only.
     * Possible values are `IN`, `OUT`, and `INOUT`.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The name of this argument. Can be absent for function return argument.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of this argument. Can be absent for function return argument.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private RoutineArgumentArgs() {}

    private RoutineArgumentArgs(RoutineArgumentArgs $) {
        this.argumentKind = $.argumentKind;
        this.dataType = $.dataType;
        this.mode = $.mode;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoutineArgumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoutineArgumentArgs $;

        public Builder() {
            $ = new RoutineArgumentArgs();
        }

        public Builder(RoutineArgumentArgs defaults) {
            $ = new RoutineArgumentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param argumentKind Defaults to FIXED_TYPE.
         * Default value is `FIXED_TYPE`.
         * Possible values are `FIXED_TYPE` and `ANY_TYPE`.
         * 
         * @return builder
         * 
         */
        public Builder argumentKind(@Nullable Output<String> argumentKind) {
            $.argumentKind = argumentKind;
            return this;
        }

        /**
         * @param argumentKind Defaults to FIXED_TYPE.
         * Default value is `FIXED_TYPE`.
         * Possible values are `FIXED_TYPE` and `ANY_TYPE`.
         * 
         * @return builder
         * 
         */
        public Builder argumentKind(String argumentKind) {
            return argumentKind(Output.of(argumentKind));
        }

        /**
         * @param dataType A JSON schema for the data type. Required unless argumentKind = ANY_TYPE.
         * ~&gt;**NOTE**: Because this field expects a JSON string, any changes to the string
         * will create a diff, even if the JSON itself hasn&#39;t changed. If the API returns
         * a different value for the same schema, e.g. it switched the order of values
         * or replaced STRUCT field type with RECORD field type, we currently cannot
         * suppress the recurring diff this causes. As a workaround, we recommend using
         * the schema as returned by the API.
         * 
         * @return builder
         * 
         */
        public Builder dataType(@Nullable Output<String> dataType) {
            $.dataType = dataType;
            return this;
        }

        /**
         * @param dataType A JSON schema for the data type. Required unless argumentKind = ANY_TYPE.
         * ~&gt;**NOTE**: Because this field expects a JSON string, any changes to the string
         * will create a diff, even if the JSON itself hasn&#39;t changed. If the API returns
         * a different value for the same schema, e.g. it switched the order of values
         * or replaced STRUCT field type with RECORD field type, we currently cannot
         * suppress the recurring diff this causes. As a workaround, we recommend using
         * the schema as returned by the API.
         * 
         * @return builder
         * 
         */
        public Builder dataType(String dataType) {
            return dataType(Output.of(dataType));
        }

        /**
         * @param mode Specifies whether the argument is input or output. Can be set for procedures only.
         * Possible values are `IN`, `OUT`, and `INOUT`.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Specifies whether the argument is input or output. Can be set for procedures only.
         * Possible values are `IN`, `OUT`, and `INOUT`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param name The name of this argument. Can be absent for function return argument.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this argument. Can be absent for function return argument.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public RoutineArgumentArgs build() {
            return $;
        }
    }

}
