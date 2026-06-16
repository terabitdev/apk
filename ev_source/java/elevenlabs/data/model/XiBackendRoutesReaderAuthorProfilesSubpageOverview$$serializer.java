package io.elevenlabs.data.model;

import io.elevenlabs.data.model.XiBackendRoutesReaderAuthorProfilesSubpageOverview;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import sn.c;
import sn.h;
import tr.b;
import ur.a0;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview.$serializer", "Lur/a0;", "Lio/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@c
/* loaded from: classes3.dex */
public final /* synthetic */ class XiBackendRoutesReaderAuthorProfilesSubpageOverview$$serializer implements a0 {
    public static final XiBackendRoutesReaderAuthorProfilesSubpageOverview$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        XiBackendRoutesReaderAuthorProfilesSubpageOverview$$serializer xiBackendRoutesReaderAuthorProfilesSubpageOverview$$serializer = new XiBackendRoutesReaderAuthorProfilesSubpageOverview$$serializer();
        INSTANCE = xiBackendRoutesReaderAuthorProfilesSubpageOverview$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.elevenlabs.data.model.XiBackendRoutesReaderAuthorProfilesSubpageOverview", xiBackendRoutesReaderAuthorProfilesSubpageOverview$$serializer, 5);
        pluginGeneratedSerialDescriptor.b("id", false);
        pluginGeneratedSerialDescriptor.b("title", false);
        pluginGeneratedSerialDescriptor.b("default_sort", false);
        pluginGeneratedSerialDescriptor.b("available_sorts", false);
        pluginGeneratedSerialDescriptor.b("item_count_label", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private XiBackendRoutesReaderAuthorProfilesSubpageOverview$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ur.a0
    public final KSerializer[] childSerializers() {
        h[] hVarArr;
        hVarArr = XiBackendRoutesReaderAuthorProfilesSubpageOverview.$childSerializers;
        g1 g1Var = g1.f34588a;
        return new KSerializer[]{g1Var, g1Var, hVarArr[2].getValue(), hVarArr[3].getValue(), g1Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final XiBackendRoutesReaderAuthorProfilesSubpageOverview deserialize(Decoder decoder) {
        h[] hVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.a b10 = decoder.b(serialDescriptor);
        hVarArr = XiBackendRoutesReaderAuthorProfilesSubpageOverview.$childSerializers;
        b10.getClass();
        int i10 = 0;
        String str = null;
        String str2 = null;
        XiBackendRoutesReaderAuthorProfilesSubpageOverview.DefaultSort defaultSort = null;
        Map map = null;
        String str3 = null;
        boolean z6 = true;
        while (z6) {
            int s10 = b10.s(serialDescriptor);
            if (s10 != -1) {
                if (s10 != 0) {
                    if (s10 != 1) {
                        if (s10 != 2) {
                            if (s10 != 3) {
                                if (s10 == 4) {
                                    str3 = b10.q(serialDescriptor, 4);
                                    i10 |= 16;
                                } else {
                                    ha.a.e(s10);
                                    return null;
                                }
                            } else {
                                map = (Map) b10.d0(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), map);
                                i10 |= 8;
                            }
                        } else {
                            defaultSort = (XiBackendRoutesReaderAuthorProfilesSubpageOverview.DefaultSort) b10.d0(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), defaultSort);
                            i10 |= 4;
                        }
                    } else {
                        str2 = b10.q(serialDescriptor, 1);
                        i10 |= 2;
                    }
                } else {
                    str = b10.q(serialDescriptor, 0);
                    i10 |= 1;
                }
            } else {
                z6 = false;
            }
        }
        b10.c(serialDescriptor);
        return new XiBackendRoutesReaderAuthorProfilesSubpageOverview(i10, str, str2, defaultSort, map, str3, null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, XiBackendRoutesReaderAuthorProfilesSubpageOverview value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b b10 = encoder.b(serialDescriptor);
        XiBackendRoutesReaderAuthorProfilesSubpageOverview.write$Self$data_release(value, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    @Override // ur.a0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
