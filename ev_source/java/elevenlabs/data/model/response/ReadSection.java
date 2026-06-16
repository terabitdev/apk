package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0002-,B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB/\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lio/elevenlabs/data/model/response/ReadSection;", "Lio/elevenlabs/data/model/response/ReadDetailsSection;", "Lio/elevenlabs/data/model/response/AuthorProfileSection;", "Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;", "read", "", "orderLabel", "<init>", "(Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILio/elevenlabs/data/model/response/ReadMetadataResponseModel;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ReadSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;", "component2", "()Ljava/lang/String;", "copy", "(Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;Ljava/lang/String;)Lio/elevenlabs/data/model/response/ReadSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;", "getRead", "getRead$annotations", "()V", "Ljava/lang/String;", "getOrderLabel", "getOrderLabel$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ReadSection implements ReadDetailsSection, AuthorProfileSection {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String orderLabel;
    private final ReadMetadataResponseModel read;

    public /* synthetic */ ReadSection(int i10, ReadMetadataResponseModel readMetadataResponseModel, String str, c1 c1Var) {
        if (3 == (i10 & 3)) {
            this.read = readMetadataResponseModel;
            this.orderLabel = str;
        } else {
            t0.j(i10, 3, ReadSection$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ ReadSection copy$default(ReadSection readSection, ReadMetadataResponseModel readMetadataResponseModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            readMetadataResponseModel = readSection.read;
        }
        if ((i10 & 2) != 0) {
            str = readSection.orderLabel;
        }
        return readSection.copy(readMetadataResponseModel, str);
    }

    public static final /* synthetic */ void write$Self$data_release(ReadSection self, tr.b output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, ReadMetadataResponseModel$$serializer.INSTANCE, self.read);
        output.o(serialDesc, 1, g1.f34588a, self.orderLabel);
    }

    /* renamed from: component1, reason: from getter */
    public final ReadMetadataResponseModel getRead() {
        return this.read;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderLabel() {
        return this.orderLabel;
    }

    public final ReadSection copy(ReadMetadataResponseModel read, String orderLabel) {
        read.getClass();
        return new ReadSection(read, orderLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadSection)) {
            return false;
        }
        ReadSection readSection = (ReadSection) other;
        if (m.c(this.read, readSection.read) && m.c(this.orderLabel, readSection.orderLabel)) {
            return true;
        }
        return false;
    }

    public final String getOrderLabel() {
        return this.orderLabel;
    }

    public final ReadMetadataResponseModel getRead() {
        return this.read;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.read.hashCode() * 31;
        String str = this.orderLabel;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "ReadSection(read=" + this.read + ", orderLabel=" + this.orderLabel + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ReadSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ReadSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ReadSection$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getOrderLabel$annotations() {
    }

    public static /* synthetic */ void getRead$annotations() {
    }

    public ReadSection(ReadMetadataResponseModel readMetadataResponseModel, String str) {
        readMetadataResponseModel.getClass();
        this.read = readMetadataResponseModel;
        this.orderLabel = str;
    }
}
