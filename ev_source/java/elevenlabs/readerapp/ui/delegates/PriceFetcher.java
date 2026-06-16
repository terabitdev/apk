package io.elevenlabs.readerapp.ui.delegates;

import fr.d0;
import fr.g0;
import fr.z;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.PurchasesService;
import ir.b2;
import ir.j1;
import ir.l1;
import ir.r;
import ir.z1;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR(\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR+\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lio/elevenlabs/readerapp/ui/delegates/PriceFetcher;", "", "Lio/elevenlabs/domain/services/PurchasesService;", "purchasesService", "Lio/elevenlabs/domain/Logger;", "logger", "Lfr/d0;", "scope", "Lfr/z;", "dispatcher", "<init>", "(Lio/elevenlabs/domain/services/PurchasesService;Lio/elevenlabs/domain/Logger;Lfr/d0;Lfr/z;)V", "", "", "productIds", "Lsn/z;", "fetchPrices", "(Ljava/util/List;)V", "reset", "()V", "Lio/elevenlabs/domain/services/PurchasesService;", "Lio/elevenlabs/domain/Logger;", "Lfr/d0;", "Lfr/z;", "", "requestedIds", "Ljava/util/Set;", "Lir/j1;", "", "Lio/elevenlabs/domain/model/MoneyPrice;", "_prices", "Lir/j1;", "Lir/z1;", "prices", "Lir/z1;", "getPrices", "()Lir/z1;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PriceFetcher {
    private static final String TAG = "PriceFetcher";
    private final j1 _prices;
    private final z dispatcher;
    private final Logger logger;
    private final z1 prices;
    private final PurchasesService purchasesService;
    private final Set<String> requestedIds;
    private final d0 scope;
    public static final int $stable = 8;

    public PriceFetcher(PurchasesService purchasesService, Logger logger, d0 d0Var, z zVar) {
        purchasesService.getClass();
        logger.getClass();
        d0Var.getClass();
        zVar.getClass();
        this.purchasesService = purchasesService;
        this.logger = logger;
        this.scope = d0Var;
        this.dispatcher = zVar;
        this.requestedIds = new LinkedHashSet();
        b2 c5 = r.c(null);
        this._prices = c5;
        this.prices = new l1(c5);
    }

    public final void fetchPrices(List<String> productIds) {
        productIds.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : productIds) {
            if (!this.requestedIds.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            if (this._prices.getValue() == null) {
                this._prices.setValue(u.f33548a);
            }
        } else {
            this.requestedIds.addAll(arrayList);
            g0.D(this.scope, this.dispatcher, null, new PriceFetcher$fetchPrices$1(this, arrayList, null), 2);
        }
    }

    public final z1 getPrices() {
        return this.prices;
    }

    public final void reset() {
        this.requestedIds.clear();
        this._prices.setValue(null);
    }
}
