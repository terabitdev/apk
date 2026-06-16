package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import tr.b;
import ur.c1;
import ur.g1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J4\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\u0017¨\u0006-"}, d2 = {"Lio/elevenlabs/data/model/ReadLegalTerms;", "", "", "terms", "startDate", "endDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/ReadLegalTerms;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/ReadLegalTerms;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTerms", "getTerms$annotations", "()V", "getStartDate", "getStartDate$annotations", "getEndDate", "getEndDate$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ReadLegalTerms {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String endDate;
    private final String startDate;
    private final String terms;

    public /* synthetic */ ReadLegalTerms(int i10, String str, String str2, String str3, c1 c1Var) {
        if ((i10 & 1) == 0) {
            this.terms = null;
        } else {
            this.terms = str;
        }
        if ((i10 & 2) == 0) {
            this.startDate = null;
        } else {
            this.startDate = str2;
        }
        if ((i10 & 4) == 0) {
            this.endDate = null;
        } else {
            this.endDate = str3;
        }
    }

    public static /* synthetic */ ReadLegalTerms copy$default(ReadLegalTerms readLegalTerms, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = readLegalTerms.terms;
        }
        if ((i10 & 2) != 0) {
            str2 = readLegalTerms.startDate;
        }
        if ((i10 & 4) != 0) {
            str3 = readLegalTerms.endDate;
        }
        return readLegalTerms.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$data_release(ReadLegalTerms self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.terms != null) {
            output.o(serialDesc, 0, g1.f34588a, self.terms);
        }
        if (output.C(serialDesc) || self.startDate != null) {
            output.o(serialDesc, 1, g1.f34588a, self.startDate);
        }
        if (output.C(serialDesc) || self.endDate != null) {
            output.o(serialDesc, 2, g1.f34588a, self.endDate);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getTerms() {
        return this.terms;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    public final ReadLegalTerms copy(String terms, String startDate, String endDate) {
        return new ReadLegalTerms(terms, startDate, endDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadLegalTerms)) {
            return false;
        }
        ReadLegalTerms readLegalTerms = (ReadLegalTerms) other;
        if (m.c(this.terms, readLegalTerms.terms) && m.c(this.startDate, readLegalTerms.startDate) && m.c(this.endDate, readLegalTerms.endDate)) {
            return true;
        }
        return false;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getTerms() {
        return this.terms;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.terms;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.startDate;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.endDate;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return i12 + i10;
    }

    public String toString() {
        return f.l(this.endDate, Separators.RPAREN, f.s("ReadLegalTerms(terms=", this.terms, ", startDate=", this.startDate, ", endDate="));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/ReadLegalTerms$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/ReadLegalTerms;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ReadLegalTerms$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getEndDate$annotations() {
    }

    public static /* synthetic */ void getStartDate$annotations() {
    }

    public static /* synthetic */ void getTerms$annotations() {
    }

    public ReadLegalTerms() {
        this((String) null, (String) null, (String) null, 7, (kotlin.jvm.internal.f) null);
    }

    public ReadLegalTerms(String str, String str2, String str3) {
        this.terms = str;
        this.startDate = str2;
        this.endDate = str3;
    }

    public /* synthetic */ ReadLegalTerms(String str, String str2, String str3, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
