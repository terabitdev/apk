package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import tr.b;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0019R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b0\u0010)\u001a\u0004\b/\u0010\u0019¨\u00063"}, d2 = {"Lio/elevenlabs/data/model/ReaderOnboardingAnswerModel;", "", "", SubscriberAttributeKt.JSON_NAME_KEY, "title", "", "selected", ParameterNames.ICON, "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/ReaderOnboardingAnswerModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lio/elevenlabs/data/model/ReaderOnboardingAnswerModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getKey$annotations", "()V", "getTitle", "getTitle$annotations", "Z", "getSelected", "getSelected$annotations", "getIcon", "getIcon$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ReaderOnboardingAnswerModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String icon;
    private final String key;
    private final boolean selected;
    private final String title;

    public /* synthetic */ ReaderOnboardingAnswerModel(int i10, String str, String str2, boolean z6, String str3, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.key = str;
            this.title = str2;
            this.selected = z6;
            if ((i10 & 8) == 0) {
                this.icon = null;
                return;
            } else {
                this.icon = str3;
                return;
            }
        }
        t0.j(i10, 7, ReaderOnboardingAnswerModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ ReaderOnboardingAnswerModel copy$default(ReaderOnboardingAnswerModel readerOnboardingAnswerModel, String str, String str2, boolean z6, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = readerOnboardingAnswerModel.key;
        }
        if ((i10 & 2) != 0) {
            str2 = readerOnboardingAnswerModel.title;
        }
        if ((i10 & 4) != 0) {
            z6 = readerOnboardingAnswerModel.selected;
        }
        if ((i10 & 8) != 0) {
            str3 = readerOnboardingAnswerModel.icon;
        }
        return readerOnboardingAnswerModel.copy(str, str2, z6, str3);
    }

    public static final /* synthetic */ void write$Self$data_release(ReaderOnboardingAnswerModel self, b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.key);
        output.V(serialDesc, 1, self.title);
        output.T(serialDesc, 2, self.selected);
        if (output.C(serialDesc) || self.icon != null) {
            output.o(serialDesc, 3, g1.f34588a, self.icon);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final ReaderOnboardingAnswerModel copy(String key, String title, boolean selected, String icon) {
        key.getClass();
        title.getClass();
        return new ReaderOnboardingAnswerModel(key, title, selected, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReaderOnboardingAnswerModel)) {
            return false;
        }
        ReaderOnboardingAnswerModel readerOnboardingAnswerModel = (ReaderOnboardingAnswerModel) other;
        if (m.c(this.key, readerOnboardingAnswerModel.key) && m.c(this.title, readerOnboardingAnswerModel.title) && this.selected == readerOnboardingAnswerModel.selected && m.c(this.icon, readerOnboardingAnswerModel.icon)) {
            return true;
        }
        return false;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int f10 = com.google.android.gms.internal.play_billing.b.f(c.c(this.key.hashCode() * 31, 31, this.title), 31, this.selected);
        String str = this.icon;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return f10 + hashCode;
    }

    public String toString() {
        String str = this.key;
        String str2 = this.title;
        boolean z6 = this.selected;
        String str3 = this.icon;
        StringBuilder s10 = f.s("ReaderOnboardingAnswerModel(key=", str, ", title=", str2, ", selected=");
        s10.append(z6);
        s10.append(", icon=");
        s10.append(str3);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/ReaderOnboardingAnswerModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/ReaderOnboardingAnswerModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ReaderOnboardingAnswerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getIcon$annotations() {
    }

    public static /* synthetic */ void getKey$annotations() {
    }

    public static /* synthetic */ void getSelected$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public ReaderOnboardingAnswerModel(String str, String str2, boolean z6, String str3) {
        str.getClass();
        str2.getClass();
        this.key = str;
        this.title = str2;
        this.selected = z6;
        this.icon = str3;
    }

    public /* synthetic */ ReaderOnboardingAnswerModel(String str, String str2, boolean z6, String str3, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, z6, (i10 & 8) != 0 ? null : str3);
    }
}
