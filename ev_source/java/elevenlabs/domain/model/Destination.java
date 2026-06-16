package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.services.ProductsService;
import io.elevenlabs.domain.services.ReadsService;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/domain/model/Destination;", "", "<init>", "()V", "Authorized", "Lio/elevenlabs/domain/model/Destination$Authorized;", "Lio/elevenlabs/domain/model/Destination$Authorized$AddPronunciationScreen;", "Lio/elevenlabs/domain/model/Destination$Authorized$EditPronunciationScreen;", "Lio/elevenlabs/domain/model/Destination$Authorized$Library;", "Lio/elevenlabs/domain/model/Destination$Authorized$PronunciationsListScreen;", "Lio/elevenlabs/domain/model/Destination$Authorized$ReadDetails;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public abstract class Destination {
    public /* synthetic */ Destination(f fVar) {
        this();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lio/elevenlabs/domain/model/Destination$Authorized;", "Lio/elevenlabs/domain/model/Destination;", "<init>", "()V", "OfflineDownloadLimitReached", "Paywall", "ReadDetails", "Library", "AddPronunciationScreen", "EditPronunciationScreen", "PronunciationsListScreen", "Lio/elevenlabs/domain/model/Destination$Authorized$OfflineDownloadLimitReached;", "Lio/elevenlabs/domain/model/Destination$Authorized$Paywall;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static abstract class Authorized extends Destination {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/model/Destination$Authorized$AddPronunciationScreen;", "Lio/elevenlabs/domain/model/Destination;", "voiceId", "", "originalText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getVoiceId", "()Ljava/lang/String;", "getOriginalText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class AddPronunciationScreen extends Destination {
            private final String originalText;
            private final String voiceId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddPronunciationScreen(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.voiceId = str;
                this.originalText = str2;
            }

            public static /* synthetic */ AddPronunciationScreen copy$default(AddPronunciationScreen addPronunciationScreen, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = addPronunciationScreen.voiceId;
                }
                if ((i10 & 2) != 0) {
                    str2 = addPronunciationScreen.originalText;
                }
                return addPronunciationScreen.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getOriginalText() {
                return this.originalText;
            }

            public final AddPronunciationScreen copy(String voiceId, String originalText) {
                voiceId.getClass();
                originalText.getClass();
                return new AddPronunciationScreen(voiceId, originalText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddPronunciationScreen)) {
                    return false;
                }
                AddPronunciationScreen addPronunciationScreen = (AddPronunciationScreen) other;
                if (m.c(this.voiceId, addPronunciationScreen.voiceId) && m.c(this.originalText, addPronunciationScreen.originalText)) {
                    return true;
                }
                return false;
            }

            public final String getOriginalText() {
                return this.originalText;
            }

            public final String getVoiceId() {
                return this.voiceId;
            }

            public int hashCode() {
                return this.originalText.hashCode() + (this.voiceId.hashCode() * 31);
            }

            public String toString() {
                return h.c("AddPronunciationScreen(voiceId=", this.voiceId, ", originalText=", this.originalText, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/domain/model/Destination$Authorized$EditPronunciationScreen;", "Lio/elevenlabs/domain/model/Destination;", "voiceId", "", "pronunciationId", "originalText", "spokenText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getVoiceId", "()Ljava/lang/String;", "getPronunciationId", "getOriginalText", "getSpokenText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class EditPronunciationScreen extends Destination {
            private final String originalText;
            private final String pronunciationId;
            private final String spokenText;
            private final String voiceId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EditPronunciationScreen(String str, String str2, String str3, String str4) {
                super(null);
                c.u(str, str2, str3, str4);
                this.voiceId = str;
                this.pronunciationId = str2;
                this.originalText = str3;
                this.spokenText = str4;
            }

            public static /* synthetic */ EditPronunciationScreen copy$default(EditPronunciationScreen editPronunciationScreen, String str, String str2, String str3, String str4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = editPronunciationScreen.voiceId;
                }
                if ((i10 & 2) != 0) {
                    str2 = editPronunciationScreen.pronunciationId;
                }
                if ((i10 & 4) != 0) {
                    str3 = editPronunciationScreen.originalText;
                }
                if ((i10 & 8) != 0) {
                    str4 = editPronunciationScreen.spokenText;
                }
                return editPronunciationScreen.copy(str, str2, str3, str4);
            }

            /* renamed from: component1, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getPronunciationId() {
                return this.pronunciationId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getOriginalText() {
                return this.originalText;
            }

            /* renamed from: component4, reason: from getter */
            public final String getSpokenText() {
                return this.spokenText;
            }

            public final EditPronunciationScreen copy(String voiceId, String pronunciationId, String originalText, String spokenText) {
                voiceId.getClass();
                pronunciationId.getClass();
                originalText.getClass();
                spokenText.getClass();
                return new EditPronunciationScreen(voiceId, pronunciationId, originalText, spokenText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EditPronunciationScreen)) {
                    return false;
                }
                EditPronunciationScreen editPronunciationScreen = (EditPronunciationScreen) other;
                if (m.c(this.voiceId, editPronunciationScreen.voiceId) && m.c(this.pronunciationId, editPronunciationScreen.pronunciationId) && m.c(this.originalText, editPronunciationScreen.originalText) && m.c(this.spokenText, editPronunciationScreen.spokenText)) {
                    return true;
                }
                return false;
            }

            public final String getOriginalText() {
                return this.originalText;
            }

            public final String getPronunciationId() {
                return this.pronunciationId;
            }

            public final String getSpokenText() {
                return this.spokenText;
            }

            public final String getVoiceId() {
                return this.voiceId;
            }

            public int hashCode() {
                return this.spokenText.hashCode() + c.c(c.c(this.voiceId.hashCode() * 31, 31, this.pronunciationId), 31, this.originalText);
            }

            public String toString() {
                String str = this.voiceId;
                String str2 = this.pronunciationId;
                return defpackage.f.n(defpackage.f.s("EditPronunciationScreen(voiceId=", str, ", pronunciationId=", str2, ", originalText="), this.originalText, ", spokenText=", this.spokenText, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/model/Destination$Authorized$OfflineDownloadLimitReached;", "Lio/elevenlabs/domain/model/Destination$Authorized;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class OfflineDownloadLimitReached extends Authorized {
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OfflineDownloadLimitReached(String str) {
                super(null);
                str.getClass();
                this.message = str;
            }

            public static /* synthetic */ OfflineDownloadLimitReached copy$default(OfflineDownloadLimitReached offlineDownloadLimitReached, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = offlineDownloadLimitReached.message;
                }
                return offlineDownloadLimitReached.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final OfflineDownloadLimitReached copy(String message) {
                message.getClass();
                return new OfflineDownloadLimitReached(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof OfflineDownloadLimitReached) && m.c(this.message, ((OfflineDownloadLimitReached) other).message)) {
                    return true;
                }
                return false;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return defpackage.f.C("OfflineDownloadLimitReached(message=", this.message, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/model/Destination$Authorized$Paywall;", "Lio/elevenlabs/domain/model/Destination$Authorized;", "source", "Lio/elevenlabs/domain/services/ProductsService$PaywallSource;", "analyticsSource", "Lio/elevenlabs/domain/Analytics$Event$PaywallSource;", "<init>", "(Lio/elevenlabs/domain/services/ProductsService$PaywallSource;Lio/elevenlabs/domain/Analytics$Event$PaywallSource;)V", "getSource", "()Lio/elevenlabs/domain/services/ProductsService$PaywallSource;", "getAnalyticsSource", "()Lio/elevenlabs/domain/Analytics$Event$PaywallSource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class Paywall extends Authorized {
            private final Analytics.Event.PaywallSource analyticsSource;
            private final ProductsService.PaywallSource source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Paywall(ProductsService.PaywallSource paywallSource, Analytics.Event.PaywallSource paywallSource2) {
                super(null);
                paywallSource.getClass();
                paywallSource2.getClass();
                this.source = paywallSource;
                this.analyticsSource = paywallSource2;
            }

            public static /* synthetic */ Paywall copy$default(Paywall paywall, ProductsService.PaywallSource paywallSource, Analytics.Event.PaywallSource paywallSource2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    paywallSource = paywall.source;
                }
                if ((i10 & 2) != 0) {
                    paywallSource2 = paywall.analyticsSource;
                }
                return paywall.copy(paywallSource, paywallSource2);
            }

            /* renamed from: component1, reason: from getter */
            public final ProductsService.PaywallSource getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final Analytics.Event.PaywallSource getAnalyticsSource() {
                return this.analyticsSource;
            }

            public final Paywall copy(ProductsService.PaywallSource source, Analytics.Event.PaywallSource analyticsSource) {
                source.getClass();
                analyticsSource.getClass();
                return new Paywall(source, analyticsSource);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Paywall)) {
                    return false;
                }
                Paywall paywall = (Paywall) other;
                if (this.source == paywall.source && this.analyticsSource == paywall.analyticsSource) {
                    return true;
                }
                return false;
            }

            public final Analytics.Event.PaywallSource getAnalyticsSource() {
                return this.analyticsSource;
            }

            public final ProductsService.PaywallSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.analyticsSource.hashCode() + (this.source.hashCode() * 31);
            }

            public String toString() {
                return "Paywall(source=" + this.source + ", analyticsSource=" + this.analyticsSource + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/model/Destination$Authorized$PronunciationsListScreen;", "Lio/elevenlabs/domain/model/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PronunciationsListScreen extends Destination {
            public static final PronunciationsListScreen INSTANCE = new PronunciationsListScreen();

            private PronunciationsListScreen() {
                super(null);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PronunciationsListScreen)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 321884939;
            }

            public String toString() {
                return "PronunciationsListScreen";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/model/Destination$Authorized$ReadDetails;", "Lio/elevenlabs/domain/model/Destination;", "readId", "", "<init>", "(Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ReadDetails extends Destination {
            private final String readId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReadDetails(String str) {
                super(null);
                str.getClass();
                this.readId = str;
            }

            public static /* synthetic */ ReadDetails copy$default(ReadDetails readDetails, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = readDetails.readId;
                }
                return readDetails.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            public final ReadDetails copy(String readId) {
                readId.getClass();
                return new ReadDetails(readId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof ReadDetails) && m.c(this.readId, ((ReadDetails) other).readId)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public int hashCode() {
                return this.readId.hashCode();
            }

            public String toString() {
                return defpackage.f.C("ReadDetails(readId=", this.readId, Separators.RPAREN);
            }
        }

        private Authorized() {
            super(null);
        }

        public /* synthetic */ Authorized(f fVar) {
            this();
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/Destination$Authorized$Library;", "Lio/elevenlabs/domain/model/Destination;", "sortBy", "Lio/elevenlabs/domain/services/ReadsService$SortBy;", "<init>", "(Lio/elevenlabs/domain/services/ReadsService$SortBy;)V", "getSortBy", "()Lio/elevenlabs/domain/services/ReadsService$SortBy;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class Library extends Destination {
            private final ReadsService.SortBy sortBy;

            public /* synthetic */ Library(ReadsService.SortBy sortBy, int i10, f fVar) {
                this((i10 & 1) != 0 ? null : sortBy);
            }

            public static /* synthetic */ Library copy$default(Library library, ReadsService.SortBy sortBy, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    sortBy = library.sortBy;
                }
                return library.copy(sortBy);
            }

            /* renamed from: component1, reason: from getter */
            public final ReadsService.SortBy getSortBy() {
                return this.sortBy;
            }

            public final Library copy(ReadsService.SortBy sortBy) {
                return new Library(sortBy);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof Library) && this.sortBy == ((Library) other).sortBy) {
                    return true;
                }
                return false;
            }

            public final ReadsService.SortBy getSortBy() {
                return this.sortBy;
            }

            public int hashCode() {
                ReadsService.SortBy sortBy = this.sortBy;
                if (sortBy == null) {
                    return 0;
                }
                return sortBy.hashCode();
            }

            public String toString() {
                return "Library(sortBy=" + this.sortBy + Separators.RPAREN;
            }

            public Library(ReadsService.SortBy sortBy) {
                super(null);
                this.sortBy = sortBy;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Library() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }
    }

    private Destination() {
    }
}
