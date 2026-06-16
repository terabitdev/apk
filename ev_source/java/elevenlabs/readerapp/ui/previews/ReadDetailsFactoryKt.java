package io.elevenlabs.readerapp.ui.previews;

import ig.f;
import io.elevenlabs.domain.model.ChapterItem;
import io.elevenlabs.domain.model.DetailsItem;
import io.elevenlabs.domain.model.MediaHeaderSection;
import io.elevenlabs.domain.model.MetaItem;
import io.elevenlabs.domain.model.MetaSection;
import io.elevenlabs.domain.model.MoneyPrice;
import io.elevenlabs.domain.model.PaymentConfig;
import io.elevenlabs.domain.model.RawOneTimeProduct;
import io.elevenlabs.domain.model.ReadDetailsAuthorSection;
import io.elevenlabs.domain.model.ReadDetailsChaptersSection;
import io.elevenlabs.domain.model.ReadDetailsDetailsSection;
import io.elevenlabs.domain.model.ReadDetailsReadActions;
import io.elevenlabs.domain.model.ReadDetailsResponse;
import io.elevenlabs.domain.model.ReadDetailsSection;
import io.elevenlabs.domain.model.ReadDetailsTitleDescriptionSection;
import io.elevenlabs.domain.model.SizeableHeaderImage;
import io.elevenlabs.domain.model.Tag;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.PurchaseState;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import un.b;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u001a\u001a\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u001a\u0012\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u001a\u0006\u0010\u0013\u001a\u00020\u0011¨\u0006\u0014"}, d2 = {"stubReadDetailsResponse", "Lio/elevenlabs/domain/model/ReadDetailsResponse;", "title", "", "description", "author", "includeAuthorSection", "", "includeMeta", "includePreview", "shareUrl", "isPaid", "stubPurchaseState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/PurchaseState;", "isLoading", "isLoadingPurchase", "stubUltraPaymentConfig", "Lio/elevenlabs/domain/model/PaymentConfig;", "zeroPriceFormatted", "stubUltraPurchasablePaymentConfig", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadDetailsFactoryKt {
    public static final PurchaseState stubPurchaseState(boolean z6, boolean z10) {
        RawOneTimeProduct rawOneTimeProduct;
        if (z10) {
            rawOneTimeProduct = null;
        } else {
            rawOneTimeProduct = new RawOneTimeProduct("stub_product_id", new MoneyPrice(900L, "USD"));
        }
        return new PurchaseState(null, rawOneTimeProduct, z6, z10, null, 17, null);
    }

    public static /* synthetic */ PurchaseState stubPurchaseState$default(boolean z6, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = false;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return stubPurchaseState(z6, z10);
    }

    public static final ReadDetailsResponse stubReadDetailsResponse(String str, String str2, String str3, boolean z6, boolean z10, boolean z11, String str4, boolean z12) {
        PaymentConfig paymentConfig;
        str.getClass();
        str2.getClass();
        str3.getClass();
        b o6 = f.o();
        String str5 = null;
        o6.add(new ReadDetailsSection.MediaHeader(new MediaHeaderSection(new SizeableHeaderImage("https://via.placeholder.com/300x400", 0.75f, 0.6f, 300.0f, Float.valueOf(8.0f)), str, str3, null, f.I(new Tag("Fiction", null), new Tag("Novel", null)), "Fascinating read about the subject", null, 72, null)));
        if (z10) {
            o6.add(new ReadDetailsSection.Meta(new MetaSection(f.I(new MetaItem("Listens", "24K"), new MetaItem("Length", "2h 30m"), new MetaItem("Rating", "4.5")))));
        }
        o6.add(new ReadDetailsSection.TitleDescription(new ReadDetailsTitleDescriptionSection("About", str2)));
        o6.add(new ReadDetailsSection.Details(new ReadDetailsDetailsSection(f.I(new DetailsItem("Genre", "Fiction, Fantasy"), new DetailsItem("Length", "2h 30m"), new DetailsItem("Language", "EN")))));
        o6.add(new ReadDetailsSection.ReadActions(new ReadDetailsReadActions("stub-read-id")));
        if (z6) {
            o6.add(new ReadDetailsSection.Author(new ReadDetailsAuthorSection("https://thispersondoesnotexist.com/", "John Doe", "Paolo Eleveno", "Pioneer of science fiction and visionary author whose works like \"The Time Machine\" and \"The War of the Worlds\" shaped the genre and continue to captivate readers today.", "author-123")));
        }
        o6.add(new ReadDetailsSection.Chapters(new ReadDetailsChaptersSection("Chapters", f.I(new ChapterItem("Chapter 1: The Beginning"), new ChapterItem("Chapter 2: The Journey"), new ChapterItem("Chapter 3: The Discovery"), new ChapterItem("Chapter 4: The Revelation"), new ChapterItem("Chapter 5: The Conclusion")))));
        b i10 = f.i(o6);
        if (z12) {
            paymentConfig = new PaymentConfig("stub_product_id", "https://example.com/purchase", "$9.99", null, 8, null);
        } else {
            paymentConfig = null;
        }
        if (z11) {
            str5 = "https://example.com/test.mp3";
        }
        return new ReadDetailsResponse(i10, null, paymentConfig, str5, str4, null, null, false, 226, null);
    }

    public static /* synthetic */ ReadDetailsResponse stubReadDetailsResponse$default(String str, String str2, String str3, boolean z6, boolean z10, boolean z11, String str4, boolean z12, int i10, Object obj) {
        boolean z13;
        if ((i10 & 1) != 0) {
            str = "Stub Title";
        }
        if ((i10 & 2) != 0) {
            str2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        }
        if ((i10 & 4) != 0) {
            str3 = "Stub Author";
        }
        if ((i10 & 8) != 0) {
            z6 = true;
        }
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        if ((i10 & 32) != 0) {
            z11 = false;
        }
        if ((i10 & 64) != 0) {
            str4 = null;
        }
        if ((i10 & 128) != 0) {
            z13 = false;
        } else {
            z13 = z12;
        }
        String str5 = str4;
        boolean z14 = z11;
        boolean z15 = z10;
        boolean z16 = z6;
        return stubReadDetailsResponse(str, str2, str3, z16, z15, z14, str5, z13);
    }

    public static final PaymentConfig stubUltraPaymentConfig(String str) {
        return new PaymentConfig(null, "https://example.com/ultra", null, str);
    }

    public static /* synthetic */ PaymentConfig stubUltraPaymentConfig$default(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return stubUltraPaymentConfig(str);
    }

    public static final PaymentConfig stubUltraPurchasablePaymentConfig() {
        return new PaymentConfig("stub_product_id", "https://example.com/ultra", "$9.99", "$0.00");
    }
}
