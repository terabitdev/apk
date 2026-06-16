package io.livekit.android.room;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import sn.c;
import tr.a;
import tr.b;
import ur.a0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"io/livekit/android/room/RegionSettings.$serializer", "Lur/a0;", "Lio/livekit/android/room/RegionSettings;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/livekit/android/room/RegionSettings;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/livekit/android/room/RegionSettings;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@c
/* loaded from: classes4.dex */
public final class RegionSettings$$serializer implements a0 {
    public static final RegionSettings$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        RegionSettings$$serializer regionSettings$$serializer = new RegionSettings$$serializer();
        INSTANCE = regionSettings$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.livekit.android.room.RegionSettings", regionSettings$$serializer, 1);
        pluginGeneratedSerialDescriptor.b("regions", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RegionSettings$$serializer() {
    }

    @Override // ur.a0
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = RegionSettings.$childSerializers;
        return new KSerializer[]{kSerializerArr[0]};
    }

    @Override // kotlinx.serialization.KSerializer
    public RegionSettings deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        decoder.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        a b10 = decoder.b(descriptor2);
        kSerializerArr = RegionSettings.$childSerializers;
        b10.getClass();
        boolean z6 = true;
        int i10 = 0;
        List list = null;
        while (z6) {
            int s10 = b10.s(descriptor2);
            if (s10 != -1) {
                if (s10 == 0) {
                    list = (List) b10.d0(descriptor2, 0, kSerializerArr[0], list);
                    i10 = 1;
                } else {
                    ha.a.e(s10);
                    return null;
                }
            } else {
                z6 = false;
            }
        }
        b10.c(descriptor2);
        return new RegionSettings(i10, list, null);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, RegionSettings value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        b b10 = encoder.b(descriptor2);
        b10.g(descriptor2, 0, RegionSettings.$childSerializers[0], value.regions);
        b10.c(descriptor2);
    }

    @Override // ur.a0
    public KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
