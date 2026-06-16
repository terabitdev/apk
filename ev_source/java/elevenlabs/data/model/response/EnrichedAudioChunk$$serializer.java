package io.elevenlabs.data.model.response;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import ur.a0;
import ur.g;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/elevenlabs/data/model/response/EnrichedAudioChunk.$serializer", "Lur/a0;", "Lio/elevenlabs/data/model/response/EnrichedAudioChunk;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/model/response/EnrichedAudioChunk;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/model/response/EnrichedAudioChunk;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@sn.c
/* loaded from: classes3.dex */
public final /* synthetic */ class EnrichedAudioChunk$$serializer implements a0 {
    public static final EnrichedAudioChunk$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        EnrichedAudioChunk$$serializer enrichedAudioChunk$$serializer = new EnrichedAudioChunk$$serializer();
        INSTANCE = enrichedAudioChunk$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.elevenlabs.data.model.response.EnrichedAudioChunk", enrichedAudioChunk$$serializer, 3);
        pluginGeneratedSerialDescriptor.b("alignment", false);
        pluginGeneratedSerialDescriptor.b("audio", false);
        pluginGeneratedSerialDescriptor.b("isFinal", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EnrichedAudioChunk$$serializer() {
    }

    @Override // ur.a0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{c1.w(Alignment$$serializer.INSTANCE), c1.w(g1.f34588a), g.f34583a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final EnrichedAudioChunk deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.a b10 = decoder.b(serialDescriptor);
        b10.getClass();
        int i10 = 0;
        boolean z6 = false;
        Alignment alignment = null;
        String str = null;
        boolean z10 = true;
        while (z10) {
            int s10 = b10.s(serialDescriptor);
            if (s10 != -1) {
                if (s10 != 0) {
                    if (s10 != 1) {
                        if (s10 == 2) {
                            z6 = b10.W(serialDescriptor, 2);
                            i10 |= 4;
                        } else {
                            ha.a.e(s10);
                            return null;
                        }
                    } else {
                        str = (String) b10.b0(serialDescriptor, 1, g1.f34588a, str);
                        i10 |= 2;
                    }
                } else {
                    alignment = (Alignment) b10.b0(serialDescriptor, 0, Alignment$$serializer.INSTANCE, alignment);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        b10.c(serialDescriptor);
        return new EnrichedAudioChunk(i10, alignment, str, z6, null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, EnrichedAudioChunk value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.b b10 = encoder.b(serialDescriptor);
        EnrichedAudioChunk.write$Self$data_release(value, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    @Override // ur.a0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
