package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u001d¨\u00062"}, d2 = {"Lio/elevenlabs/data/model/response/AccountMetadataResponseModel;", "", "", "agreesToProductUpdates", "Lio/elevenlabs/data/model/response/GeoLocationResponseModel;", "geoLocation", "", DiagnosticsEntry.NAME_KEY, "<init>", "(ZLio/elevenlabs/data/model/response/GeoLocationResponseModel;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(IZLio/elevenlabs/data/model/response/GeoLocationResponseModel;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/AccountMetadataResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Lio/elevenlabs/data/model/response/GeoLocationResponseModel;", "component3", "()Ljava/lang/String;", "copy", "(ZLio/elevenlabs/data/model/response/GeoLocationResponseModel;Ljava/lang/String;)Lio/elevenlabs/data/model/response/AccountMetadataResponseModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getAgreesToProductUpdates", "getAgreesToProductUpdates$annotations", "()V", "Lio/elevenlabs/data/model/response/GeoLocationResponseModel;", "getGeoLocation", "getGeoLocation$annotations", "Ljava/lang/String;", "getName", "getName$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class AccountMetadataResponseModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean agreesToProductUpdates;
    private final GeoLocationResponseModel geoLocation;
    private final String name;

    public /* synthetic */ AccountMetadataResponseModel(int i10, boolean z6, GeoLocationResponseModel geoLocationResponseModel, String str, c1 c1Var) {
        if (1 == (i10 & 1)) {
            this.agreesToProductUpdates = z6;
            if ((i10 & 2) == 0) {
                this.geoLocation = null;
            } else {
                this.geoLocation = geoLocationResponseModel;
            }
            if ((i10 & 4) == 0) {
                this.name = null;
                return;
            } else {
                this.name = str;
                return;
            }
        }
        t0.j(i10, 1, AccountMetadataResponseModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ AccountMetadataResponseModel copy$default(AccountMetadataResponseModel accountMetadataResponseModel, boolean z6, GeoLocationResponseModel geoLocationResponseModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = accountMetadataResponseModel.agreesToProductUpdates;
        }
        if ((i10 & 2) != 0) {
            geoLocationResponseModel = accountMetadataResponseModel.geoLocation;
        }
        if ((i10 & 4) != 0) {
            str = accountMetadataResponseModel.name;
        }
        return accountMetadataResponseModel.copy(z6, geoLocationResponseModel, str);
    }

    public static final /* synthetic */ void write$Self$data_release(AccountMetadataResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        output.T(serialDesc, 0, self.agreesToProductUpdates);
        if (output.C(serialDesc) || self.geoLocation != null) {
            output.o(serialDesc, 1, GeoLocationResponseModel$$serializer.INSTANCE, self.geoLocation);
        }
        if (output.C(serialDesc) || self.name != null) {
            output.o(serialDesc, 2, g1.f34588a, self.name);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAgreesToProductUpdates() {
        return this.agreesToProductUpdates;
    }

    /* renamed from: component2, reason: from getter */
    public final GeoLocationResponseModel getGeoLocation() {
        return this.geoLocation;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final AccountMetadataResponseModel copy(boolean agreesToProductUpdates, GeoLocationResponseModel geoLocation, String name) {
        return new AccountMetadataResponseModel(agreesToProductUpdates, geoLocation, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountMetadataResponseModel)) {
            return false;
        }
        AccountMetadataResponseModel accountMetadataResponseModel = (AccountMetadataResponseModel) other;
        if (this.agreesToProductUpdates == accountMetadataResponseModel.agreesToProductUpdates && m.c(this.geoLocation, accountMetadataResponseModel.geoLocation) && m.c(this.name, accountMetadataResponseModel.name)) {
            return true;
        }
        return false;
    }

    public final boolean getAgreesToProductUpdates() {
        return this.agreesToProductUpdates;
    }

    public final GeoLocationResponseModel getGeoLocation() {
        return this.geoLocation;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.agreesToProductUpdates) * 31;
        GeoLocationResponseModel geoLocationResponseModel = this.geoLocation;
        int i10 = 0;
        if (geoLocationResponseModel == null) {
            hashCode = 0;
        } else {
            hashCode = geoLocationResponseModel.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        String str = this.name;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        boolean z6 = this.agreesToProductUpdates;
        GeoLocationResponseModel geoLocationResponseModel = this.geoLocation;
        String str = this.name;
        StringBuilder sb = new StringBuilder("AccountMetadataResponseModel(agreesToProductUpdates=");
        sb.append(z6);
        sb.append(", geoLocation=");
        sb.append(geoLocationResponseModel);
        sb.append(", name=");
        return f.l(str, Separators.RPAREN, sb);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/AccountMetadataResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/AccountMetadataResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return AccountMetadataResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAgreesToProductUpdates$annotations() {
    }

    public static /* synthetic */ void getGeoLocation$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public AccountMetadataResponseModel(boolean z6, GeoLocationResponseModel geoLocationResponseModel, String str) {
        this.agreesToProductUpdates = z6;
        this.geoLocation = geoLocationResponseModel;
        this.name = str;
    }

    public /* synthetic */ AccountMetadataResponseModel(boolean z6, GeoLocationResponseModel geoLocationResponseModel, String str, int i10, kotlin.jvm.internal.f fVar) {
        this(z6, (i10 & 2) != 0 ? null : geoLocationResponseModel, (i10 & 4) != 0 ? null : str);
    }
}
