package io.elevenlabs.domain.services;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import defpackage.f;
import ir.n1;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/SupportToolEvents;", "", "", "toolName", "Lsn/z;", "requestShowCustomerCenter", "(Ljava/lang/String;)V", "Lir/n1;", "Lio/elevenlabs/domain/services/SupportToolEvents$Event;", "getEvents", "()Lir/n1;", "events", SIPHeaderNames.EVENT, "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface SupportToolEvents {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/SupportToolEvents$Event;", "", "toolName", "", "getToolName", "()Ljava/lang/String;", "ShowCustomerCenter", "Lio/elevenlabs/domain/services/SupportToolEvents$Event$ShowCustomerCenter;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public interface Event {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/services/SupportToolEvents$Event$ShowCustomerCenter;", "Lio/elevenlabs/domain/services/SupportToolEvents$Event;", "toolName", "", "<init>", "(Ljava/lang/String;)V", "getToolName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ShowCustomerCenter implements Event {
            private final String toolName;

            public ShowCustomerCenter(String str) {
                str.getClass();
                this.toolName = str;
            }

            public static /* synthetic */ ShowCustomerCenter copy$default(ShowCustomerCenter showCustomerCenter, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = showCustomerCenter.toolName;
                }
                return showCustomerCenter.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getToolName() {
                return this.toolName;
            }

            public final ShowCustomerCenter copy(String toolName) {
                toolName.getClass();
                return new ShowCustomerCenter(toolName);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof ShowCustomerCenter) && m.c(this.toolName, ((ShowCustomerCenter) other).toolName)) {
                    return true;
                }
                return false;
            }

            @Override // io.elevenlabs.domain.services.SupportToolEvents.Event
            public String getToolName() {
                return this.toolName;
            }

            public int hashCode() {
                return this.toolName.hashCode();
            }

            public String toString() {
                return f.C("ShowCustomerCenter(toolName=", this.toolName, Separators.RPAREN);
            }
        }

        String getToolName();
    }

    n1 getEvents();

    void requestShowCustomerCenter(String toolName);
}
