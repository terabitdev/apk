package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.g1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJF\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b)\u0010*\u001a\u0004\b\u0003\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010\u001cR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010\u001f¨\u00065"}, d2 = {"Lio/elevenlabs/data/model/response/SampleConfigResponseModel;", "", "", "isSample", "", "parentId", "parentType", "", "chapterIds", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/SampleConfigResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/SampleConfigResponseModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "isSample$annotations", "()V", "Ljava/lang/String;", "getParentId", "getParentId$annotations", "getParentType", "getParentType$annotations", "Ljava/util/List;", "getChapterIds", "getChapterIds$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class SampleConfigResponseModel {
    private final List<String> chapterIds;
    private final Boolean isSample;
    private final String parentId;
    private final String parentType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {null, null, null, sn.a.d(i.f31597b, new d(14))};

    public /* synthetic */ SampleConfigResponseModel(int i10, Boolean bool, String str, String str2, List list, c1 c1Var) {
        this.isSample = (i10 & 1) == 0 ? Boolean.FALSE : bool;
        if ((i10 & 2) == 0) {
            this.parentId = null;
        } else {
            this.parentId = str;
        }
        if ((i10 & 4) == 0) {
            this.parentType = null;
        } else {
            this.parentType = str2;
        }
        if ((i10 & 8) == 0) {
            this.chapterIds = null;
        } else {
            this.chapterIds = list;
        }
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ur.d(g1.f34588a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SampleConfigResponseModel copy$default(SampleConfigResponseModel sampleConfigResponseModel, Boolean bool, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = sampleConfigResponseModel.isSample;
        }
        if ((i10 & 2) != 0) {
            str = sampleConfigResponseModel.parentId;
        }
        if ((i10 & 4) != 0) {
            str2 = sampleConfigResponseModel.parentType;
        }
        if ((i10 & 8) != 0) {
            list = sampleConfigResponseModel.chapterIds;
        }
        return sampleConfigResponseModel.copy(bool, str, str2, list);
    }

    public static final /* synthetic */ void write$Self$data_release(SampleConfigResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        if (output.C(serialDesc) || !m.c(self.isSample, Boolean.FALSE)) {
            output.o(serialDesc, 0, ur.g.f34583a, self.isSample);
        }
        if (output.C(serialDesc) || self.parentId != null) {
            output.o(serialDesc, 1, g1.f34588a, self.parentId);
        }
        if (output.C(serialDesc) || self.parentType != null) {
            output.o(serialDesc, 2, g1.f34588a, self.parentType);
        }
        if (output.C(serialDesc) || self.chapterIds != null) {
            output.o(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.chapterIds);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsSample() {
        return this.isSample;
    }

    /* renamed from: component2, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getParentType() {
        return this.parentType;
    }

    public final List<String> component4() {
        return this.chapterIds;
    }

    public final SampleConfigResponseModel copy(Boolean isSample, String parentId, String parentType, List<String> chapterIds) {
        return new SampleConfigResponseModel(isSample, parentId, parentType, chapterIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SampleConfigResponseModel)) {
            return false;
        }
        SampleConfigResponseModel sampleConfigResponseModel = (SampleConfigResponseModel) other;
        if (m.c(this.isSample, sampleConfigResponseModel.isSample) && m.c(this.parentId, sampleConfigResponseModel.parentId) && m.c(this.parentType, sampleConfigResponseModel.parentType) && m.c(this.chapterIds, sampleConfigResponseModel.chapterIds)) {
            return true;
        }
        return false;
    }

    public final List<String> getChapterIds() {
        return this.chapterIds;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getParentType() {
        return this.parentType;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Boolean bool = this.isSample;
        int i10 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.parentId;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str2 = this.parentType;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        List<String> list = this.chapterIds;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i13 + i10;
    }

    public final Boolean isSample() {
        return this.isSample;
    }

    public String toString() {
        return "SampleConfigResponseModel(isSample=" + this.isSample + ", parentId=" + this.parentId + ", parentType=" + this.parentType + ", chapterIds=" + this.chapterIds + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/SampleConfigResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/SampleConfigResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return SampleConfigResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getChapterIds$annotations() {
    }

    public static /* synthetic */ void getParentId$annotations() {
    }

    public static /* synthetic */ void getParentType$annotations() {
    }

    public static /* synthetic */ void isSample$annotations() {
    }

    public SampleConfigResponseModel() {
        this((Boolean) null, (String) null, (String) null, (List) null, 15, (f) null);
    }

    public SampleConfigResponseModel(Boolean bool, String str, String str2, List<String> list) {
        this.isSample = bool;
        this.parentId = str;
        this.parentType = str2;
        this.chapterIds = list;
    }

    public /* synthetic */ SampleConfigResponseModel(Boolean bool, String str, String str2, List list, int i10, f fVar) {
        this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : list);
    }
}
