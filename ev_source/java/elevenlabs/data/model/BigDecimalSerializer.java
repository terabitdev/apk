package io.elevenlabs.data.model;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.JsonNull;
import livekit.LivekitInternal$NodeStats;
import o0.e;
import sr.d;
import vr.i;
import vr.j;
import vr.n;
import vr.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/data/model/BigDecimalSerializer;", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/BigDecimalJson;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/model/BigDecimalJson;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/model/BigDecimalJson;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BigDecimalSerializer implements KSerializer {
    public static final BigDecimalSerializer INSTANCE = new BigDecimalSerializer();
    private static final SerialDescriptor descriptor = e.d("java.math.BigDecimal", d.f31711e);

    private BigDecimalSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer
    public BigDecimalJson deserialize(Decoder decoder) {
        BigDecimal bigDecimal;
        decoder.getClass();
        if (decoder instanceof i) {
            bigDecimal = new BigDecimal(j.h(((i) decoder).k()).b());
        } else {
            bigDecimal = new BigDecimal(decoder.S());
        }
        return new BigDecimalJson(bigDecimal);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, BigDecimalJson value) {
        kotlinx.serialization.json.d qVar;
        encoder.getClass();
        value.getClass();
        if (encoder instanceof n) {
            n nVar = (n) encoder;
            String plainString = value.getValue().toPlainString();
            InlineClassDescriptor inlineClassDescriptor = j.f35876a;
            if (plainString == null) {
                qVar = JsonNull.INSTANCE;
            } else {
                JsonNull.INSTANCE.getClass();
                if (!plainString.equals("null")) {
                    qVar = new q(plainString, false, j.f35876a);
                } else {
                    throw new IllegalArgumentException("Creating a literal unquoted value of 'null' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive");
                }
            }
            nVar.d(qVar);
            return;
        }
        String plainString2 = value.getValue().toPlainString();
        plainString2.getClass();
        encoder.i0(plainString2);
    }
}
