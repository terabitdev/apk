package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import tr.b;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u0000 72\u00020\u0001:\u0003897BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJL\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00104\u0012\u0004\b6\u0010-\u001a\u0004\b5\u0010\u001f¨\u0006:"}, d2 = {"Lio/elevenlabs/data/model/BrowserExtensionConfig;", "", "", "autoImportEpub", "autoImportPdf", "autoImportTxt", "autoCategorize", "Lio/elevenlabs/data/model/BrowserExtensionConfig$ReviewPromptStatus;", "reviewPromptStatus", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/elevenlabs/data/model/BrowserExtensionConfig$ReviewPromptStatus;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/elevenlabs/data/model/BrowserExtensionConfig$ReviewPromptStatus;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/BrowserExtensionConfig;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "component5", "()Lio/elevenlabs/data/model/BrowserExtensionConfig$ReviewPromptStatus;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/elevenlabs/data/model/BrowserExtensionConfig$ReviewPromptStatus;)Lio/elevenlabs/data/model/BrowserExtensionConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAutoImportEpub", "getAutoImportEpub$annotations", "()V", "getAutoImportPdf", "getAutoImportPdf$annotations", "getAutoImportTxt", "getAutoImportTxt$annotations", "getAutoCategorize", "getAutoCategorize$annotations", "Lio/elevenlabs/data/model/BrowserExtensionConfig$ReviewPromptStatus;", "getReviewPromptStatus", "getReviewPromptStatus$annotations", "Companion", "ReviewPromptStatus", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class BrowserExtensionConfig {
    private final Boolean autoCategorize;
    private final Boolean autoImportEpub;
    private final Boolean autoImportPdf;
    private final Boolean autoImportTxt;
    private final ReviewPromptStatus reviewPromptStatus;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {null, null, null, null, sn.a.d(i.f31597b, new io.elevenlabs.data.database.entities.reads.a(8))};

    public /* synthetic */ BrowserExtensionConfig(int i10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, ReviewPromptStatus reviewPromptStatus, c1 c1Var) {
        this.autoImportEpub = (i10 & 1) == 0 ? Boolean.TRUE : bool;
        if ((i10 & 2) == 0) {
            this.autoImportPdf = Boolean.FALSE;
        } else {
            this.autoImportPdf = bool2;
        }
        if ((i10 & 4) == 0) {
            this.autoImportTxt = Boolean.FALSE;
        } else {
            this.autoImportTxt = bool3;
        }
        if ((i10 & 8) == 0) {
            this.autoCategorize = Boolean.TRUE;
        } else {
            this.autoCategorize = bool4;
        }
        if ((i10 & 16) == 0) {
            this.reviewPromptStatus = null;
        } else {
            this.reviewPromptStatus = reviewPromptStatus;
        }
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ReviewPromptStatus.INSTANCE.serializer();
    }

    public static /* synthetic */ BrowserExtensionConfig copy$default(BrowserExtensionConfig browserExtensionConfig, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, ReviewPromptStatus reviewPromptStatus, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = browserExtensionConfig.autoImportEpub;
        }
        if ((i10 & 2) != 0) {
            bool2 = browserExtensionConfig.autoImportPdf;
        }
        if ((i10 & 4) != 0) {
            bool3 = browserExtensionConfig.autoImportTxt;
        }
        if ((i10 & 8) != 0) {
            bool4 = browserExtensionConfig.autoCategorize;
        }
        if ((i10 & 16) != 0) {
            reviewPromptStatus = browserExtensionConfig.reviewPromptStatus;
        }
        ReviewPromptStatus reviewPromptStatus2 = reviewPromptStatus;
        Boolean bool5 = bool3;
        return browserExtensionConfig.copy(bool, bool2, bool5, bool4, reviewPromptStatus2);
    }

    public static final /* synthetic */ void write$Self$data_release(BrowserExtensionConfig self, b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        if (output.C(serialDesc) || !m.c(self.autoImportEpub, Boolean.TRUE)) {
            output.o(serialDesc, 0, ur.g.f34583a, self.autoImportEpub);
        }
        if (output.C(serialDesc) || !m.c(self.autoImportPdf, Boolean.FALSE)) {
            output.o(serialDesc, 1, ur.g.f34583a, self.autoImportPdf);
        }
        if (output.C(serialDesc) || !m.c(self.autoImportTxt, Boolean.FALSE)) {
            output.o(serialDesc, 2, ur.g.f34583a, self.autoImportTxt);
        }
        if (output.C(serialDesc) || !m.c(self.autoCategorize, Boolean.TRUE)) {
            output.o(serialDesc, 3, ur.g.f34583a, self.autoCategorize);
        }
        if (output.C(serialDesc) || self.reviewPromptStatus != null) {
            output.o(serialDesc, 4, (KSerializer) hVarArr[4].getValue(), self.reviewPromptStatus);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getAutoImportEpub() {
        return this.autoImportEpub;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getAutoImportPdf() {
        return this.autoImportPdf;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getAutoImportTxt() {
        return this.autoImportTxt;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getAutoCategorize() {
        return this.autoCategorize;
    }

    /* renamed from: component5, reason: from getter */
    public final ReviewPromptStatus getReviewPromptStatus() {
        return this.reviewPromptStatus;
    }

    public final BrowserExtensionConfig copy(Boolean autoImportEpub, Boolean autoImportPdf, Boolean autoImportTxt, Boolean autoCategorize, ReviewPromptStatus reviewPromptStatus) {
        return new BrowserExtensionConfig(autoImportEpub, autoImportPdf, autoImportTxt, autoCategorize, reviewPromptStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrowserExtensionConfig)) {
            return false;
        }
        BrowserExtensionConfig browserExtensionConfig = (BrowserExtensionConfig) other;
        if (m.c(this.autoImportEpub, browserExtensionConfig.autoImportEpub) && m.c(this.autoImportPdf, browserExtensionConfig.autoImportPdf) && m.c(this.autoImportTxt, browserExtensionConfig.autoImportTxt) && m.c(this.autoCategorize, browserExtensionConfig.autoCategorize) && this.reviewPromptStatus == browserExtensionConfig.reviewPromptStatus) {
            return true;
        }
        return false;
    }

    public final Boolean getAutoCategorize() {
        return this.autoCategorize;
    }

    public final Boolean getAutoImportEpub() {
        return this.autoImportEpub;
    }

    public final Boolean getAutoImportPdf() {
        return this.autoImportPdf;
    }

    public final Boolean getAutoImportTxt() {
        return this.autoImportTxt;
    }

    public final ReviewPromptStatus getReviewPromptStatus() {
        return this.reviewPromptStatus;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Boolean bool = this.autoImportEpub;
        int i10 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i11 = hashCode * 31;
        Boolean bool2 = this.autoImportPdf;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Boolean bool3 = this.autoImportTxt;
        if (bool3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Boolean bool4 = this.autoCategorize;
        if (bool4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool4.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        ReviewPromptStatus reviewPromptStatus = this.reviewPromptStatus;
        if (reviewPromptStatus != null) {
            i10 = reviewPromptStatus.hashCode();
        }
        return i14 + i10;
    }

    public String toString() {
        return "BrowserExtensionConfig(autoImportEpub=" + this.autoImportEpub + ", autoImportPdf=" + this.autoImportPdf + ", autoImportTxt=" + this.autoImportTxt + ", autoCategorize=" + this.autoCategorize + ", reviewPromptStatus=" + this.reviewPromptStatus + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/data/model/BrowserExtensionConfig$ReviewPromptStatus;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DISMISSED", "REVIEWED", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public static final class ReviewPromptStatus extends Enum<ReviewPromptStatus> {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ ReviewPromptStatus[] $VALUES;
        private static final h $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ReviewPromptStatus DISMISSED = new ReviewPromptStatus("DISMISSED", 0, "dismissed");
        public static final ReviewPromptStatus REVIEWED = new ReviewPromptStatus("REVIEWED", 1, "reviewed");
        private final String value;

        private static final /* synthetic */ ReviewPromptStatus[] $values() {
            return new ReviewPromptStatus[]{DISMISSED, REVIEWED};
        }

        static {
            ReviewPromptStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = rd.c1.q($values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = sn.a.d(i.f31597b, new io.elevenlabs.data.database.entities.reads.a(9));
        }

        private ReviewPromptStatus(String str, int i10, String str2) {
            super(str, i10);
            this.value = str2;
        }

        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return t0.e("io.elevenlabs.data.model.BrowserExtensionConfig.ReviewPromptStatus", values(), new String[]{"dismissed", "reviewed"}, new Annotation[][]{null, null});
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static ReviewPromptStatus valueOf(String str) {
            return (ReviewPromptStatus) Enum.valueOf(ReviewPromptStatus.class, str);
        }

        public static ReviewPromptStatus[] values() {
            return (ReviewPromptStatus[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/BrowserExtensionConfig$ReviewPromptStatus$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/BrowserExtensionConfig$ReviewPromptStatus;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) ReviewPromptStatus.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/BrowserExtensionConfig$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/BrowserExtensionConfig;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return BrowserExtensionConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAutoCategorize$annotations() {
    }

    public static /* synthetic */ void getAutoImportEpub$annotations() {
    }

    public static /* synthetic */ void getAutoImportPdf$annotations() {
    }

    public static /* synthetic */ void getAutoImportTxt$annotations() {
    }

    public static /* synthetic */ void getReviewPromptStatus$annotations() {
    }

    public BrowserExtensionConfig() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (ReviewPromptStatus) null, 31, (f) null);
    }

    public BrowserExtensionConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, ReviewPromptStatus reviewPromptStatus) {
        this.autoImportEpub = bool;
        this.autoImportPdf = bool2;
        this.autoImportTxt = bool3;
        this.autoCategorize = bool4;
        this.reviewPromptStatus = reviewPromptStatus;
    }

    public /* synthetic */ BrowserExtensionConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, ReviewPromptStatus reviewPromptStatus, int i10, f fVar) {
        this((i10 & 1) != 0 ? Boolean.TRUE : bool, (i10 & 2) != 0 ? Boolean.FALSE : bool2, (i10 & 4) != 0 ? Boolean.FALSE : bool3, (i10 & 8) != 0 ? Boolean.TRUE : bool4, (i10 & 16) != 0 ? null : reviewPromptStatus);
    }
}
