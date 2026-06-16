package io.elevenlabs.data.model.response;

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
import sn.h;
import ur.a0;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/elevenlabs/data/model/response/GetReadsExplorePageResponseModel.$serializer", "Lur/a0;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@sn.c
/* loaded from: classes3.dex */
public final /* synthetic */ class GetReadsExplorePageResponseModel$$serializer implements a0 {
    public static final GetReadsExplorePageResponseModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        GetReadsExplorePageResponseModel$$serializer getReadsExplorePageResponseModel$$serializer = new GetReadsExplorePageResponseModel$$serializer();
        INSTANCE = getReadsExplorePageResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.elevenlabs.data.model.response.GetReadsExplorePageResponseModel", getReadsExplorePageResponseModel$$serializer, 5);
        pluginGeneratedSerialDescriptor.b("sections", false);
        pluginGeneratedSerialDescriptor.b("language", false);
        pluginGeneratedSerialDescriptor.b("page_filters", true);
        pluginGeneratedSerialDescriptor.b("filter_options", true);
        pluginGeneratedSerialDescriptor.b("next_cursor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GetReadsExplorePageResponseModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ur.a0
    public final KSerializer[] childSerializers() {
        h[] hVarArr;
        hVarArr = GetReadsExplorePageResponseModel.$childSerializers;
        g1 g1Var = g1.f34588a;
        return new KSerializer[]{hVarArr[0].getValue(), g1Var, c1.w((KSerializer) hVarArr[2].getValue()), c1.w((KSerializer) hVarArr[3].getValue()), c1.w(g1Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final GetReadsExplorePageResponseModel deserialize(Decoder decoder) {
        h[] hVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.a b10 = decoder.b(serialDescriptor);
        hVarArr = GetReadsExplorePageResponseModel.$childSerializers;
        b10.getClass();
        int i10 = 0;
        List list = null;
        String str = null;
        List list2 = null;
        Map map = null;
        String str2 = null;
        boolean z6 = true;
        while (z6) {
            int s10 = b10.s(serialDescriptor);
            if (s10 != -1) {
                if (s10 != 0) {
                    if (s10 != 1) {
                        if (s10 != 2) {
                            if (s10 != 3) {
                                if (s10 == 4) {
                                    str2 = (String) b10.b0(serialDescriptor, 4, g1.f34588a, str2);
                                    i10 |= 16;
                                } else {
                                    ha.a.e(s10);
                                    return null;
                                }
                            } else {
                                map = (Map) b10.b0(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), map);
                                i10 |= 8;
                            }
                        } else {
                            list2 = (List) b10.b0(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), list2);
                            i10 |= 4;
                        }
                    } else {
                        str = b10.q(serialDescriptor, 1);
                        i10 |= 2;
                    }
                } else {
                    list = (List) b10.d0(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), list);
                    i10 |= 1;
                }
            } else {
                z6 = false;
            }
        }
        b10.c(serialDescriptor);
        return new GetReadsExplorePageResponseModel(i10, list, str, list2, map, str2, (ur.c1) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, GetReadsExplorePageResponseModel value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.b b10 = encoder.b(serialDescriptor);
        GetReadsExplorePageResponseModel.write$Self$data_release(value, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    @Override // ur.a0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
