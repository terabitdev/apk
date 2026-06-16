package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u0018R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u0018¨\u00061"}, d2 = {"Lio/elevenlabs/data/model/response/NotificationPrimerResponseModel;", "", "", "exampleNotificationTitle", "exampleNotificationSubtitle", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/NotificationPrimerResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/NotificationPrimerResponseModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExampleNotificationTitle", "getExampleNotificationTitle$annotations", "()V", "getExampleNotificationSubtitle", "getExampleNotificationSubtitle$annotations", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class NotificationPrimerResponseModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String exampleNotificationSubtitle;
    private final String exampleNotificationTitle;
    private final String subtitle;
    private final String title;

    public /* synthetic */ NotificationPrimerResponseModel(int i10, String str, String str2, String str3, String str4, c1 c1Var) {
        if (15 == (i10 & 15)) {
            this.exampleNotificationTitle = str;
            this.exampleNotificationSubtitle = str2;
            this.title = str3;
            this.subtitle = str4;
            return;
        }
        t0.j(i10, 15, NotificationPrimerResponseModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ NotificationPrimerResponseModel copy$default(NotificationPrimerResponseModel notificationPrimerResponseModel, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notificationPrimerResponseModel.exampleNotificationTitle;
        }
        if ((i10 & 2) != 0) {
            str2 = notificationPrimerResponseModel.exampleNotificationSubtitle;
        }
        if ((i10 & 4) != 0) {
            str3 = notificationPrimerResponseModel.title;
        }
        if ((i10 & 8) != 0) {
            str4 = notificationPrimerResponseModel.subtitle;
        }
        return notificationPrimerResponseModel.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$data_release(NotificationPrimerResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.exampleNotificationTitle);
        output.V(serialDesc, 1, self.exampleNotificationSubtitle);
        output.V(serialDesc, 2, self.title);
        output.V(serialDesc, 3, self.subtitle);
    }

    /* renamed from: component1, reason: from getter */
    public final String getExampleNotificationTitle() {
        return this.exampleNotificationTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExampleNotificationSubtitle() {
        return this.exampleNotificationSubtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final NotificationPrimerResponseModel copy(String exampleNotificationTitle, String exampleNotificationSubtitle, String title, String subtitle) {
        exampleNotificationTitle.getClass();
        exampleNotificationSubtitle.getClass();
        title.getClass();
        subtitle.getClass();
        return new NotificationPrimerResponseModel(exampleNotificationTitle, exampleNotificationSubtitle, title, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationPrimerResponseModel)) {
            return false;
        }
        NotificationPrimerResponseModel notificationPrimerResponseModel = (NotificationPrimerResponseModel) other;
        if (m.c(this.exampleNotificationTitle, notificationPrimerResponseModel.exampleNotificationTitle) && m.c(this.exampleNotificationSubtitle, notificationPrimerResponseModel.exampleNotificationSubtitle) && m.c(this.title, notificationPrimerResponseModel.title) && m.c(this.subtitle, notificationPrimerResponseModel.subtitle)) {
            return true;
        }
        return false;
    }

    public final String getExampleNotificationSubtitle() {
        return this.exampleNotificationSubtitle;
    }

    public final String getExampleNotificationTitle() {
        return this.exampleNotificationTitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.subtitle.hashCode() + j0.c.c(j0.c.c(this.exampleNotificationTitle.hashCode() * 31, 31, this.exampleNotificationSubtitle), 31, this.title);
    }

    public String toString() {
        String str = this.exampleNotificationTitle;
        String str2 = this.exampleNotificationSubtitle;
        return f.n(f.s("NotificationPrimerResponseModel(exampleNotificationTitle=", str, ", exampleNotificationSubtitle=", str2, ", title="), this.title, ", subtitle=", this.subtitle, Separators.RPAREN);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/NotificationPrimerResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/NotificationPrimerResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return NotificationPrimerResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getExampleNotificationSubtitle$annotations() {
    }

    public static /* synthetic */ void getExampleNotificationTitle$annotations() {
    }

    public static /* synthetic */ void getSubtitle$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public NotificationPrimerResponseModel(String str, String str2, String str3, String str4) {
        j0.c.u(str, str2, str3, str4);
        this.exampleNotificationTitle = str;
        this.exampleNotificationSubtitle = str2;
        this.title = str3;
        this.subtitle = str4;
    }
}
