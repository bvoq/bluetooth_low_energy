//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: message.proto

package dev.yanshouwang.bluetooth_low_energy;

@kotlin.jvm.JvmSynthetic
inline fun startDiscoveryArguments(block: dev.yanshouwang.bluetooth_low_energy.StartDiscoveryArgumentsKt.Dsl.() -> Unit): dev.yanshouwang.bluetooth_low_energy.MessageOuterClass.StartDiscoveryArguments =
  dev.yanshouwang.bluetooth_low_energy.StartDiscoveryArgumentsKt.Dsl._create(dev.yanshouwang.bluetooth_low_energy.MessageOuterClass.StartDiscoveryArguments.newBuilder()).apply { block() }._build()
object StartDiscoveryArgumentsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: dev.yanshouwang.bluetooth_low_energy.MessageOuterClass.StartDiscoveryArguments.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.yanshouwang.bluetooth_low_energy.MessageOuterClass.StartDiscoveryArguments.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.yanshouwang.bluetooth_low_energy.MessageOuterClass.StartDiscoveryArguments = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class ServicesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string services = 1;</code>
     * @return A list containing the services.
     */
    val services: com.google.protobuf.kotlin.DslList<kotlin.String, ServicesProxy>
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getServicesList()
      )
    /**
     * <code>repeated string services = 1;</code>
     * @param value The services to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addServices")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, ServicesProxy>.add(value: kotlin.String) {
      _builder.addServices(value)
    }
    /**
     * <code>repeated string services = 1;</code>
     * @param value The services to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignServices")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ServicesProxy>.plusAssign(value: kotlin.String) {
      _builder.addServices(value)
    }
    /**
     * <code>repeated string services = 1;</code>
     * @param values The services to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllServices")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, ServicesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllServices(values)
    }
    /**
     * <code>repeated string services = 1;</code>
     * @param values The services to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllServices")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ServicesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllServices(values)
    }
    /**
     * <code>repeated string services = 1;</code>
     * @param index The index to set the value at.
     * @param value The services to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setServices")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ServicesProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setServices(index, value)
    }/**
     * <code>repeated string services = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearServices")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, ServicesProxy>.clear() {
      _builder.clearServices()
    }}
}
@kotlin.jvm.JvmSynthetic
inline fun dev.yanshouwang.bluetooth_low_energy.MessageOuterClass.StartDiscoveryArguments.copy(block: dev.yanshouwang.bluetooth_low_energy.StartDiscoveryArgumentsKt.Dsl.() -> Unit): dev.yanshouwang.bluetooth_low_energy.MessageOuterClass.StartDiscoveryArguments =
  dev.yanshouwang.bluetooth_low_energy.StartDiscoveryArgumentsKt.Dsl._create(this.toBuilder()).apply { block() }._build()
