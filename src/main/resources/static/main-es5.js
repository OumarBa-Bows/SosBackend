(function () {
  function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

  function _defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } }

  function _createClass(Constructor, protoProps, staticProps) { if (protoProps) _defineProperties(Constructor.prototype, protoProps); if (staticProps) _defineProperties(Constructor, staticProps); return Constructor; }

  (window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"], {
    /***/
    0:
    /*!***************************!*\
      !*** multi ./src/main.ts ***!
      \***************************/

    /*! no static exports found */

    /***/
    function _(module, exports, __webpack_require__) {
      module.exports = __webpack_require__(
      /*! C:\Users\Oumar Ba\Documents\sosfrontend\src\main.ts */
      "zUnb");
      /***/
    },

    /***/
    "0epC":
    /*!**************************************************!*\
      !*** ./src/app/recherche/recherche.component.ts ***!
      \**************************************************/

    /*! exports provided: RechercheComponent */

    /***/
    function epC(module, __webpack_exports__, __webpack_require__) {
      "use strict";

      __webpack_require__.r(__webpack_exports__);
      /* harmony export (binding) */


      __webpack_require__.d(__webpack_exports__, "RechercheComponent", function () {
        return RechercheComponent;
      });
      /* harmony import */


      var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
      /*! @angular/core */
      "fXoL");
      /* harmony import */


      var src_app_services_levelservice_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
      /*! src/app/services/levelservice.service */
      "uAHu");
      /* harmony import */


      var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
      /*! @angular/router */
      "tyNb");
      /* harmony import */


      var _angular_common__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
      /*! @angular/common */
      "ofXK");
      /* harmony import */


      var _angular_forms__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
      /*! @angular/forms */
      "3Pt+");
      /* harmony import */


      var ngx_pagination__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(
      /*! ngx-pagination */
      "oOf3");

      function RechercheComponent_option_14_Template(rf, ctx) {
        if (rf & 1) {
          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](0, "option", 23);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](1);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();
        }

        if (rf & 2) {
          var s_r5 = ctx.$implicit;

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????propertyInterpolate"]("value", s_r5.name);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](1);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](s_r5.name);
        }
      }

      function RechercheComponent_span_28_Template(rf, ctx) {
        if (rf & 1) {
          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](0, "span", 24);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](1, "strong");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();
        }

        if (rf & 2) {
          var ctx_r3 = _angular_core__WEBPACK_IMPORTED_MODULE_0__["????nextContext"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](ctx_r3.cases.length);
        }
      }

      function RechercheComponent_tr_55_Template(rf, ctx) {
        if (rf & 1) {
          var _r8 = _angular_core__WEBPACK_IMPORTED_MODULE_0__["????getCurrentView"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](0, "tr");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](1, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](3, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](4);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](5, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](6);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](7, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](8);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](9, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](10);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](11, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](12);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](13, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](14);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](15, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](16);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](17, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](18);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](19, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](20);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](21, "td", 25);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](22, "button", 26);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????listener"]("click", function RechercheComponent_tr_55_Template_button_click_22_listener() {
            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????restoreView"](_r8);

            var level_r6 = ctx.$implicit;

            var ctx_r7 = _angular_core__WEBPACK_IMPORTED_MODULE_0__["????nextContext"]();

            return ctx_r7.gotoDetails(level_r6.level1Id);
          });

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????element"](23, "i", 27);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????element"](24, "router-outlet");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();
        }

        if (rf & 2) {
          var level_r6 = ctx.$implicit;

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r6.dateInterview);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r6.wilaya);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r6.moughata);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r6.longitude);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r6.latitude);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r6.structurelle);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r6.nomIntervenant);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r6.numeroIintentification);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r6.sexe);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r6.nationalite);
        }
      }

      var _c0 = function _c0(a1) {
        return {
          itemsPerPage: 5,
          currentPage: a1
        };
      };

      var RechercheComponent = /*#__PURE__*/function () {
        function RechercheComponent(levelservice, route) {
          _classCallCheck(this, RechercheComponent);

          this.levelservice = levelservice;
          this.route = route;
          this.model = {};
          this.levels = [];
          this.cases = [];
          this.p = 1; /////////////////////////////////////

          this.structures = [{
            id: "0",
            name: " "
          }, {
            id: "1",
            name: "SOS PE"
          }, {
            id: "2",
            name: "AGD"
          }, {
            id: "3",
            name: "REMAPLUS"
          }, {
            id: "4",
            name: "NAD NDB"
          }, {
            id: "5",
            name: "AFLM NDB"
          }, {
            id: "6",
            name: "NSA"
          }, {
            id: "7",
            name: "INTERFACE ACTION"
          }, {
            id: "8",
            name: "STOP SIDA"
          }, {
            id: "9",
            name: "PE NDB"
          }, {
            id: "10",
            name: "OMST SIDA ROSSO"
          }, {
            id: "11",
            name: "RRAJ NOUAKCHOTT"
          }, {
            id: "12",
            name: "FOR/MVD"
          }, {
            id: "13",
            name: "ASC NDB"
          }];
        }

        _createClass(RechercheComponent, [{
          key: "ngOnInit",
          value: function ngOnInit() {
            var _this = this;

            this.levelservice.levleslines().subscribe(function (resultat) {
              if (resultat) {
                _this.levels = resultat;
                _this.cases = resultat;
                console.log(_this.levels);
              }
            });
          } //recherche par structure

        }, {
          key: "search",
          value: function search(str) {
            if (str.target.value === " ") {
              this.cases = this.levels;
            } else {
              this.cases = str.target.value ? this.levels.filter(function (level) {
                return level.structurelle.includes(str.target.value);
              }) : null;
            }
          }
        }, {
          key: "gotoDetails",
          value: function gotoDetails(id) {
            this.route.navigate(["details/", id]);
          }
        }, {
          key: "rechercheParDates",
          value: function rechercheParDates() {
            var _this2 = this;

            this.levelservice.rechercheParDates(this.model.startdate, this.model.enddate).subscribe(function (value) {
              if (value) {
                _this2.cases = value;
              }
            });
          }
        }]);

        return RechercheComponent;
      }();

      RechercheComponent.??fac = function RechercheComponent_Factory(t) {
        return new (t || RechercheComponent)(_angular_core__WEBPACK_IMPORTED_MODULE_0__["????directiveInject"](src_app_services_levelservice_service__WEBPACK_IMPORTED_MODULE_1__["LevelserviceService"]), _angular_core__WEBPACK_IMPORTED_MODULE_0__["????directiveInject"](_angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"]));
      };

      RechercheComponent.??cmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__["????defineComponent"]({
        type: RechercheComponent,
        selectors: [["app-recherche"]],
        decls: 59,
        vars: 11,
        consts: [[1, "container"], [2, "text-align", "center", "color", "grey", "padding-bottom", "50px"], [1, "row"], [1, "card", 2, "margin-right", "30px", "margin-left", "15px"], [1, "card-header"], [1, "card-body"], [1, "form-group"], ["for", "sel1"], ["id", "sel1", 1, "form-control", 3, "change"], [3, "value", 4, "ngFor", "ngForOf"], [1, "card", "w-50"], [1, "card-header", "bd-light"], ["novalidate", ""], ["type", "text", "name", "startdate", "placeholder", "Date d\xE9but", 2, "margin-right", "3px", 3, "ngModel", "ngModelChange"], ["startdate", "ngModel"], ["type", "text", "name", "enddate", "placeholder", "Date fin", 2, "margin-right", "3px", 3, "ngModel", "ngModelChange"], ["enddate", "ngModel"], ["type", "submit", "value", "Rechercher", 1, "btn", "btn-info", 3, "disabled", "click"], ["style", "text-align: center; margin-top: 2px;", 4, "ngIf"], [1, "table", "table-responsive", "table-sm", "table-bordered"], [1, "bg-light"], [4, "ngFor", "ngForOf"], [2, "float", "right", 3, "pageChange"], [3, "value"], [2, "text-align", "center", "margin-top", "2px"], [2, "white-space", "nowrap"], [1, "btn", "btn-xs", 2, "margin-right", "3px", 3, "click"], [1, "fas", "fa-info-circle", 2, "color", "#1E90FF"]],
        template: function RechercheComponent_Template(rf, ctx) {
          if (rf & 1) {
            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](0, "div", 0);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????element"](1, "br");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????element"](2, "br");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](3, "h1", 1);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](4, "Pr\xE9vention combin\xE9e aupr\xE8s des populations cl\xE9s en mauritanie");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](5, "div", 2);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](6, "div", 3);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](7, "h6", 4);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](8, "Recherche par structure");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](9, "div", 5);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](10, "div", 6);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](11, "label", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](12, "Selectionner une structure");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](13, "select", 8);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????listener"]("change", function RechercheComponent_Template_select_change_13_listener($event) {
              return ctx.search($event);
            });

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????template"](14, RechercheComponent_option_14_Template, 2, 2, "option", 9);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](15, "div", 10);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](16, "h6", 11);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](17, "Recherche par Date");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](18, "div", 5);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](19, "form", 12);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](20, "input", 13, 14);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????listener"]("ngModelChange", function RechercheComponent_Template_input_ngModelChange_20_listener($event) {
              return ctx.model.startdate = $event;
            });

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](22, "input", 15, 16);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????listener"]("ngModelChange", function RechercheComponent_Template_input_ngModelChange_22_listener($event) {
              return ctx.model.enddate = $event;
            });

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](24, "input", 17);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????listener"]("click", function RechercheComponent_Template_input_click_24_listener() {
              return ctx.rechercheParDates();
            });

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????element"](25, "br");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](26, "P");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](27, "Total : ");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????template"](28, RechercheComponent_span_28_Template, 3, 1, "span", 18);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](29, "table", 19);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](30, "thead", 20);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](31, "tr");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](32, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](33, "Date d'interview");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](34, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](35, "Wilaya");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](36, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](37, "Moughata");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](38, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](39, "Longitude");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](40, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](41, "Latitude");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](42, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](43, "Structure");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](44, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](45, "Nom d'intervenant");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](46, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](47, "Num\xE9ro d'intentification");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](48, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](49, "Sexe");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](50, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](51, "Nationalit\xE9");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](52, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](53, "D\xE9tails");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](54, "tbody");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????template"](55, RechercheComponent_tr_55_Template, 25, 10, "tr", 21);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????pipe"](56, "paginate");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](57, "pagination-controls", 22);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????listener"]("pageChange", function RechercheComponent_Template_pagination_controls_pageChange_57_listener($event) {
              return ctx.p = $event;
            });

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????element"](58, "br");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();
          }

          if (rf & 2) {
            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](14);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????property"]("ngForOf", ctx.structures);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](6);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????property"]("ngModel", ctx.model.startdate);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](2);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????property"]("ngModel", ctx.model.enddate);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](2);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????property"]("disabled", !ctx.model.startdate || !ctx.model.enddate);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](4);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????property"]("ngIf", ctx.cases);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](27);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????property"]("ngForOf", _angular_core__WEBPACK_IMPORTED_MODULE_0__["????pipeBind2"](56, 6, ctx.cases, _angular_core__WEBPACK_IMPORTED_MODULE_0__["????pureFunction1"](9, _c0, ctx.p)));
          }
        },
        directives: [_angular_common__WEBPACK_IMPORTED_MODULE_3__["NgForOf"], _angular_forms__WEBPACK_IMPORTED_MODULE_4__["??angular_packages_forms_forms_ba"], _angular_forms__WEBPACK_IMPORTED_MODULE_4__["NgControlStatusGroup"], _angular_forms__WEBPACK_IMPORTED_MODULE_4__["NgForm"], _angular_forms__WEBPACK_IMPORTED_MODULE_4__["DefaultValueAccessor"], _angular_forms__WEBPACK_IMPORTED_MODULE_4__["NgControlStatus"], _angular_forms__WEBPACK_IMPORTED_MODULE_4__["NgModel"], _angular_common__WEBPACK_IMPORTED_MODULE_3__["NgIf"], ngx_pagination__WEBPACK_IMPORTED_MODULE_5__["PaginationControlsComponent"], _angular_forms__WEBPACK_IMPORTED_MODULE_4__["NgSelectOption"], _angular_forms__WEBPACK_IMPORTED_MODULE_4__["??angular_packages_forms_forms_z"], _angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterOutlet"]],
        pipes: [ngx_pagination__WEBPACK_IMPORTED_MODULE_5__["PaginatePipe"]],
        styles: [".pagination[_ngcontent-%COMP%] {\n  display: inline-block;\n}\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIi4uXFwuLlxcLi5cXHJlY2hlcmNoZS5jb21wb25lbnQuc2NzcyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiQUFBQTtFQUNJLHFCQUFBO0FBQ0oiLCJmaWxlIjoicmVjaGVyY2hlLmNvbXBvbmVudC5zY3NzIiwic291cmNlc0NvbnRlbnQiOlsiLnBhZ2luYXRpb24ge1xyXG4gICAgZGlzcGxheTogaW5saW5lLWJsb2NrO1xyXG4gIH1cclxuXHJcbiBcclxuICAiXX0= */"]
      });
      /***/
    },

    /***/
    "64Bt":
    /*!*******************************************************!*\
      !*** ./src/app/services/biomedicalevalues.service.ts ***!
      \*******************************************************/

    /*! exports provided: BiomedicalevaluesService */

    /***/
    function Bt(module, __webpack_exports__, __webpack_require__) {
      "use strict";

      __webpack_require__.r(__webpack_exports__);
      /* harmony export (binding) */


      __webpack_require__.d(__webpack_exports__, "BiomedicalevaluesService", function () {
        return BiomedicalevaluesService;
      });
      /* harmony import */


      var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
      /*! @angular/core */
      "fXoL");
      /* harmony import */


      var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
      /*! @angular/common/http */
      "tk/3");

      var BiomedicalevaluesService = /*#__PURE__*/function () {
        function BiomedicalevaluesService(http) {
          _classCallCheck(this, BiomedicalevaluesService);

          this.http = http;
          this.host = "http://localhost:8080/biomedicalevalues";
        }

        _createClass(BiomedicalevaluesService, [{
          key: "listBiomedicaleVlues",
          value: function listBiomedicaleVlues(idLevle) {
            return this.http.get(this.host + "/list/" + idLevle);
          }
        }]);

        return BiomedicalevaluesService;
      }();

      BiomedicalevaluesService.??fac = function BiomedicalevaluesService_Factory(t) {
        return new (t || BiomedicalevaluesService)(_angular_core__WEBPACK_IMPORTED_MODULE_0__["????inject"](_angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"]));
      };

      BiomedicalevaluesService.??prov = _angular_core__WEBPACK_IMPORTED_MODULE_0__["????defineInjectable"]({
        token: BiomedicalevaluesService,
        factory: BiomedicalevaluesService.??fac,
        providedIn: 'root'
      });
      /***/
    },

    /***/
    "AytR":
    /*!*****************************************!*\
      !*** ./src/environments/environment.ts ***!
      \*****************************************/

    /*! exports provided: environment */

    /***/
    function AytR(module, __webpack_exports__, __webpack_require__) {
      "use strict";

      __webpack_require__.r(__webpack_exports__);
      /* harmony export (binding) */


      __webpack_require__.d(__webpack_exports__, "environment", function () {
        return environment;
      }); // This file can be replaced during build by using the `fileReplacements` array.
      // `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
      // The list of file replacements can be found in `angular.json`.


      var environment = {
        production: false
      };
      /*
       * For easier debugging in development mode, you can import the following file
       * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
       *
       * This import should be commented out in production mode because it will have a negative impact
       * on performance if an error is thrown.
       */
      // import 'zone.js/dist/zone-error';  // Included with Angular CLI.

      /***/
    },

    /***/
    "Br5r":
    /*!************************************************!*\
      !*** ./src/app/allcases/allcases.component.ts ***!
      \************************************************/

    /*! exports provided: AllcasesComponent */

    /***/
    function Br5r(module, __webpack_exports__, __webpack_require__) {
      "use strict";

      __webpack_require__.r(__webpack_exports__);
      /* harmony export (binding) */


      __webpack_require__.d(__webpack_exports__, "AllcasesComponent", function () {
        return AllcasesComponent;
      });
      /* harmony import */


      var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
      /*! @angular/core */
      "fXoL");
      /* harmony import */


      var src_app_services_levelservice_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
      /*! src/app/services/levelservice.service */
      "uAHu");
      /* harmony import */


      var _angular_common__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
      /*! @angular/common */
      "ofXK");

      function AllcasesComponent_span_4_Template(rf, ctx) {
        if (rf & 1) {
          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](0, "span", 7);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](1);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();
        }

        if (rf & 2) {
          var ctx_r0 = _angular_core__WEBPACK_IMPORTED_MODULE_0__["????nextContext"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](1);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](ctx_r0.levels.length);
        }
      }

      function AllcasesComponent_tr_30_Template(rf, ctx) {
        if (rf & 1) {
          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](0, "tr");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](1, "th");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](2, "small");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](3);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](4, "th");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](5, "small");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](6);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](7, "th");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](8, "small");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](9);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](10, "th");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](11, "small");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](12);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](13, "th");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](14, "small");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](15);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](16, "th");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](17, "small");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](18);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](19, "th");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](20, "small");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](21);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](22, "th");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](23, "small");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](24);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](25, "th");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](26, "small");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](27);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](28, "th");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](29, "small");

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](30);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();
        }

        if (rf & 2) {
          var level_r2 = ctx.$implicit;

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](3);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r2.structurelle);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](3);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r2.dateInterview);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](3);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r2.longitude);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](3);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r2.latitude);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](3);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r2.wilaya);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](3);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r2.moughata);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](3);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r2.numeroIintentification);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](3);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r2.nomIntervenant);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](3);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r2.sexe);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](3);

          _angular_core__WEBPACK_IMPORTED_MODULE_0__["????textInterpolate"](level_r2.nationalite);
        }
      }

      var AllcasesComponent = /*#__PURE__*/function () {
        function AllcasesComponent(levelservice) {
          _classCallCheck(this, AllcasesComponent);

          this.levelservice = levelservice;
        }

        _createClass(AllcasesComponent, [{
          key: "ngOnInit",
          value: function ngOnInit() {
            var _this3 = this;

            this.levelservice.levleslines().subscribe(function (resultat) {
              if (resultat) {
                _this3.levels = resultat;
                console.log("this.levels " + _this3.levels);
              }
            });
          }
        }]);

        return AllcasesComponent;
      }();

      AllcasesComponent.??fac = function AllcasesComponent_Factory(t) {
        return new (t || AllcasesComponent)(_angular_core__WEBPACK_IMPORTED_MODULE_0__["????directiveInject"](src_app_services_levelservice_service__WEBPACK_IMPORTED_MODULE_1__["LevelserviceService"]));
      };

      AllcasesComponent.??cmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__["????defineComponent"]({
        type: AllcasesComponent,
        selectors: [["app-allcases"]],
        decls: 31,
        vars: 2,
        consts: [[1, "container"], [1, "card", 2, "width", "10rem"], [1, "card-header"], ["style", "text-align: center; margin-top: 2px;", 4, "ngIf"], [1, "table", "table-bordered", "table-sm"], [1, "bg-primary"], [4, "ngFor", "ngForOf"], [2, "text-align", "center", "margin-top", "2px"]],
        template: function AllcasesComponent_Template(rf, ctx) {
          if (rf & 1) {
            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](0, "div", 0);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](1, "div", 1);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](2, "h6", 2);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](3, "Nombres");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????template"](4, AllcasesComponent_span_4_Template, 2, 1, "span", 3);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????element"](5, "br");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](6, "table", 4);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](7, "thead", 5);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](8, "tr");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](9, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](10, "Structure");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](11, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](12, "Date d'interview");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](13, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](14, "Longitude");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](15, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](16, "Latitude");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](17, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](18, "Wilaya");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](19, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](20, "Moughata");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](21, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](22, "Num\xE9ro d'intentification");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](23, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](24, "Nom d'intervenant");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](25, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](26, "Sexe");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](27, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](28, "Nationalit\xE9");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](29, "tbody");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????template"](30, AllcasesComponent_tr_30_Template, 31, 10, "tr", 6);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();
          }

          if (rf & 2) {
            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](4);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????property"]("ngIf", ctx.levels);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????advance"](26);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????property"]("ngForOf", ctx.levels);
          }
        },
        directives: [_angular_common__WEBPACK_IMPORTED_MODULE_2__["NgIf"], _angular_common__WEBPACK_IMPORTED_MODULE_2__["NgForOf"]],
        styles: ["\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJhbGxjYXNlcy5jb21wb25lbnQuc2NzcyJ9 */"]
      });
      /***/
    },

    /***/
    "N+0q":
    /*!*********************************************************!*\
      !*** ./src/app/services/comortementalvalues.service.ts ***!
      \*********************************************************/

    /*! exports provided: ComortementalvaluesService */

    /***/
    function N0q(module, __webpack_exports__, __webpack_require__) {
      "use strict";

      __webpack_require__.r(__webpack_exports__);
      /* harmony export (binding) */


      __webpack_require__.d(__webpack_exports__, "ComortementalvaluesService", function () {
        return ComortementalvaluesService;
      });
      /* harmony import */


      var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
      /*! @angular/core */
      "fXoL");
      /* harmony import */


      var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
      /*! @angular/common/http */
      "tk/3");

      var ComortementalvaluesService = /*#__PURE__*/function () {
        function ComortementalvaluesService(http) {
          _classCallCheck(this, ComortementalvaluesService);

          this.http = http;
          this.host = "http://localhost:8080/comportementalVal";
        } //............;list des valeurs d'action comportementale................


        _createClass(ComortementalvaluesService, [{
          key: "listcomportementalevalue",
          value: function listcomportementalevalue(idlevel) {
            return this.http.get(this.host + "/listcomportementalevalue/" + idlevel);
          }
        }]);

        return ComortementalvaluesService;
      }();

      ComortementalvaluesService.??fac = function ComortementalvaluesService_Factory(t) {
        return new (t || ComortementalvaluesService)(_angular_core__WEBPACK_IMPORTED_MODULE_0__["????inject"](_angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"]));
      };

      ComortementalvaluesService.??prov = _angular_core__WEBPACK_IMPORTED_MODULE_0__["????defineInjectable"]({
        token: ComortementalvaluesService,
        factory: ComortementalvaluesService.??fac,
        providedIn: 'root'
      });
      /***/
    },

    /***/
    "Sy1n":
    /*!**********************************!*\
      !*** ./src/app/app.component.ts ***!
      \**********************************/

    /*! exports provided: AppComponent */

    /***/
    function Sy1n(module, __webpack_exports__, __webpack_require__) {
      "use strict";

      __webpack_require__.r(__webpack_exports__);
      /* harmony export (binding) */


      __webpack_require__.d(__webpack_exports__, "AppComponent", function () {
        return AppComponent;
      });
      /* harmony import */


      var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
      /*! @angular/core */
      "fXoL");
      /* harmony import */


      var _header_header_component__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
      /*! ./header/header.component */
      "fECr");
      /* harmony import */


      var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
      /*! @angular/router */
      "tyNb");

      var AppComponent = function AppComponent() {
        _classCallCheck(this, AppComponent);

        this.title = 'sosfrontend';
      };

      AppComponent.??fac = function AppComponent_Factory(t) {
        return new (t || AppComponent)();
      };

      AppComponent.??cmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__["????defineComponent"]({
        type: AppComponent,
        selectors: [["app-root"]],
        decls: 2,
        vars: 0,
        template: function AppComponent_Template(rf, ctx) {
          if (rf & 1) {
            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????element"](0, "app-header");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????element"](1, "router-outlet");
          }
        },
        directives: [_header_header_component__WEBPACK_IMPORTED_MODULE_1__["HeaderComponent"], _angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterOutlet"]],
        styles: ["\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJhcHAuY29tcG9uZW50LnNjc3MifQ== */"]
      });
      /***/
    },

    /***/
    "Vqpu":
    /*!*****************************************************!*\
      !*** ./src/app/services/structurevalues.service.ts ***!
      \*****************************************************/

    /*! exports provided: StructurevaluesService */

    /***/
    function Vqpu(module, __webpack_exports__, __webpack_require__) {
      "use strict";

      __webpack_require__.r(__webpack_exports__);
      /* harmony export (binding) */


      __webpack_require__.d(__webpack_exports__, "StructurevaluesService", function () {
        return StructurevaluesService;
      });
      /* harmony import */


      var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
      /*! @angular/core */
      "fXoL");
      /* harmony import */


      var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
      /*! @angular/common/http */
      "tk/3");

      var StructurevaluesService = /*#__PURE__*/function () {
        function StructurevaluesService(http) {
          _classCallCheck(this, StructurevaluesService);

          this.http = http;
          this.host = "http://localhost:8080/structurellevalues";
        }

        _createClass(StructurevaluesService, [{
          key: "ListStructurelleValue",
          value: function ListStructurelleValue(idLevel) {
            return this.http.get(this.host + "/Listvalues/" + idLevel);
          }
        }]);

        return StructurevaluesService;
      }();

      StructurevaluesService.??fac = function StructurevaluesService_Factory(t) {
        return new (t || StructurevaluesService)(_angular_core__WEBPACK_IMPORTED_MODULE_0__["????inject"](_angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"]));
      };

      StructurevaluesService.??prov = _angular_core__WEBPACK_IMPORTED_MODULE_0__["????defineInjectable"]({
        token: StructurevaluesService,
        factory: StructurevaluesService.??fac,
        providedIn: 'root'
      });
      /***/
    },

    /***/
    "ZAI4":
    /*!*******************************!*\
      !*** ./src/app/app.module.ts ***!
      \*******************************/

    /*! exports provided: AppModule */

    /***/
    function ZAI4(module, __webpack_exports__, __webpack_require__) {
      "use strict";

      __webpack_require__.r(__webpack_exports__);
      /* harmony export (binding) */


      __webpack_require__.d(__webpack_exports__, "AppModule", function () {
        return AppModule;
      });
      /* harmony import */


      var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
      /*! @angular/platform-browser */
      "jhN1");
      /* harmony import */


      var _angular_forms__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
      /*! @angular/forms */
      "3Pt+");
      /* harmony import */


      var _app_routing_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
      /*! ./app-routing.module */
      "vY5A");
      /* harmony import */


      var _app_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
      /*! ./app.component */
      "Sy1n");
      /* harmony import */


      var _angular_platform_browser_animations__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
      /*! @angular/platform-browser/animations */
      "R1ws");
      /* harmony import */


      var _header_header_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(
      /*! ./header/header.component */
      "fECr");
      /* harmony import */


      var _allcases_allcases_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(
      /*! ./allcases/allcases.component */
      "Br5r");
      /* harmony import */


      var src_app_services_levelservice_service__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(
      /*! src/app/services/levelservice.service */
      "uAHu");
      /* harmony import */


      var _angular_common_http__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(
      /*! @angular/common/http */
      "tk/3");
      /* harmony import */


      var _recherche_recherche_component__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(
      /*! ./recherche/recherche.component */
      "0epC");
      /* harmony import */


      var ng2_search_filter__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(
      /*! ng2-search-filter */
      "cZdB");
      /* harmony import */


      var ngx_pagination__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(
      /*! ngx-pagination */
      "oOf3");
      /* harmony import */


      var _details_detailcases_detailcases_component__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(
      /*! ./details/detailcases/detailcases.component */
      "otNC");
      /* harmony import */


      var _angular_core__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(
      /*! @angular/core */
      "fXoL");

      var AppModule = function AppModule() {
        _classCallCheck(this, AppModule);
      };

      AppModule.??fac = function AppModule_Factory(t) {
        return new (t || AppModule)();
      };

      AppModule.??mod = _angular_core__WEBPACK_IMPORTED_MODULE_13__["????defineNgModule"]({
        type: AppModule,
        bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_3__["AppComponent"]]
      });
      AppModule.??inj = _angular_core__WEBPACK_IMPORTED_MODULE_13__["????defineInjector"]({
        providers: [src_app_services_levelservice_service__WEBPACK_IMPORTED_MODULE_7__["LevelserviceService"]],
        imports: [[_angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"], _angular_forms__WEBPACK_IMPORTED_MODULE_1__["FormsModule"], _app_routing_module__WEBPACK_IMPORTED_MODULE_2__["AppRoutingModule"], _angular_platform_browser_animations__WEBPACK_IMPORTED_MODULE_4__["BrowserAnimationsModule"], _angular_common_http__WEBPACK_IMPORTED_MODULE_8__["HttpClientModule"], ng2_search_filter__WEBPACK_IMPORTED_MODULE_10__["Ng2SearchPipeModule"], ngx_pagination__WEBPACK_IMPORTED_MODULE_11__["NgxPaginationModule"]]]
      });

      (function () {
        (typeof ngJitMode === "undefined" || ngJitMode) && _angular_core__WEBPACK_IMPORTED_MODULE_13__["????setNgModuleScope"](AppModule, {
          declarations: [_app_component__WEBPACK_IMPORTED_MODULE_3__["AppComponent"], _header_header_component__WEBPACK_IMPORTED_MODULE_5__["HeaderComponent"], _allcases_allcases_component__WEBPACK_IMPORTED_MODULE_6__["AllcasesComponent"], _recherche_recherche_component__WEBPACK_IMPORTED_MODULE_9__["RechercheComponent"], _details_detailcases_detailcases_component__WEBPACK_IMPORTED_MODULE_12__["DetailcasesComponent"]],
          imports: [_angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"], _angular_forms__WEBPACK_IMPORTED_MODULE_1__["FormsModule"], _app_routing_module__WEBPACK_IMPORTED_MODULE_2__["AppRoutingModule"], _angular_platform_browser_animations__WEBPACK_IMPORTED_MODULE_4__["BrowserAnimationsModule"], _angular_common_http__WEBPACK_IMPORTED_MODULE_8__["HttpClientModule"], ng2_search_filter__WEBPACK_IMPORTED_MODULE_10__["Ng2SearchPipeModule"], ngx_pagination__WEBPACK_IMPORTED_MODULE_11__["NgxPaginationModule"]]
        });
      })();
      /***/

    },

    /***/
    "fECr":
    /*!********************************************!*\
      !*** ./src/app/header/header.component.ts ***!
      \********************************************/

    /*! exports provided: HeaderComponent */

    /***/
    function fECr(module, __webpack_exports__, __webpack_require__) {
      "use strict";

      __webpack_require__.r(__webpack_exports__);
      /* harmony export (binding) */


      __webpack_require__.d(__webpack_exports__, "HeaderComponent", function () {
        return HeaderComponent;
      });
      /* harmony import */


      var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
      /*! @angular/core */
      "fXoL");
      /* harmony import */


      var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
      /*! @angular/router */
      "tyNb");

      var HeaderComponent = /*#__PURE__*/function () {
        function HeaderComponent() {
          _classCallCheck(this, HeaderComponent);
        }

        _createClass(HeaderComponent, [{
          key: "ngOnInit",
          value: function ngOnInit() {}
        }]);

        return HeaderComponent;
      }();

      HeaderComponent.??fac = function HeaderComponent_Factory(t) {
        return new (t || HeaderComponent)();
      };

      HeaderComponent.??cmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__["????defineComponent"]({
        type: HeaderComponent,
        selectors: [["app-header"]],
        decls: 40,
        vars: 0,
        consts: [[1, "navbar", "navbar-expand-lg", "navbar-dark", "bg-info"], ["id", "navbarSupportedContent", 1, "collapse", "navbar-collapse"], [1, "navbar-nav", "mr-auto"], [1, "nav-item"], ["href", "/", "routerLinkActive", "active", 1, "nav-link", 2, "color", "whitesmoke"], [1, "nav-item", "dropdown"], ["href", "#", "id", "navbarDropdown", "role", "button", "data-toggle", "dropdown", "aria-haspopup", "true", "aria-expanded", "false", 1, "nav-link", "dropdown-toggle", 2, "color", "whitesmoke"], ["aria-labelledby", "navbarDropdown", 1, "dropdown-menu"], ["href", "#", 1, "dropdown-item"], [1, "form-inline", "my-2", "my-lg-0"], ["routerLinkActive", "active", "routerLink", "#", 1, "nav-link", 2, "color", "black", "font-weight", "bold"]],
        template: function HeaderComponent_Template(rf, ctx) {
          if (rf & 1) {
            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](0, "nav", 0);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](1, "div", 1);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](2, "ul", 2);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](3, "li", 3);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](4, "a", 4);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](5, " Accueil ");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](6, "li", 5);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](7, "a", 6);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](8, " Gestion de donn\xE9es ");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](9, "div", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](10, "a", 8);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](11, "Recherche");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](12, "a", 8);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](13, "Saisie de donn\xE9es");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](14, "li", 5);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](15, "a", 6);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](16, " Gestion des intervenants ");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](17, "div", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](18, "a", 8);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](19, "Structures");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](20, "a", 8);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](21, "Supperviseurs");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](22, "li", 5);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](23, "a", 6);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](24, " Annalyse des don\xE9es ");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](25, "div", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](26, "a", 8);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](27, "Indicateurs");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](28, "a", 8);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](29, "Graphique");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](30, "a", 8);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](31, "Cartographie");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](32, "div", 9);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](33, "ul", 2);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](34, "li", 3);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementStart"](35, "a", 10);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????text"](36, " Connexion ");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????element"](37, "li", 3);

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????element"](38, "br");

            _angular_core__WEBPACK_IMPORTED_MODULE_0__["????element"](39, "router-outlet");
          }
        },
        directives: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterLinkActive"], _angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterLinkWithHref"], _angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterOutlet"]],
        styles: ["li[_ngcontent-%COMP%]   a[_ngcontent-%COMP%] {\n  color: black;\n}\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIi4uXFwuLlxcLi5cXGhlYWRlci5jb21wb25lbnQuc2NzcyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiQUFBQTtFQUNJLFlBQUE7QUFDSjs7QUFHQTs7O0VBQUEiLCJmaWxlIjoiaGVhZGVyLmNvbXBvbmVudC5zY3NzIiwic291cmNlc0NvbnRlbnQiOlsibGkgYXtcclxuICAgIGNvbG9yOiBibGFjaztcclxuXHJcbn1cclxuXHJcbi8qbmF2e1xyXG4gICAgYmFja2dyb3VuZC1jb2xvcjogIzAwNjZmZmI3O1xyXG5cclxufSovIl19 */"]
      });
      /***/
    },

    /***/
    "otNC":
    /*!**************************************************************!*\
      !*** ./src/app/details/detailcases/detailcases.component.ts ***!
      \**************************************************************/

    /*! exports provided: DetailcasesComponent */

    /***/
    function otNC(module, __webpack_exports__, __webpack_require__) {
      "use strict";

      __webpack_require__.r(__webpack_exports__);
      /* harmony export (binding) */


      __webpack_require__.d(__webpack_exports__, "DetailcasesComponent", function () {
        return DetailcasesComponent;
      });
      /* harmony import */


      var src_app_level_level__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
      /*! src/app/level/level */
      "rzJb");
      /* harmony import */


      var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
      /*! @angular/core */
      "fXoL");
      /* harmony import */


      var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
      /*! @angular/router */
      "tyNb");
      /* harmony import */


      var src_app_services_levelservice_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
      /*! src/app/services/levelservice.service */
      "uAHu");
      /* harmony import */


      var src_app_services_comortementalvalues_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
      /*! src/app/services/comortementalvalues.service */
      "N+0q");
      /* harmony import */


      var src_app_services_biomedicalevalues_service__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(
      /*! src/app/services/biomedicalevalues.service */
      "64Bt");
      /* harmony import */


      var src_app_services_structurevalues_service__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(
      /*! src/app/services/structurevalues.service */
      "Vqpu");
      /* harmony import */


      var _angular_common__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(
      /*! @angular/common */
      "ofXK");

      function DetailcasesComponent_dl_7_Template(rf, ctx) {
        if (rf & 1) {
          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](0, "dl", 13);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](1, "dt", 14);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](2, "Num\xE9ro d'identification");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](3, "dd", 15);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](4);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](5, "dt", 14);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](6, "Sexe");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](7, "dd", 15);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](8);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](9, "dt", 14);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](10, "Nationnalit\xE9");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](11, "dd", 15);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](12);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](13, "dt", 16);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](14, "Situation MAT");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](15, "dd", 15);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](16);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();
        }

        if (rf & 2) {
          var ctx_r0 = _angular_core__WEBPACK_IMPORTED_MODULE_1__["????nextContext"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](4);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](ctx_r0.indetification.numeroidentification);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](4);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate1"](" ", ctx_r0.indetification.sex, " ");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](4);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](ctx_r0.indetification.nationnalite);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](4);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](ctx_r0.indetification.situationmaretal);
        }
      }

      function DetailcasesComponent_tr_71_Template(rf, ctx) {
        if (rf & 1) {
          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](0, "tr");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](1, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](3, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](4);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](5, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](6);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](7, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](8);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](9, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](10);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](11, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](12);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](13, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](14);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](15, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](16);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](17, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](18);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](19, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](20);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](21, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](22);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](23, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](24);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](25, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](26);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](27, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](28);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](29, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](30);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](31, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](32);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](33, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](34);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](35, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](36, "button", 17);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????element"](37, "i", 18);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();
        }

        if (rf & 2) {
          var value_r4 = ctx.$implicit;

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r4.date_comp);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r4.entretienindivid);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r4.causerie);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r4.orientation);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r4.aide_social);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r4.dep_hp);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r4.outils_iec);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r4.outils_util);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r4.distribution);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r4.thems);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r4.participationGP);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r4.particioationRC);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r4.educationThe);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r4.perduedevue);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r4.distributionvideo);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r4.orientationversPTME);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r4.orientationVersSoin);
        }
      }

      function DetailcasesComponent_tr_149_Template(rf, ctx) {
        if (rf & 1) {
          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](0, "tr", 19);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](1, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](3, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](4);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](5, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](6);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](7, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](8);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](9, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](10);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](11, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](12);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](13, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](14);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](15, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](16);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](17, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](18);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](19, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](20);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](21, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](22);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](23, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](24);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](25, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](26);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](27, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](28);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](29, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](30);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](31, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](32);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](33, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](34);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](35, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](36);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](37, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](38);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](39, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](40);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](41, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](42);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](43, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](44);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](45, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](46);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();
        }

        if (rf & 2) {
          var value_r5 = ctx.$implicit;

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.dateIntervention);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.depistageVIH);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.resultat_depistage);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.action);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.depistagecta);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.resultatcta);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.mise_arv);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.date_mise_arv);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.pourquoi);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.depistageIST);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.depistageHBS);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.structure_depitage);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.resulatat_hp);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.hp_orient);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.soins_medicale);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.distributionpresev);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.preservatif);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.distributionGel);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.gels);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.distribution_arv);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.distribution_arv_prev);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.distribution_arv_ptme);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r5.autres);
        }
      }

      function DetailcasesComponent_tr_172_Template(rf, ctx) {
        if (rf & 1) {
          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](0, "tr");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](1, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](3, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](4);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](5, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](6);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](7, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](8);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](9, "td");

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](10);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();
        }

        if (rf & 2) {
          var value_r6 = ctx.$implicit;

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r6.date_intervention);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r6.appui_economique);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r6.appui_jurique);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r6.orientation);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](2);

          _angular_core__WEBPACK_IMPORTED_MODULE_1__["????textInterpolate"](value_r6.formation_specique);
        }
      }

      var DetailcasesComponent = /*#__PURE__*/function () {
        function DetailcasesComponent(route, levelservice, comportementaleValuesservice, biomedicalevalueservice, structurellevalueservice) {
          _classCallCheck(this, DetailcasesComponent);

          this.route = route;
          this.levelservice = levelservice;
          this.comportementaleValuesservice = comportementaleValuesservice;
          this.biomedicalevalueservice = biomedicalevalueservice;
          this.structurellevalueservice = structurellevalueservice;
          this.level = new src_app_level_level__WEBPACK_IMPORTED_MODULE_0__["Level"]();
        }

        _createClass(DetailcasesComponent, [{
          key: "ngOnInit",
          value: function ngOnInit() {
            var _this4 = this;

            this.levelId = parseInt(this.route.snapshot.paramMap.get('id'));
            console.log(this.levelId); //..........................................................................................

            this.levelservice.findByid(this.levelId).subscribe(function (data) {
              if (data) {
                _this4.level = data;
              }
            }); //..........................................................................................
            //........................ les valeurs de l'identification personnelle

            this.levelservice.getIdentification(this.levelId).subscribe(function (data) {
              if (data) {
                _this4.indetification = data;
              }
            }); //..........................................................................................
            // return la liste des comportementales values 

            this.comportementaleValuesservice.listcomportementalevalue(this.levelId).subscribe(function (value) {
              if (value) {
                _this4.comportementalValues = value;
              }
            }); //..........................................................................................
            // return la lsite des biomedicales values

            this.biomedicalevalueservice.listBiomedicaleVlues(this.levelId).subscribe(function (result) {
              if (result) {
                _this4.biomedicalevalues = result;
              }
            }); //......................................................................
            // return la liste des structurevalues  

            this.structurellevalueservice.ListStructurelleValue(this.levelId).subscribe(function (result) {
              if (result) {
                _this4.structurellevalues = result;
                console.log(".......*****....." + _this4.structurellevalues);
              }
            });
          }
        }]);

        return DetailcasesComponent;
      }();

      DetailcasesComponent.??fac = function DetailcasesComponent_Factory(t) {
        return new (t || DetailcasesComponent)(_angular_core__WEBPACK_IMPORTED_MODULE_1__["????directiveInject"](_angular_router__WEBPACK_IMPORTED_MODULE_2__["ActivatedRoute"]), _angular_core__WEBPACK_IMPORTED_MODULE_1__["????directiveInject"](src_app_services_levelservice_service__WEBPACK_IMPORTED_MODULE_3__["LevelserviceService"]), _angular_core__WEBPACK_IMPORTED_MODULE_1__["????directiveInject"](src_app_services_comortementalvalues_service__WEBPACK_IMPORTED_MODULE_4__["ComortementalvaluesService"]), _angular_core__WEBPACK_IMPORTED_MODULE_1__["????directiveInject"](src_app_services_biomedicalevalues_service__WEBPACK_IMPORTED_MODULE_5__["BiomedicalevaluesService"]), _angular_core__WEBPACK_IMPORTED_MODULE_1__["????directiveInject"](src_app_services_structurevalues_service__WEBPACK_IMPORTED_MODULE_6__["StructurevaluesService"]));
      };

      DetailcasesComponent.??cmp = _angular_core__WEBPACK_IMPORTED_MODULE_1__["????defineComponent"]({
        type: DetailcasesComponent,
        selectors: [["app-detailcases"]],
        decls: 174,
        vars: 4,
        consts: [[1, "container-fluid"], [1, "bg-light"], [1, "card"], [1, "card-body"], ["class", "row", 4, "ngIf"], [2, "overflow-x", "auto"], [1, "table-responsive-sm", "table-bordered"], [2, "white-space", "nowrap"], [4, "ngFor", "ngForOf"], [1, "table", "table-responsive", "table-sm", "table-bordered"], [1, "font-weight-light"], ["style", "margin-bottom: 10px;", 4, "ngFor", "ngForOf"], [1, "table-responsive-sm", "table-bordered", "text-center"], [1, "row"], [1, "col-sm-3"], [1, "col-sm-9"], [1, "col-sm-3", "text-truncate"], [1, "btn", "btn-xs", 2, "margin-right", "3px"], [1, "far", "fa-edit"], [2, "margin-bottom", "10px"]],
        template: function DetailcasesComponent_Template(rf, ctx) {
          if (rf & 1) {
            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](0, "div", 0);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????element"](1, "br");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](2, "h2", 1);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](3, "D\xE9tails des informations relatives \xE0 la collecte ");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](4, "div");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](5, "div", 2);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](6, "div", 3);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????template"](7, DetailcasesComponent_dl_7_Template, 17, 4, "dl", 4);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????element"](8, "br");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????element"](9, "br");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](10, "h6");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](11, "Actions Comportementales");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](12, "div", 5);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](13, "table", 6);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](14, "thead", 1);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](15, "tr");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](16, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](17, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](18, "Date d'intervention");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](19, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](20, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](21, "Entretien indi");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](22, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](23, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](24, "causerie");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](25, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](26, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](27, "d\xE9pistage vih");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](28, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](29, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](30, "Orientation vers les soins d'IST");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](31, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](32, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](33, "Orientation d\xE9pistage Hp");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](34, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](35, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](36, "Outils IEC");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](37, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](38, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](39, "Outils utilis\xE9s");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](40, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](41, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](42, "Distrubition IEC");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](43, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](44, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](45, "Th\xE8mes");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](46, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](47, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](48, "Participation au groupe de parole");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](49, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](50, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](51, "Participation au repas communautaires");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](52, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](53, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](54, "Education th\xE9rapeutique");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](55, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](56, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](57, "Perdue de vue retrouv\xE9");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](58, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](59, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](60, "Distibution de vid\xE9o sur r\xE9seaux sociaux");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](61, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](62, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](63, "Orientation vers la PTME");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](64, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](65, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](66, "Orientation vers les soins de la m\xE9decine g\xE9n\xE9rale");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](67, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](68, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](69, "Modifier");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](70, "tbody");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????template"](71, DetailcasesComponent_tr_71_Template, 38, 17, "tr", 8);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????element"](72, "br");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](73, "h6");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](74, "Actions Biomedicale");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](75, "div", 5);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](76, "table", 9);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](77, "thead", 1);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](78, "tr", 10);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](79, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](80, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](81, "Date d'intervention");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](82, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](83, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](84, "D\xE9pistage VIH");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](85, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](86, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](87, "Resultat depistage VIH");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](88, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](89, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](90, "Si positif quel action");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](91, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](92, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](93, "D\xE9pistage CTA");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](94, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](95, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](96, "Resultat CTA");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](97, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](98, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](99, "Mise sous ARV");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](100, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](101, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](102, "Date mise ARV");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](103, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](104, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](105, "Sinon mise ARV pourquoi");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](106, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](107, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](108, "D\xE9pistage IST");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](109, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](110, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](111, "D\xE9pistage HBS");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](112, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](113, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](114, "Structure d\xE9pistage");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](115, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](116, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](117, "Resultats test H\xE9p");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](118, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](119, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](120, "Si H\xE9p positif, la PC a t-il orient\xE9");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](121, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](122, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](123, "Soins m\xE9decine g\xE9n\xE9ral");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](124, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](125, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](126, "Distribution pr\xE9servatif");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](127, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](128, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](129, "Preservatifs");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](130, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](131, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](132, "Distribution Gel");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](133, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](134, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](135, "Gels");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](136, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](137, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](138, "Distribution ARV pour les soins (TaPs)");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](139, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](140, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](141, "Distritution ARV pour la pr\xE9vention(PrEp)");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](142, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](143, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](144, "Distribution des ARV pour la PTME");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](145, "th", 7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](146, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](147, "Autres intervention Biomedicale");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](148, "tbody");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????template"](149, DetailcasesComponent_tr_149_Template, 47, 23, "tr", 11);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????element"](150, "br");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](151, "h6");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](152, "Actions Structurelles");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](153, "table", 12);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](154, "thead", 1);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](155, "tr", 10);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](156, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](157, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](158, " Date d'intervention");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](159, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](160, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](161, " Appui Socio-\xE9conomique");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](162, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](163, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](164, " Appui juridique");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](165, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](166, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](167, " Orientation vers les strucures sp\xE9cialis\xE9es");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](168, "th");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](169, "small");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????text"](170, " Formation sp\xE9cifiques");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementStart"](171, "tbody");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????template"](172, DetailcasesComponent_tr_172_Template, 11, 5, "tr", 8);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????element"](173, "br");

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????elementEnd"]();
          }

          if (rf & 2) {
            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](7);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????property"]("ngIf", ctx.indetification);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](64);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????property"]("ngForOf", ctx.comportementalValues);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](78);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????property"]("ngForOf", ctx.biomedicalevalues);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????advance"](23);

            _angular_core__WEBPACK_IMPORTED_MODULE_1__["????property"]("ngForOf", ctx.structurellevalues);
          }
        },
        directives: [_angular_common__WEBPACK_IMPORTED_MODULE_7__["NgIf"], _angular_common__WEBPACK_IMPORTED_MODULE_7__["NgForOf"]],
        styles: [".val[_ngcontent-%COMP%]   thead[_ngcontent-%COMP%]   th[_ngcontent-%COMP%] {\n  font-size: 0.8em;\n  padding: 1px !important;\n  height: 50px;\n}\n\nh2[_ngcontent-%COMP%] {\n  text-align: center;\n  margin-bottom: 50px;\n}\n\nsmall[_ngcontent-%COMP%] {\n  margin: 2px;\n  font-weight: bold;\n  display: inline-table;\n}\n\ntable[_ngcontent-%COMP%] {\n  border-collapse: collapse;\n  border-spacing: 0;\n  width: 100%;\n  border: 1px solid #ddd;\n}\n\nth[_ngcontent-%COMP%], td[_ngcontent-%COMP%] {\n  text-align: left;\n  padding: 8px;\n}\n\n.theclasse[_ngcontent-%COMP%]   th[_ngcontent-%COMP%] {\n  white-space: nowrap;\n}\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIi4uXFwuLlxcLi5cXC4uXFxkZXRhaWxjYXNlcy5jb21wb25lbnQuc2NzcyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiQUFDSTtFQUNJLGdCQUFBO0VBQ0EsdUJBQUE7RUFDQSxZQUFBO0FBQVI7O0FBSUE7RUFDRSxrQkFBQTtFQUNBLG1CQUFBO0FBREY7O0FBSUE7RUFDQyxXQUFBO0VBQ0EsaUJBQUE7RUFDQSxxQkFBQTtBQUREOztBQUlBO0VBQ0UseUJBQUE7RUFDQSxpQkFBQTtFQUNBLFdBQUE7RUFDQSxzQkFBQTtBQURGOztBQUlBO0VBQ0UsZ0JBQUE7RUFDQSxZQUFBO0FBREY7O0FBSUE7RUFDRSxtQkFBQTtBQURGIiwiZmlsZSI6ImRldGFpbGNhc2VzLmNvbXBvbmVudC5zY3NzIiwic291cmNlc0NvbnRlbnQiOlsiLnZhbHtcclxuICAgIHRoZWFkIHRoIHtcclxuICAgICAgICBmb250LXNpemU6IDAuOGVtO1xyXG4gICAgICAgIHBhZGRpbmc6IDFweCAhaW1wb3J0YW50O1xyXG4gICAgICAgIGhlaWdodDogNTBweDtcclxuICAgICAgfVxyXG59IFxyXG5cclxuaDJ7XHJcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xyXG4gIG1hcmdpbi1ib3R0b206IDUwcHg7XHJcbn1cclxuXHJcbnNtYWxse1xyXG4gbWFyZ2luOiAycHg7XHJcbiBmb250LXdlaWdodDogYm9sZDtcclxuIGRpc3BsYXk6IGlubGluZS10YWJsZTtcclxufSBcclxuXHJcbnRhYmxlIHtcclxuICBib3JkZXItY29sbGFwc2U6IGNvbGxhcHNlO1xyXG4gIGJvcmRlci1zcGFjaW5nOiAwO1xyXG4gIHdpZHRoOiAxMDAlO1xyXG4gIGJvcmRlcjogMXB4IHNvbGlkICNkZGQ7XHJcbn1cclxuXHJcbnRoLCB0ZCB7XHJcbiAgdGV4dC1hbGlnbjogbGVmdDtcclxuICBwYWRkaW5nOiA4cHg7XHJcbn1cclxuXHJcbi50aGVjbGFzc2UgdGh7XHJcbiAgd2hpdGUtc3BhY2U6IG5vd3JhcDtcclxufVxyXG5cclxuXHJcbiAiXX0= */"]
      });
      /***/
    },

    /***/
    "rzJb":
    /*!********************************!*\
      !*** ./src/app/level/level.ts ***!
      \********************************/

    /*! exports provided: Level */

    /***/
    function rzJb(module, __webpack_exports__, __webpack_require__) {
      "use strict";

      __webpack_require__.r(__webpack_exports__);
      /* harmony export (binding) */


      __webpack_require__.d(__webpack_exports__, "Level", function () {
        return Level;
      });

      var Level = function Level() {
        _classCallCheck(this, Level);
      };
      /***/

    },

    /***/
    "uAHu":
    /*!**************************************************!*\
      !*** ./src/app/services/levelservice.service.ts ***!
      \**************************************************/

    /*! exports provided: LevelserviceService */

    /***/
    function uAHu(module, __webpack_exports__, __webpack_require__) {
      "use strict";

      __webpack_require__.r(__webpack_exports__);
      /* harmony export (binding) */


      __webpack_require__.d(__webpack_exports__, "LevelserviceService", function () {
        return LevelserviceService;
      });
      /* harmony import */


      var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
      /*! @angular/core */
      "fXoL");
      /* harmony import */


      var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
      /*! @angular/common/http */
      "tk/3");

      var LevelserviceService = /*#__PURE__*/function () {
        function LevelserviceService(http) {
          _classCallCheck(this, LevelserviceService);

          this.http = http;
          this.host = "http://localhost:8080";
        }

        _createClass(LevelserviceService, [{
          key: "alllevels",
          value: function alllevels() {
            return this.http.get("http://localhost:8080/levels/all");
          }
        }, {
          key: "levleslines",
          value: function levleslines() {
            return this.http.get(this.host + "/alllevels/levels");
          }
        }, {
          key: "findByid",
          value: function findByid(idlevel) {
            return this.http.get(this.host + "/levels/findById/" + idlevel);
          } //...........list des valeurs d'intification.............................

        }, {
          key: "getIdentification",
          value: function getIdentification(idlevel) {
            return this.http.get(this.host + "/indentPersonnelle/getIdentification/" + idlevel);
          } ///............recherche all levels par dates dans une intervalle.......

        }, {
          key: "rechercheParDates",
          value: function rechercheParDates(startdate, enddate) {
            return this.http.get(this.host + "/alllevels/findByDate/" + startdate + "/" + startdate);
          }
        }]);

        return LevelserviceService;
      }();

      LevelserviceService.??fac = function LevelserviceService_Factory(t) {
        return new (t || LevelserviceService)(_angular_core__WEBPACK_IMPORTED_MODULE_0__["????inject"](_angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"]));
      };

      LevelserviceService.??prov = _angular_core__WEBPACK_IMPORTED_MODULE_0__["????defineInjectable"]({
        token: LevelserviceService,
        factory: LevelserviceService.??fac,
        providedIn: 'root'
      });
      /***/
    },

    /***/
    "vY5A":
    /*!***************************************!*\
      !*** ./src/app/app-routing.module.ts ***!
      \***************************************/

    /*! exports provided: AppRoutingModule */

    /***/
    function vY5A(module, __webpack_exports__, __webpack_require__) {
      "use strict";

      __webpack_require__.r(__webpack_exports__);
      /* harmony export (binding) */


      __webpack_require__.d(__webpack_exports__, "AppRoutingModule", function () {
        return AppRoutingModule;
      });
      /* harmony import */


      var _angular_router__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
      /*! @angular/router */
      "tyNb");
      /* harmony import */


      var src_app_details_detailcases_detailcases_component__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
      /*! src/app/details/detailcases/detailcases.component */
      "otNC");
      /* harmony import */


      var src_app_recherche_recherche_component__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
      /*! src/app/recherche/recherche.component */
      "0epC");
      /* harmony import */


      var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
      /*! @angular/core */
      "fXoL");

      var routes = [{
        path: '',
        component: src_app_recherche_recherche_component__WEBPACK_IMPORTED_MODULE_2__["RechercheComponent"]
      }, {
        path: "details/:id",
        component: src_app_details_detailcases_detailcases_component__WEBPACK_IMPORTED_MODULE_1__["DetailcasesComponent"]
      }];

      var AppRoutingModule = function AppRoutingModule() {
        _classCallCheck(this, AppRoutingModule);
      };

      AppRoutingModule.??fac = function AppRoutingModule_Factory(t) {
        return new (t || AppRoutingModule)();
      };

      AppRoutingModule.??mod = _angular_core__WEBPACK_IMPORTED_MODULE_3__["????defineNgModule"]({
        type: AppRoutingModule
      });
      AppRoutingModule.??inj = _angular_core__WEBPACK_IMPORTED_MODULE_3__["????defineInjector"]({
        imports: [[_angular_router__WEBPACK_IMPORTED_MODULE_0__["RouterModule"].forRoot(routes, {
          relativeLinkResolution: 'legacy'
        })], _angular_router__WEBPACK_IMPORTED_MODULE_0__["RouterModule"]]
      });

      (function () {
        (typeof ngJitMode === "undefined" || ngJitMode) && _angular_core__WEBPACK_IMPORTED_MODULE_3__["????setNgModuleScope"](AppRoutingModule, {
          imports: [_angular_router__WEBPACK_IMPORTED_MODULE_0__["RouterModule"]],
          exports: [_angular_router__WEBPACK_IMPORTED_MODULE_0__["RouterModule"]]
        });
      })();
      /***/

    },

    /***/
    "zUnb":
    /*!*********************!*\
      !*** ./src/main.ts ***!
      \*********************/

    /*! no exports provided */

    /***/
    function zUnb(module, __webpack_exports__, __webpack_require__) {
      "use strict";

      __webpack_require__.r(__webpack_exports__);
      /* harmony import */


      var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
      /*! @angular/platform-browser */
      "jhN1");
      /* harmony import */


      var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
      /*! @angular/core */
      "fXoL");
      /* harmony import */


      var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
      /*! ./app/app.module */
      "ZAI4");
      /* harmony import */


      var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
      /*! ./environments/environment */
      "AytR");

      if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["enableProdMode"])();
      }

      _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["platformBrowser"]().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])["catch"](function (err) {
        return console.error(err);
      });
      /***/

    },

    /***/
    "zn8P":
    /*!******************************************************!*\
      !*** ./$$_lazy_route_resource lazy namespace object ***!
      \******************************************************/

    /*! no static exports found */

    /***/
    function zn8P(module, exports) {
      function webpackEmptyAsyncContext(req) {
        // Here Promise.resolve().then() is used instead of new Promise() to prevent
        // uncaught exception popping up in devtools
        return Promise.resolve().then(function () {
          var e = new Error("Cannot find module '" + req + "'");
          e.code = 'MODULE_NOT_FOUND';
          throw e;
        });
      }

      webpackEmptyAsyncContext.keys = function () {
        return [];
      };

      webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
      module.exports = webpackEmptyAsyncContext;
      webpackEmptyAsyncContext.id = "zn8P";
      /***/
    }
  }, [[0, "runtime", "vendor"]]]);
})();
//# sourceMappingURL=main-es5.js.map