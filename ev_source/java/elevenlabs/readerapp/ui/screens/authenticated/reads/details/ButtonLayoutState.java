package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ButtonLayoutState;", "", "showPreviewButton", "", "mainButtonType", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ButtonLayoutState$MainButtonType;", "<init>", "(ZLio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ButtonLayoutState$MainButtonType;)V", "getShowPreviewButton", "()Z", "getMainButtonType", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ButtonLayoutState$MainButtonType;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "MainButtonType", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ButtonLayoutState {
    private final MainButtonType mainButtonType;
    private final boolean showPreviewButton;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ButtonLayoutState$MainButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "Play", "Purchase", "TryUltra", "PurchaseOrUltra", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class MainButtonType {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ MainButtonType[] $VALUES;
        public static final MainButtonType Play = new MainButtonType("Play", 0);
        public static final MainButtonType Purchase = new MainButtonType("Purchase", 1);
        public static final MainButtonType TryUltra = new MainButtonType("TryUltra", 2);
        public static final MainButtonType PurchaseOrUltra = new MainButtonType("PurchaseOrUltra", 3);

        private static final /* synthetic */ MainButtonType[] $values() {
            return new MainButtonType[]{Play, Purchase, TryUltra, PurchaseOrUltra};
        }

        static {
            MainButtonType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private MainButtonType(String str, int i10) {
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static MainButtonType valueOf(String str) {
            return (MainButtonType) Enum.valueOf(MainButtonType.class, str);
        }

        public static MainButtonType[] values() {
            return (MainButtonType[]) $VALUES.clone();
        }
    }

    public ButtonLayoutState(boolean z6, MainButtonType mainButtonType) {
        mainButtonType.getClass();
        this.showPreviewButton = z6;
        this.mainButtonType = mainButtonType;
    }

    public static /* synthetic */ ButtonLayoutState copy$default(ButtonLayoutState buttonLayoutState, boolean z6, MainButtonType mainButtonType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = buttonLayoutState.showPreviewButton;
        }
        if ((i10 & 2) != 0) {
            mainButtonType = buttonLayoutState.mainButtonType;
        }
        return buttonLayoutState.copy(z6, mainButtonType);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowPreviewButton() {
        return this.showPreviewButton;
    }

    /* renamed from: component2, reason: from getter */
    public final MainButtonType getMainButtonType() {
        return this.mainButtonType;
    }

    public final ButtonLayoutState copy(boolean showPreviewButton, MainButtonType mainButtonType) {
        mainButtonType.getClass();
        return new ButtonLayoutState(showPreviewButton, mainButtonType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonLayoutState)) {
            return false;
        }
        ButtonLayoutState buttonLayoutState = (ButtonLayoutState) other;
        if (this.showPreviewButton == buttonLayoutState.showPreviewButton && this.mainButtonType == buttonLayoutState.mainButtonType) {
            return true;
        }
        return false;
    }

    public final MainButtonType getMainButtonType() {
        return this.mainButtonType;
    }

    public final boolean getShowPreviewButton() {
        return this.showPreviewButton;
    }

    public int hashCode() {
        return this.mainButtonType.hashCode() + (Boolean.hashCode(this.showPreviewButton) * 31);
    }

    public String toString() {
        return "ButtonLayoutState(showPreviewButton=" + this.showPreviewButton + ", mainButtonType=" + this.mainButtonType + Separators.RPAREN;
    }
}
