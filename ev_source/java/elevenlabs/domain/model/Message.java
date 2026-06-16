package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import ib.i;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/domain/model/Message;", "", "uid", "", "title", "textMarkdown", "subtitle", "button", "Lio/elevenlabs/domain/model/ButtonData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/ButtonData;)V", "getUid", "()Ljava/lang/String;", "getTitle", "getTextMarkdown", "getSubtitle", "getButton", "()Lio/elevenlabs/domain/model/ButtonData;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class Message {
    private final ButtonData button;
    private final String subtitle;
    private final String textMarkdown;
    private final String title;
    private final String uid;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Message(String str, String str2, String str3, String str4, ButtonData buttonData, int i10, f fVar) {
        this(str, str2, str3, str4, r7);
        ButtonData buttonData2;
        str4 = (i10 & 8) != 0 ? null : str4;
        if ((i10 & 16) != 0) {
            buttonData2 = null;
        } else {
            buttonData2 = buttonData;
        }
    }

    public static /* synthetic */ Message copy$default(Message message, String str, String str2, String str3, String str4, ButtonData buttonData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = message.uid;
        }
        if ((i10 & 2) != 0) {
            str2 = message.title;
        }
        if ((i10 & 4) != 0) {
            str3 = message.textMarkdown;
        }
        if ((i10 & 8) != 0) {
            str4 = message.subtitle;
        }
        if ((i10 & 16) != 0) {
            buttonData = message.button;
        }
        ButtonData buttonData2 = buttonData;
        String str5 = str3;
        return message.copy(str, str2, str5, str4, buttonData2);
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
    public final ButtonData getButton() {
        return this.button;
    }

    public final Message copy(String uid, String title, String textMarkdown, String subtitle, ButtonData button) {
        uid.getClass();
        title.getClass();
        textMarkdown.getClass();
        return new Message(uid, title, textMarkdown, subtitle, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Message)) {
            return false;
        }
        Message message = (Message) other;
        if (m.c(this.uid, message.uid) && m.c(this.title, message.title) && m.c(this.textMarkdown, message.textMarkdown) && m.c(this.subtitle, message.subtitle) && m.c(this.button, message.button)) {
            return true;
        }
        return false;
    }

    public final ButtonData getButton() {
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
        int c5 = c.c(c.c(this.uid.hashCode() * 31, 31, this.title), 31, this.textMarkdown);
        String str = this.subtitle;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        ButtonData buttonData = this.button;
        if (buttonData != null) {
            i10 = buttonData.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        String str = this.uid;
        String str2 = this.title;
        String str3 = this.textMarkdown;
        String str4 = this.subtitle;
        ButtonData buttonData = this.button;
        StringBuilder s10 = defpackage.f.s("Message(uid=", str, ", title=", str2, ", textMarkdown=");
        defpackage.f.x(s10, str3, ", subtitle=", str4, ", button=");
        s10.append(buttonData);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    public Message(String str, String str2, String str3, String str4, ButtonData buttonData) {
        i.s(str, str2, str3);
        this.uid = str;
        this.title = str2;
        this.textMarkdown = str3;
        this.subtitle = str4;
        this.button = buttonData;
    }
}
