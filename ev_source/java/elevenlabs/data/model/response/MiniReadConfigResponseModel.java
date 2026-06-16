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

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b#\u0010$\u001a\u0004\b\u0003\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b'\u0010$\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lio/elevenlabs/data/model/response/MiniReadConfigResponseModel;", "", "", "isMiniRead", "", "parentId", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/MiniReadConfigResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lio/elevenlabs/data/model/response/MiniReadConfigResponseModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "isMiniRead$annotations", "()V", "Ljava/lang/String;", "getParentId", "getParentId$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class MiniReadConfigResponseModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean isMiniRead;
    private final String parentId;

    public /* synthetic */ MiniReadConfigResponseModel(int i10, Boolean bool, String str, c1 c1Var) {
        this.isMiniRead = (i10 & 1) == 0 ? Boolean.FALSE : bool;
        if ((i10 & 2) == 0) {
            this.parentId = null;
        } else {
            this.parentId = str;
        }
    }

    public static /* synthetic */ MiniReadConfigResponseModel copy$default(MiniReadConfigResponseModel miniReadConfigResponseModel, Boolean bool, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = miniReadConfigResponseModel.isMiniRead;
        }
        if ((i10 & 2) != 0) {
            str = miniReadConfigResponseModel.parentId;
        }
        return miniReadConfigResponseModel.copy(bool, str);
    }

    public static final /* synthetic */ void write$Self$data_release(MiniReadConfigResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || !m.c(self.isMiniRead, Boolean.FALSE)) {
            output.o(serialDesc, 0, ur.g.f34583a, self.isMiniRead);
        }
        if (output.C(serialDesc) || self.parentId != null) {
            output.o(serialDesc, 1, g1.f34588a, self.parentId);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsMiniRead() {
        return this.isMiniRead;
    }

    /* renamed from: component2, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    public final MiniReadConfigResponseModel copy(Boolean isMiniRead, String parentId) {
        return new MiniReadConfigResponseModel(isMiniRead, parentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniReadConfigResponseModel)) {
            return false;
        }
        MiniReadConfigResponseModel miniReadConfigResponseModel = (MiniReadConfigResponseModel) other;
        if (m.c(this.isMiniRead, miniReadConfigResponseModel.isMiniRead) && m.c(this.parentId, miniReadConfigResponseModel.parentId)) {
            return true;
        }
        return false;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public int hashCode() {
        int hashCode;
        Boolean bool = this.isMiniRead;
        int i10 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.parentId;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }

    public final Boolean isMiniRead() {
        return this.isMiniRead;
    }

    public String toString() {
        return "MiniReadConfigResponseModel(isMiniRead=" + this.isMiniRead + ", parentId=" + this.parentId + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/MiniReadConfigResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/MiniReadConfigResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return MiniReadConfigResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getParentId$annotations() {
    }

    public static /* synthetic */ void isMiniRead$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MiniReadConfigResponseModel() {
        this((Boolean) null, (String) (0 == true ? 1 : 0), 3, (f) (0 == true ? 1 : 0));
    }

    public MiniReadConfigResponseModel(Boolean bool, String str) {
        this.isMiniRead = bool;
        this.parentId = str;
    }

    public /* synthetic */ MiniReadConfigResponseModel(Boolean bool, String str, int i10, f fVar) {
        this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? null : str);
    }
}
