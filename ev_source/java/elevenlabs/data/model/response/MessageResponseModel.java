package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import ib.i;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00103\u0012\u0004\b5\u0010,\u001a\u0004\b4\u0010\u001f¨\u00068"}, d2 = {"Lio/elevenlabs/data/model/response/MessageResponseModel;", "", "", "uid", "title", "textMarkdown", "subtitle", "Lio/elevenlabs/data/model/response/MessageButtonResponseModel;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/response/MessageButtonResponseModel;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/response/MessageButtonResponseModel;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/MessageResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lio/elevenlabs/data/model/response/MessageButtonResponseModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/response/MessageButtonResponseModel;)Lio/elevenlabs/data/model/response/MessageResponseModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUid", "getUid$annotations", "()V", "getTitle", "getTitle$annotations", "getTextMarkdown", "getTextMarkdown$annotations", "getSubtitle", "getSubtitle$annotations", "Lio/elevenlabs/data/model/response/MessageButtonResponseModel;", "getButton", "getButton$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class MessageResponseModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final MessageButtonResponseModel button;
    private final String subtitle;
    private final String textMarkdown;
    private final String title;
    private final String uid;

    public /* synthetic */ MessageResponseModel(int i10, String str, String str2, String str3, String str4, MessageButtonResponseModel messageButtonResponseModel, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.uid = str;
            this.title = str2;
            this.textMarkdown = str3;
            if ((i10 & 8) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str4;
            }
            if ((i10 & 16) == 0) {
                this.button = null;
                return;
            } else {
                this.button = messageButtonResponseModel;
                return;
            }
        }
        t0.j(i10, 7, MessageResponseModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ MessageResponseModel copy$default(MessageResponseModel messageResponseModel, String str, String str2, String str3, String str4, MessageButtonResponseModel messageButtonResponseModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = messageResponseModel.uid;
        }
        if ((i10 & 2) != 0) {
            str2 = messageResponseModel.title;
        }
        if ((i10 & 4) != 0) {
            str3 = messageResponseModel.textMarkdown;
        }
        if ((i10 & 8) != 0) {
            str4 = messageResponseModel.subtitle;
        }
        if ((i10 & 16) != 0) {
            messageButtonResponseModel = messageResponseModel.button;
        }
        MessageButtonResponseModel messageButtonResponseModel2 = messageButtonResponseModel;
        String str5 = str3;
        return messageResponseModel.copy(str, str2, str5, str4, messageButtonResponseModel2);
    }

    public static final /* synthetic */ void write$Self$data_release(MessageResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.uid);
        output.V(serialDesc, 1, self.title);
        output.V(serialDesc, 2, self.textMarkdown);
        if (output.C(serialDesc) || self.subtitle != null) {
            output.o(serialDesc, 3, g1.f34588a, self.subtitle);
        }
        if (output.C(serialDesc) || self.button != null) {
            output.o(serialDesc, 4, MessageButtonResponseModel$$serializer.INSTANCE, self.button);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTextMarkdown() {
        return this.textMarkdown;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final MessageButtonResponseModel getButton() {
        return this.button;
    }

    public final MessageResponseModel copy(String uid, String title, String textMarkdown, String subtitle, MessageButtonResponseModel button) {
        uid.getClass();
        title.getClass();
        textMarkdown.getClass();
        return new MessageResponseModel(uid, title, textMarkdown, subtitle, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageResponseModel)) {
            return false;
        }
        MessageResponseModel messageResponseModel = (MessageResponseModel) other;
        if (m.c(this.uid, messageResponseModel.uid) && m.c(this.title, messageResponseModel.title) && m.c(this.textMarkdown, messageResponseModel.textMarkdown) && m.c(this.subtitle, messageResponseModel.subtitle) && m.c(this.button, messageResponseModel.button)) {
            return true;
        }
        return false;
    }

    public final MessageButtonResponseModel getButton() {
        return this.button;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTextMarkdown() {
        return this.textMarkdown;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        int hashCode;
        int c5 = j0.c.c(j0.c.c(this.uid.hashCode() * 31, 31, this.title), 31, this.textMarkdown);
        String str = this.subtitle;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        MessageButtonResponseModel messageButtonResponseModel = this.button;
        if (messageButtonResponseModel != null) {
            i10 = messageButtonResponseModel.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        String str = this.uid;
        String str2 = this.title;
        String str3 = this.textMarkdown;
        String str4 = this.subtitle;
        MessageButtonResponseModel messageButtonResponseModel = this.button;
        StringBuilder s10 = f.s("MessageResponseModel(uid=", str, ", title=", str2, ", textMarkdown=");
        f.x(s10, str3, ", subtitle=", str4, ", button=");
        s10.append(messageButtonResponseModel);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/MessageResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/MessageResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return MessageResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getButton$annotations() {
    }

    public static /* synthetic */ void getSubtitle$annotations() {
    }

    public static /* synthetic */ void getTextMarkdown$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getUid$annotations() {
    }

    public MessageResponseModel(String str, String str2, String str3, String str4, MessageButtonResponseModel messageButtonResponseModel) {
        i.s(str, str2, str3);
        this.uid = str;
        this.title = str2;
        this.textMarkdown = str3;
        this.subtitle = str4;
        this.button = messageButtonResponseModel;
    }

    public /* synthetic */ MessageResponseModel(String str, String str2, String str3, String str4, MessageButtonResponseModel messageButtonResponseModel, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : messageButtonResponseModel);
    }
}
