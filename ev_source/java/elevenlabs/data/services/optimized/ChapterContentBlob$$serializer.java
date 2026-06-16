package io.elevenlabs.data.services.optimized;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import sn.c;
import sn.h;
import tr.a;
import tr.b;
import ur.a0;
import ur.f0;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/elevenlabs/data/services/optimized/ChapterContentBlob.$serializer", "Lur/a0;", "Lio/elevenlabs/data/services/optimized/ChapterContentBlob;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/services/optimized/ChapterContentBlob;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/services/optimized/ChapterContentBlob;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@c
/* loaded from: classes3.dex */
public final /* synthetic */ class ChapterContentBlob$$serializer implements a0 {
    public static final ChapterContentBlob$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChapterContentBlob$$serializer chapterContentBlob$$serializer = new ChapterContentBlob$$serializer();
        INSTANCE = chapterContentBlob$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.elevenlabs.data.services.optimized.ChapterContentBlob", chapterContentBlob$$serializer, 6);
        pluginGeneratedSerialDescriptor.b("schemaVersion", true);
        pluginGeneratedSerialDescriptor.b("chapterIndex", false);
        pluginGeneratedSerialDescriptor.b("elements", false);
        pluginGeneratedSerialDescriptor.b("offsetsToElementsMap", false);
        pluginGeneratedSerialDescriptor.b("audioFileNumber", false);
        pluginGeneratedSerialDescriptor.b("tsPairs", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChapterContentBlob$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ur.a0
    public final KSerializer[] childSerializers() {
        h[] hVarArr;
        hVarArr = ChapterContentBlob.$childSerializers;
        f0 f0Var = f0.f34579a;
        return new KSerializer[]{f0Var, f0Var, hVarArr[2].getValue(), hVarArr[3].getValue(), c1.w(g1.f34588a), hVarArr[5].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ChapterContentBlob deserialize(Decoder decoder) {
        h[] hVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a b10 = decoder.b(serialDescriptor);
        hVarArr = ChapterContentBlob.$childSerializers;
        b10.getClass();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        List list = null;
        Map map = null;
        String str = null;
        List list2 = null;
        boolean z6 = true;
        while (z6) {
            int s10 = b10.s(serialDescriptor);
            switch (s10) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    i11 = b10.m(serialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    i12 = b10.m(serialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    list = (List) b10.d0(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), list);
                    i10 |= 4;
                    break;
                case 3:
                    map = (Map) b10.d0(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), map);
                    i10 |= 8;
                    break;
                case 4:
                    str = (String) b10.b0(serialDescriptor, 4, g1.f34588a, str);
                    i10 |= 16;
                    break;
                case 5:
                    list2 = (List) b10.d0(serialDescriptor, 5, (KSerializer) hVarArr[5].getValue(), list2);
                    i10 |= 32;
                    break;
                default:
                    ha.a.e(s10);
                    return null;
            }
        }
        b10.c(serialDescriptor);
        return new ChapterContentBlob(i10, i11, i12, list, map, str, list2, (ur.c1) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChapterContentBlob value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b b10 = encoder.b(serialDescriptor);
        ChapterContentBlob.write$Self$data_release(value, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    @Override // ur.a0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
